package com.iteso.decorator;

import com.iteso.decorator.decorator_benefits.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BaseMembershipTest {
    Membership membership;

    @Before
    public void setUp(){
        membership = new BaseMembership();
    }

    @Test
    public void cloudStorageDescription(){
        String expected = "Account with: Cloud Storeage = 400.0, ";
        membership = new CloudStorage(membership, 400);
        assertEquals(expected, membership.getDescription());
    }

    @Test
    public void cloudStorageCost(){
        double expected = 8.0;
        membership = new CloudStorage(membership, 400);
        assertTrue(expected == membership.getCost());
    }

    @Test
    public void simultaneousLoginsDescription(){
        String expected = "Account with: Simultaneous Logins = 2.0, ";
        membership = new SimultaneousLogins(membership, 2);
        assertEquals(expected, membership.getDescription());
    }

    @Test
    public void simultaneousLoginsCost(){
        double expected = 0.05;
        membership = new SimultaneousLogins(membership, 5);
        assertTrue(expected == membership.getCost());
    }

    @Test
    public void unlimitedDevicesDescription(){
        String expected = "Account with: Unlimited Devices = Yes, ";
        membership = new UnlimitedDevices(membership, true);
        assertEquals(expected, membership.getDescription());
    }

    @Test
    public void unlimitedDevicesLoginsCost(){
        double expected = 0.06;
        membership = new UnlimitedDevices(membership, true);
        assertTrue(expected == membership.getCost());
    }

    @Test
    public void allowedDevicesDescription(){
        String expected = "Account with: Allowed Devices = 3.0, ";
        membership = new AllowedDevices(membership, 3);
        assertEquals(expected, membership.getDescription());
    }

    @Test
    public void allowedDevicesLoginsCost(){
        double expected = 0.09;
        membership = new AllowedDevices(membership, 3);
        assertTrue(expected == membership.getCost());
    }

    @Test
    public void downloadCapacityDescription(){
        String expected = "Account with: Download Capacity = 1500.0, ";
        membership = new DownloadCapacity(membership, 1500);
        assertEquals(expected, membership.getDescription());
    }

    @Test
    public void downloadCapacityLoginsCost(){
        double expected = 1.5;
        membership = new DownloadCapacity(membership, 1500);
        assertTrue(expected == membership.getCost());
    }

    @Test
    public void supportDescription(){
        String expected = "Account with: Support = Yes, ";
        membership = new Support(membership, true);
        assertEquals(expected, membership.getDescription());
    }

    @Test
    public void supportCost(){
        double expected = 0.08;
        membership = new Support(membership, true);
        assertTrue(expected == membership.getCost());
    }

    @Test
    public void supportCoverageDescription(){
        String expected = "Account with: Support Coverage = Hardware, ";
        membership = new SupportCoverage(membership, "Hardware");
        assertEquals(expected, membership.getDescription());
    }

    @Test
    public void supportCoverageCost(){
        double expected = 0.02;
        membership = new SupportCoverage(membership, "Hardware");
        assertTrue(expected == membership.getCost());
    }

    @Test
    public void combinationOfBenefitsDescription(){
        String expected = "Account with: Allowed Devices = 4.0, Cloud Storeage = 400.0, Unlimited Devices = Yes, Support Coverage = Hardware, ";

        membership = new AllowedDevices(membership, 4);
        membership = new CloudStorage(membership, 400);
        membership = new UnlimitedDevices(membership, true);
        membership = new SupportCoverage(membership, "Hardware");

        assertEquals(expected, membership.getDescription());
    }

    @Test
    public void combinationOfBenefitsCost(){
        double expected = 10.2;

        membership = new AllowedDevices(membership, 4);
        membership = new CloudStorage(membership, 400);
        membership = new DownloadCapacity(membership, 2000);
        membership = new UnlimitedDevices(membership, true);
        membership = new SupportCoverage(membership, "Hardware");

        assertTrue(expected == membership.getCost());
    }
}
