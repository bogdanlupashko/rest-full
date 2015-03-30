package org.bl.rest.hib.factory;

/**
 * Created by blupashko on 25.03.2015.
 */
import org.bl.rest.hib.behavior.AffiliateBehavior;
import org.bl.rest.hib.implementation.AffiliateBehaviorImplementation;


public class Factory {
    private static AffiliateBehavior affiliateBehavior = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public AffiliateBehavior getAffiliateBehavior(){
        if (affiliateBehavior == null){
            affiliateBehavior = new AffiliateBehaviorImplementation();
        }
        return affiliateBehavior;
    }
}
