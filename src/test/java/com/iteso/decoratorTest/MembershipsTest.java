package com.iteso.decoratorTest;

import com.iteso.decorator.BaseMembership;
import com.iteso.decorator.Membership;
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
        Assert.assertEquals(benefits, membership.getAllBenefits());
        Assert.assertEquals("Membership", membership.getDescription());
    }

    @Test
    public void createGoldMembershipTest(){
        benefits.add("Cloud Storage");
        benefits.add("Support");
        benefits.add("Type: GOLD");
        membership = new GoldMembership(membership);
        Assert.assertEquals(benefits, membership.getAllBenefits());
        Assert.assertEquals("Membership + Cloud Storage = 1000 GB + Support + Type: GOLD", membership.getDescription());
        Assert.assertEquals(250.00, membership.getCost(), 0.0);
    }

    @Test
    public void createUltimateMembershipTest(){
        benefits.add("Cloud Storage");
        benefits.add("Support");
        benefits.add("Unlimited Devices");
        benefits.add("Download Capacity");
        benefits.add("Type: ULTIMATE");
        membership = new UltimateMembership(membership);
        Assert.assertEquals(benefits, membership.getAllBenefits());
        Assert.assertEquals("Membership + Cloud Storage = 1000 GB + Support + Unlimited Devices " +
                "+ Download Capacity = 32 + Type: ULTIMATE", membership.getDescription());
        Assert.assertEquals(620.00, membership.getCost(), 0.0);
    }


}
