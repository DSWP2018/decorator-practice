package com.iteso.decorator;

import com.iteso.decorator.memberships.FreeMembership;
import com.iteso.decorator.memberships.GoldMembership;
import com.iteso.decorator.memberships.UltimateMembership;
/**Main. */
public class Main {
    /**Main. */
     /** * @param args  */
    public static  void main(final String[] args) {
        new Main().run(args);
    }
    /**Do te work.
     * @param args  */
    private void run(final String[] args) {
        //creacion del basemebership
        Membership base = new BaseMembership();
        //test para ver que se guarda
        System.out.println(base.getAllBenefits().toString());
        //decorator
        base = new GoldMembership(base);
        //imprimir los beneficios o la lista
        System.out.println(base.getAllBenefits().toString()
                + "\n Membership: " + base.getDescription());
        Membership base2 = new BaseMembership();
        //Al chile no se por que guarda los datos del
        //anterior si son instancias diferentes
        //por eso puse el clear para borrrar pero no sé por qué.
        base2.getAllBenefits().clear();
        base2 = new FreeMembership(base2);
        System.out.println(base2.getAllBenefits().toString()
                + "\n Membership: " + base2.getDescription());

        Membership base3 = new BaseMembership();
        base3.getAllBenefits().clear();
        base3 = new UltimateMembership(base3);
        System.out.println(base3.getAllBenefits().toString()
                + "\n Membership: " + base3.getDescription());

    }
}
