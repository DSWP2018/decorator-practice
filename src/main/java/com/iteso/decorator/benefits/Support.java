package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

/**Class Support. /*
 *
 */
public class Support extends Benefits {

    /**Information of the benefit. */
    private final String supportName = "Support"; /**Name. */
    private final double supportCost = 100.00; /** Cost. */



    /**Constructor CloudStorage. /*
     *
     * @param membership victim of decoration.
     */
    public Support(final Membership membership) {
        setAllBenefits(membership.getAllBenefits());
        setNewDescription(membership.getDescription());
        setCost(membership.getCost());

        setCost(supportCost);
        setDescription(getBenefitDescription());
        setBenefits(supportName);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public final String getBenefitDescription() {
        return "+ " + supportName;
    }


}
