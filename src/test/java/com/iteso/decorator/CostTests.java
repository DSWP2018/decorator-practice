package com.iteso.decorator;

import com.iteso.decorator.MembershipBenefits.*;
import com.iteso.decorator.memberships.FreeMembership;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CostTests {

    AllowedDevices allowedDevices;
    CloudStorage cloudStorage;
    DownloadCapacity downloadCapacity;
    SimultaneousLogins simultaneousLogins;
    Support support;
    FreeMembership freeMembership = new FreeMembership();

    @Before
    public void setUp() {

    }

    @Test
    public void addBenefits() {
        allowedDevices      = new AllowedDevices(freeMembership);
        assertEquals(70, freeMembership.getCost(), 0.0f);

        cloudStorage        = new CloudStorage(freeMembership);
        assertEquals(125, freeMembership.getCost(), 0.0f);

        downloadCapacity    = new DownloadCapacity(freeMembership);
        assertEquals(225, freeMembership.getCost(), 0.0f);

        simultaneousLogins  = new SimultaneousLogins(freeMembership);
        assertEquals(255, freeMembership.getCost(), 0.0f);

        support             = new Support(freeMembership);
        assertEquals(305, freeMembership.getCost(), 0.0f);

        //benefits.toString();
    }

}

