package com.iteso.decorator;

import com.iteso.decorator.MembershipBenefits.Support;
import com.iteso.decorator.memberships.FreeMembership;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SupportTest {

    Support support;
    FreeMembership freeMembership = new FreeMembership();

    @Before
    public void setUp() {

        support = new Support(freeMembership);

    }

    @Test
    public void addSupport() {
        assertEquals(50, freeMembership.getCost(), 0.0f);


    }

}

