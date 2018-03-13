package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

/**
 * Created by rvillalobos on 4/14/16.
 */
public class FreeMembership extends Membership {

    /**
     * Constructor. Pone valores default.
     * Incluye éstos en el arrayList de beneficios.
     */
    public FreeMembership() {
        setCost(0);
        setDescription("Free account");

        setBenefits("0");
        setBenefits("Free account");
    }

}

