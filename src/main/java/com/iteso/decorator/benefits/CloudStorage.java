package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

public class CloudStorage extends Benefits {

    /**Information of the benefit. */
    private final String CLOUD_STORAGE_NAME = "Cloud Storage"; /**Name. */
    private final double CLOUD_STORAGE_COST = 150.00; /** Cost. */

    private int storage = 1000;


    /**Constructor CloudStorage. /*
     *
     * @param membership
     */
    public CloudStorage(Membership membership){
        this.membership = membership;
        this.membership.setCost(CLOUD_STORAGE_COST);
        this.membership.setDescription(getBenefitDescription());
        this.membership.setBenefits(CLOUD_STORAGE_NAME);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public String getBenefitDescription(){
        return "+ " + CLOUD_STORAGE_NAME + " = " + storage + " GB";
    }
}
