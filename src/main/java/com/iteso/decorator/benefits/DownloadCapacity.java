package com.iteso.decorator.benefits;

import com.iteso.decorator.Membership;

/**Benefit Download Capacity. /*
 *
 */
public class DownloadCapacity extends Benefits {

    /**Information of the benefit. */
    private final String DOWNLOAD_CAPACITY_NAME = "Download Capacity"; /**Name. */
    private final double DOWNLOAD_CAPACITY_COST = 170.00; /** Cost. */

    private int capacity = 32;


    /**Constructor DownloadCapacity. /*
     *
     * @param membership
     */
    public DownloadCapacity(Membership membership){
        this.membership = membership;
        this.membership.setCost(DOWNLOAD_CAPACITY_COST);
        this.membership.setDescription(getBenefitDescription());
        this.membership.setBenefits(DOWNLOAD_CAPACITY_NAME);
    }

    /**Method getBenefitDescription. /*
     *
     * @return get the description of this benefit.
     */
    public String getBenefitDescription(){
        return "+ " + DOWNLOAD_CAPACITY_NAME + " = " + capacity;
    }

}
