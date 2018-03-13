package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;


/**
 * Created by marianasrvg on 4/14/16.
 */
public class UltimateMembership extends Benefits {


    /**Information of the benefit. */
    private final String ULTIMATE_MEMBERSHIP_NAME = "Type: ULTIMATE"; /**Name. */

    /**Constructor UltimateMemebership. /*
     *
     * @param membership
     */
    public UltimateMembership(Membership membership){
        membership = new CloudStorage(membership);
        membership = new Support(membership);
        membership = new UnlimitedDevices(membership);
        membership = new DownloadCapacity(membership);

        setAllBenefits(membership.getAllBenefits());
        setNewDescription(membership.getDescription());
        setCost(membership.getCost());

        setDescription(getBenefitDescription());
        setBenefits(ULTIMATE_MEMBERSHIP_NAME);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public String getBenefitDescription(){
        return "+ " + ULTIMATE_MEMBERSHIP_NAME;
    }
}
