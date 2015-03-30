package org.bl.rest.hib.implementation;

import org.bl.rest.hib.behavior.AffiliateBehavior;
import org.bl.rest.hib.util.Connector;
import org.bl.rest.hib.vgs.Affiliate;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by blupashko on 25.03.2015.
 */
public class AffiliateBehaviorImplementation implements AffiliateBehavior {
    @Override
    public void addAffiliate(Affiliate affiliate) throws SQLException {
        Session session = null;
        try{
            session = Connector.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(affiliate);
            session.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }

    }

    @Override
    public void updateAffiliate(Affiliate affiliate) throws SQLException {
        Session session = null;
        try{
            session = Connector.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(affiliate);
            session.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }

    }

    @Override
    public Affiliate getAffiliateById(Integer id) throws SQLException {
        Session session = null;
        Affiliate affiliate = null;
        try{
            session = Connector.getSessionFactory().openSession();
            affiliate = (Affiliate) session.load(Affiliate.class, id);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return  affiliate;
    }

    @Override
    public List getAllAffiliate() throws SQLException {
        Session session = null;
        List<Affiliate> affiliates = new ArrayList<Affiliate>();
        try{
            session = Connector.getSessionFactory().openSession();
            affiliates = session.createCriteria(Affiliate.class).list();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return  affiliates;
    }

    @Override
    public void deleteAffiliate(Affiliate affiliate) throws SQLException {
        Session session = null;
        try{
            session = Connector.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(affiliate);
            session.getTransaction().commit();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()){
                session.close();
            }
        }
    }
}
