package com.iteso.decorator;
/**Abtract benefits. */
public abstract class Benefits extends Membership {
    /**Atributos. */
    private Membership membership; /**Member to decorate. */
    /**Get description abstract.
     * @return String */
    public abstract String getDescription();
    /**@return int. */
    public abstract int getCost(); /**Cost.*/
    /**Set membership.
     * @param membershi */
    public final void setMembership(final Membership membershi) {
        this.membership = membershi;
    }
    /**getMembership.
     * @return Membership.  */
    public final Membership getMembership() {
        return this.membership;
    }
}

