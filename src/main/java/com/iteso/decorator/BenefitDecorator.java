package com.iteso.decorator;

/**
 * created by Federico Ibarra.
 */
public abstract class BenefitDecorator extends Membership {

    /**
     * Base membership.
     */
    private Membership membership;

    /**
     * Added description.
     */
    private String description;

    /**
     * @param mem membership.
     */
    public final void setMembership(final Membership mem) {
        membership = mem;
    }

    /**
     * @return membership.
     */
    public final Membership getMembership() {
        return membership;
    }

    /**
     * @param des description.
     */
    public final void setDesc(final String des) {
        description = des;
    }

    /**
     * @return description.
     */
    public final String getDesc() {
        return description;
    }


}
