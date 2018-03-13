package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

public abstract class Benefits extends Membership {
    protected Membership membership;

    public Benefits( final Membership mem ) {
        membership = mem;
    }
}
