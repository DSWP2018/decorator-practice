package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

/**Class CloudStorage. /*
 *
 */
public class CloudStorage extends Benefits {

    /**Information of the benefit. */
    private final String cloudStorageName = "Cloud Storage"; /**Name. */
    private final double cloudStorageCost = 150.00; /** Cost. */

    private final int storage = 1000;


    /**Constructor CloudStorage. /*
     *
     * @param membership victim of decoration object.
     */
    public CloudStorage(final Membership membership) {
        setAllBenefits(membership.getAllBenefits());
        setNewDescription(membership.getDescription());
        setCost(membership.getCost());

        setCost(cloudStorageCost);
        setDescription(getBenefitDescription());
        setBenefits(cloudStorageName);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public final String getBenefitDescription() {
        return "+ " + cloudStorageName + " = " + storage + " GB";
    }
}
