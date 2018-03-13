package com.iteso.decorator;
/**
 *
 */
public abstract class Benefits extends Membership {

    /*
     *
     */
    Membership membership;

    /**
     *
     * @param mem
     */
    public void setMembership(Membership mem){
        membership = mem;
    }

    /**
     *
     * @return
     */
    public Membership getMembership(){
        return membership;
    }



}
