package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

/** Benefit UnlimitedDevices. /*
 *
 */
public class UnlimitedDevices extends Benefits {

    /**Information of the benefit. */
    private final String UNLIMITED_DEVICES_NAME = "Unlimited Devices"; /**Name. */
    private final double UNLIMITED_DEVICES_COST = 200.00; /** Cost. */


    /**Constructor UnlimitedDevices. /*
     *
     * @param membership
     */
    public UnlimitedDevices(Membership membership){
        setAllBenefits(membership.getAllBenefits());
        setNewDescription(membership.getDescription());
        setCost(membership.getCost());

        setCost(UNLIMITED_DEVICES_COST);
        setDescription(getBenefitDescription());
        setBenefits(UNLIMITED_DEVICES_NAME);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public String getBenefitDescription(){
        return "+ " + UNLIMITED_DEVICES_NAME;
    }

}
