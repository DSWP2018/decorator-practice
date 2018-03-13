package com.iteso.decorator.decorators;
import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

public class CloudStorage extends Benefits {

    /**
     * The Constructor.
     * @param membership the membership.
     */
    public CloudStorage(Membership membership) {
        super(membership);
        super.setDescription("Cloud storage: 110");
        super.setCloudStorage(110);
        super.setCost(89.90);
    }

    /**
     * Get this benefit.
     * @return a String with the benefit.
     */
    public String getTheBenefit() {
        return "Cloud storage: 110";
    }


    @Override
    public void setCloudStorage(int cloudStorage) {

    }

    /**
     * Get the Cost of this benefit.
     * @return the cost.
     */
    @Override
    public double getCost() {
        return super.getCost();
    }
}
