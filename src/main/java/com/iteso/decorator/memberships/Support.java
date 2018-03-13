package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

public class Support extends BenefitsDecorator{
    Membership member;
    public Support(Membership membership){
        member = membership;
    }

    public Support(Membership membership, boolean hasSupport, String coverage){
        member = membership;
        member.setSupport(hasSupport);
        member.setSupportCoverage(coverage);
    }

    @Override
    public String getDescription(){
        if(member.getDescription().equals("Basic Membership")){
            member.setDescription("Custom Membership");
        }
        return member.getDescription() + "\nHas support: " + member.isSupport() +
                "\nSupport: " + member.getSupportCoverage();
    }

    @Override
    public double getCost(){
        return (member.getCost() + (member.isSupport() ? 20 : 0));
    }

    @Override
    public void setSupport(boolean hasSupport){
        member.setSupport(hasSupport);
    }

    @Override
    public void setSupportCoverage(String coverage){
        member.setSupportCoverage(coverage);
    }

    @Override
    public String getSupportCoverage(){
        return member.getSupportCoverage();
    }

    @Override
    public boolean isSupport(){
        return member.isSupport();
    }
}