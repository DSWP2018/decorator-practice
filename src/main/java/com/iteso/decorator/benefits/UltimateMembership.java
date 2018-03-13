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
        this.membership = membership;
        setDescription(getBenefitDescription());
        this.membership.setDescription(getDescription());
        setBenefits(ULTIMATE_MEMBERSHIP_NAME);
        this.membership = new CloudStorage(this);
        this.membership = new Support(this);
        this.membership = new UnlimitedDevices(this);
        this.membership = new DownloadCapacity(this);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public String getBenefitDescription(){
        return "+ " + ULTIMATE_MEMBERSHIP_NAME;
    }
}
