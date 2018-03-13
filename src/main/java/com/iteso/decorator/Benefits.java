package com.iteso.decorator;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

public abstract class Benefits extends Membership
{
    private final Membership Membership;


    public Benefits(Membership membership)
    {

        Membership = membership;

    }
}
