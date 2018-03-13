package com.iteso.decoratorTest;

import com.iteso.decorator.BaseMembership;
import com.iteso.decorator.Membership;
import com.iteso.decorator.benefits.CloudStorage;
import com.iteso.decorator.benefits.GoldMembership;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

public class MembershipsTest{

    /**Attributes membershipTest. */
    Membership membership;

    @Before
    public void setUp(){
        membership = new BaseMembership();
    }

    @Test
    public void createCloudStorage(){
        //membership = new CloudStorage(membership);
        Assert.assertEquals("Membership + TYPE = BASE", membership.getDescription());
    }
}
