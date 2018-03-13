package com.iteso.decorator;

import net.sf.saxon.expr.Component;

public abstract class Benefits extends Membership{

    Membership membership;

    public Benefits(final Membership membership){
        this.membership = membership;
    }

}
