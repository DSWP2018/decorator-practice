package com.iteso.decorator.memberships;
/**
 * */
import com.iteso.decorator.Membership;
import java.util.ArrayList;
/**
 * */
public abstract class Benefits extends Membership {
    protected Membership membership;

    public Benefits( final Membership membership1 ) {
        membership = membership1;
    }
}
