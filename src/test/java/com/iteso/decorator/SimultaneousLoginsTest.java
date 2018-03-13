package com.iteso.decorator;

import com.iteso.decorator.MembershipBenefits.SimultaneousLogins;
import com.iteso.decorator.memberships.FreeMembership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimultaneousLoginsTest {

    SimultaneousLogins simultaneousLogins;
    FreeMembership freeMembership = new FreeMembership();

    @Before
    public void setUp() {

        simultaneousLogins = new SimultaneousLogins(freeMembership);

    }

    @Test
    public void addSimultaneousLogins() {
        assertEquals(30, freeMembership.getCost(), 0.0f);


    }

}

