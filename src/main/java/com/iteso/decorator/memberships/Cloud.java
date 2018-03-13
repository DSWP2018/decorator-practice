package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

public class Cloud extends BenefitsDecorator{
    Membership member;
    public Cloud(Membership membership){
        member = membership;
    }

    public Cloud(Membership membership, int extra){
        member = membership;
        member.setCloudStorage(extra);
    }

    @Override
    public void setCloudStorage(int storage){
        member.setCloudStorage(storage);
    }

    @Override
    public String getDescription(){
        if(member.getDescription().equals("Basic Membership")){
            member.setDescription("Custom Membership");
        }
        return member.getDescription() + "\nExtra cloud: " + member.getCloudStorage();
    }

    @Override
    public double getCost(){
        return (member.getCost() + (5 * member.getCloudStorage()));
    }

    @Override
    public int getCloudStorage(){
        return member.getCloudStorage();
    }
}
