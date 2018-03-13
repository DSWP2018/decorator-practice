package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

/**Benefit Download Capacity. /*
 *
 */
public class DownloadCapacity extends Benefits {

    /**Information of the benefit. */

    private final String downloadCapacityName = "Download Capacity"; /**
     /**Name. */
    private final double downloadCapacityCost = 170.00; /** Cost. */

    private final int capacity = 32;


    /**Constructor DownloadCapacity. /*
     *
     * @param membership victim of decoration object.
     */
    public DownloadCapacity(final Membership membership) {
        setAllBenefits(membership.getAllBenefits());
        setNewDescription(membership.getDescription());
        setCost(membership.getCost());

        setCost(downloadCapacityCost);
        setDescription(getBenefitDescription());
        setBenefits(downloadCapacityName);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public final String getBenefitDescription() {
        return "+ " + downloadCapacityName + " = " + capacity;
    }

}
