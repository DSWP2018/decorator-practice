package com.iteso.decorator;

import com.iteso.decorator.MembershipBenefits.AllowedDevices;
import com.iteso.decorator.MembershipBenefits.CloudStorage;
import com.iteso.decorator.memberships.FreeMembership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AllowedDevicesTests {

    AllowedDevices allowedDevices;
    FreeMembership freeMembership = new FreeMembership();

    @Before
    public void setUp() {

        allowedDevices = new AllowedDevices(freeMembership);

    }

    @Test
    public void addAllowedDevices() {
        assertEquals(70, freeMembership.getCost(), 0.0f);
    }

}

