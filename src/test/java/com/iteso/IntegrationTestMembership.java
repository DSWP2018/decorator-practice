package test.java.com.iteso;

import com.iteso.decorator.Membership;
import com.iteso.decorator.memberships.BaseMembership;
import com.iteso.decorator.memberships.GoldMembership;
import com.iteso.decorator.memberships.UltimateMembership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class IntegrationTestMembership {
    Membership membresia;

    @Before
    public void setUp() {
        membresia = new BaseMembership();
    }

    @Test
    public void testCompleto() {
        System.out.println(membresia.getAllBenefits());

        membresia = new GoldMembership(membresia);
        System.out.println(membresia.getAllBenefits());

        membresia = new UltimateMembership(membresia);
        System.out.println(membresia.getAllBenefits());
    }
}
