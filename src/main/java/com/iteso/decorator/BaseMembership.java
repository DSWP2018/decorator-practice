package com.iteso.decorator;

/**Clase abstracta. */
public class BaseMembership extends Membership {
    /**Declarar variables. */
    private static final Integer Z_O = 1;

    /**Constructor. */
    public BaseMembership() {
        setBenefits();
        //System.out.print("hi");
    }

    @Override
    public final String getDescription() {
        return "";
    }

    @Override
    /**Setear. */
    public final void setBenefits() {
        getAllBenefits().add(Z_O);
    }


}
