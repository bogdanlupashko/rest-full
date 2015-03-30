package org.bl.rest.hib.behavior;

import org.bl.rest.hib.vgs.*;

import java.sql.SQLException;
import java.util.List;


/**
 * Created by blupashko on 25.03.2015.
 */
public interface AffiliateBehavior {
    public void addAffiliate(Affiliate affiliate) throws SQLException;
    public void updateAffiliate(Affiliate affiliate) throws SQLException;
    public Affiliate getAffiliateById(Integer id) throws SQLException;
    public List getAllAffiliate() throws SQLException;
    public void deleteAffiliate(Affiliate affiliate) throws SQLException;

}
