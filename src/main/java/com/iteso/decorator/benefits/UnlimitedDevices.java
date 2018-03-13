package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

/** Benefit UnlimitedDevices. /*
 *
 */
public class UnlimitedDevices extends Benefits {

    /**Information of the benefit. */
    private final String unlimitedDevicesName = "Unlimited Devices"; /**
     Name. */
    private final double unlimitedDevicesCost = 200.00; /** Cost. */


    /**Constructor UnlimitedDevices. /*
     *
     * @param membership victim of decoration.
     */
    public UnlimitedDevices(final Membership membership) {
        setAllBenefits(membership.getAllBenefits());
        setNewDescription(membership.getDescription());
        setCost(membership.getCost());

        setCost(unlimitedDevicesCost);
        setDescription(getBenefitDescription());
        setBenefits(unlimitedDevicesName);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public final String getBenefitDescription() {
        return "+ " + unlimitedDevicesName;
    }

}
