package com.iteso.decorator.memberships.membersUT;

import com.iteso.decorator.memberships.memberships.GoldMembership;
import com.iteso.decorator.memberships.memberships.Membership;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GoldUT {
    Membership gold;
    Membership cost;

    @Before
    public void setUp{

        cost = mock(Membership.class);
        gold = new GoldMembership();
    }

    @Test
    public void testCost(){
            Assert.assertEquals(15, cost.getCost());
    }

}
