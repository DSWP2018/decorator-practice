import com.iteso.decorator.Membership;

import java.util.ArrayList;

/**
 * Clase base
 * permite utilizar la estructura
 */
public class BaseMembership extends Membership {
    /**
     * Costo de la membresía
     */
    private final double cost=0;

    public BaseMembership() {
        this.setCost(cost);
    }

    /**
     * Agrega un beneficio nuevo
     * @param newBenefit
     */
    public BaseMembership(Membership newBenefit) {
        this.setBenefit(newBenefit);
    }
}
