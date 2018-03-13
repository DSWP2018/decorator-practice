package com.iteso.decorator;

import com.iteso.decorator.MembershipBenefits.CloudStorage;
import com.iteso.decorator.memberships.FreeMembership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CloudStorageTest {

    CloudStorage cloudStorage;
    FreeMembership freeMembership = new FreeMembership();

    @Before
    public void setUp() {

        cloudStorage = new CloudStorage(freeMembership);

    }

    @Test
    public void addCloudStorage() {
        assertEquals(55, freeMembership.getCost(), 0.0f);
    }

}

