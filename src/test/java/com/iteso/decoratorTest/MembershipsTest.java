package com.iteso.decoratorTest;

import com.iteso.decorator.BaseMembership;
import com.iteso.decorator.Membership;
import com.iteso.decorator.benefits.CloudStorage;
import com.iteso.decorator.benefits.GoldMembership;
import com.iteso.decorator.benefits.UltimateMembership;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

public class MembershipsTest{

    /**Attributes membershipTest. */
    Membership membership;
    ArrayList benefits;

    @Before
    public void setUp(){
        membership = new BaseMembership();
        benefits = new ArrayList();
    }

    @Test
    public void createBaseMembershipTest(){
        Assert.assertEquals(null, membership.getAllBenefits());
        Assert.assertEquals("Membership", membership.getDescription());
    }

    @Test
    public void createGoldMembershipTest(){
        benefits.add("Type: GOLD");
        benefits.add("Cloud Storage");
        benefits.add("Support");
        membership = new GoldMembership(membership);
        //Assert.assertEquals(benefits, membership.getAllBenefits());
        Assert.assertEquals("Membership + Type: GOLD + Cloud Storage = 1000 GB + Support", membership.getDescription());
    }

    @Test
    public void createUltimateMembershipTest(){
        benefits.add("Type: ULTIMATE");
        benefits.add("Cloud Storage");
        benefits.add("Support");
        benefits.add("Unlimited Devices");
        benefits.add("Download Capacity");
        membership = new UltimateMembership(membership);
        Assert.assertEquals(benefits, membership.getAllBenefits());
        Assert.assertEquals("Membership + Type: GOLD + Cloud Storage = 1000 GB + Support", membership.getDescription());
    }


}
