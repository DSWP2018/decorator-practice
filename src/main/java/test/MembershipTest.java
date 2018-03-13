package test;

import com.iteso.decorator.Membership;
import com.iteso.decorator.decorators.Free;
import com.iteso.decorator.decorators.Gold;
import com.iteso.decorator.decorators.Ultimate;
import com.iteso.decorator.memberships.BaseMembership;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;


public class MembershipTest {

    Membership membership;

    @Before
    public void setUp(){
        membership = new BaseMembership();
    }

    //@Ignore
    @Test
    public void freeMembershipTest(){
        membership = new Free(membership);
        Assert.assertEquals(0, membership.getCost(), 0.01);
    }


    //@Ignore
    @Test
    public void goldMembershipTest(){
        membership = new Gold(membership);
        Assert.assertEquals(599, membership.getCost(), 0.001);
    }


    //@Ignore
    @Test
    public void ultimateMembershipTest(){
        membership = new Ultimate(membership);
        Assert.assertEquals(1299, membership.getCost(), 0.01);
    }

}
