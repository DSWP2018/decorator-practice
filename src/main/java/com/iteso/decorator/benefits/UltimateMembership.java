package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;


/**
 * Created by marianasrvg on 4/14/16.
 */
public class UltimateMembership extends Benefits {


    /**Information of the benefit. */
    /**Name. */
    private final String ultimateMembershipName = "Type: ULTIMATE";

    /**Constructor UltimateMemebership. /*
     *
     * @param membership victim of decoration.
     */
    public UltimateMembership(Membership membership) {
        membership = new CloudStorage(membership);
        membership = new Support(membership);
        membership = new UnlimitedDevices(membership);
        membership = new DownloadCapacity(membership);

        setAllBenefits(membership.getAllBenefits());
        setNewDescription(membership.getDescription());
        setCost(membership.getCost());

        setDescription(getBenefitDescription());
        setBenefits(ultimateMembershipName);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public final String getBenefitDescription() {
        return "+ " + ultimateMembershipName;
    }
}
