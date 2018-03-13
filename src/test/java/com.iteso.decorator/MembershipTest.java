package com.iteso.decorator;

import com.iteso.decorator.memberships.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class MembershipTest {
    Membership m;

    @Before
    public void setUp(){
        m = new MyMembership();
    }

    @Test
    public void freeTest(){
        m = new FreeMembership(m);
        Assert.assertEquals(0, m.getCost(), 0.01);
    }

    @Test
    public void goldTest(){
        m = new GoldMembership(m);
        Assert.assertEquals(599, m.getCost(), 0.001);
    }

    @Test
    public void ultimateTest(){
        m = new UltimateMembership(m);
        Assert.assertEquals(1299, m.getCost(), 0.01);
    }
}
