package com.iteso.decorator;

public abstract class Benefits extends Membership {

    private Membership membership;

    public abstract String getDescription();
    public  abstract int getCost();

    public void setMembership(Membership membershi){
        this.membership = membershi;
    }

    public Membership getMembership() {
        return this.membership;
    }
}

