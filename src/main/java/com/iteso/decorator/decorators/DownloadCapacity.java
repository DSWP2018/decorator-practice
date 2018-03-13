package com.iteso.decorator.decorators;
import com.iteso.decorator.Benefits;
import com.iteso.decorator.Membership;

public class DownloadCapacity extends Benefits {

    /**
     * The Constructor.
     * @param membership the membership.
     */
    public DownloadCapacity(Membership membership) {
        super(membership);
        super.setDescription("Download capacity: 80");
        super.setDownloadCapacity(80);
        super.setCost(100);
    }

    /**
     * Get this benefit.
     * @return a String with the benefit.
     */
    public String getTheBenefit() {
        return "Download capacity: 80";
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
