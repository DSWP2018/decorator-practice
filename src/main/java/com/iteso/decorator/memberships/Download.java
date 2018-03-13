package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

public class Download extends BenefitsDecorator{

    Membership member;
    public Download(Membership membership){
        member = membership;
    }

    public Download(Membership membership, int extra){
        member = membership;
        member.setDownloadCapacity(extra);
    }

    @Override
    public void setDownloadCapacity(int capacity){
        member.setDownloadCapacity(capacity);
    }

    @Override
    public String getDescription(){
        if(member.getDescription().equals("Basic Membership")){
            member.setDescription("Custom Membership");
        }
        return member.getDescription() + "\nDownload capacity: " + member.getDownloadCapacity();
    }

    @Override
    public double getCost(){
        return (member.getCost() + (0.1 * member.getDownloadCapacity()));
    }

    @Override
    public int getDownloadCapacity(){
        return member.getDownloadCapacity();
    }
}