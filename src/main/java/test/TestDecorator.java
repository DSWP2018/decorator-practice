package test;

import com.iteso.decorator.BaseMembership;
import com.iteso.decorator.Membership;
import com.iteso.decorator.memberships.GoldMembership;

/**
 *
 */
public class TestDecorator {

    /**
     *
     * @param args basic args
     */
    private static void main(final String... args) {
        Membership base = new BaseMembership();

        System.out.println("***" + base.getMembershipDescription()
        + "***");
        System.out.println("Cost: "
                + base.getMembershipCost());

        System.out.println(base.getAllBenefits().toString());

        base = new GoldMembership(base);
        System.out.println("***" + base.getMembershipDescription()
                + "***");
        System.out.println("Cost: "
                + base.getMembershipCost());

        System.out.println(base.getAllBenefits().toString());

    }
}
