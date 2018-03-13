package test;

import com.iteso.decorator.BaseMembership;
import com.iteso.decorator.Membership;
import com.iteso.decorator.memberships.UltimateMembership;
import org.junit.jupiter.api.Test;


public class MembershipTest {


    @Test
    public void getCost() {
        Membership base = new BaseMembership();

        System.out.println( base.getDescription());
        System.out.println("Cost: "
                + base.getCost());

        base = new UltimateMembership(base);
        System.out.println(base.getDescription());
        System.out.println("Cost: "
                + base.getCost());

    }
}