package com.iteso.decorator;

import com.iteso.decorator.MembershipBenefits.DownloadCapacity;
import com.iteso.decorator.memberships.FreeMembership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DownloadCapacityTest {

    DownloadCapacity downloadCapacity;
    FreeMembership freeMembership = new FreeMembership();

    @Before
    public void setUp() {

        downloadCapacity = new DownloadCapacity(freeMembership);

    }

    @Test
    public void addDownloadCapacity() {
        assertEquals(100, freeMembership.getCost(), 0.0f);
    }

}

