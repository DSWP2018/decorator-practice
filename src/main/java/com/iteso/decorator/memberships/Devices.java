package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

public class Devices extends BenefitsDecorator {
    Membership member;
    public Devices(Membership membership){
        member = membership;
    }

    public Devices(Membership membership, int allowDev, int simulDev, boolean unlimited){
        member = membership;
        member.setSimultaneousLogins(simulDev);
        member.setAllowedDevices(allowDev);
        member.setUnlimitedDevices(unlimited);
    }

    @Override
    public void setSimultaneousLogins(int simulDev){
        member.setSimultaneousLogins(simulDev);
    }

    @Override
    public void setAllowedDevices(int allowDev){
        member.setAllowedDevices(allowDev);
    }

    @Override
    public void setUnlimitedDevices(boolean unlimited){
        member.setUnlimitedDevices(unlimited);
    }

    @Override
    public String getDescription(){
        if(member.getDescription().equals("Basic Membership")){
            member.setDescription("Custom Membership");
        }
        return member.getDescription() +
                "\nSimultaneous Logins: " + getSimultaneousLogins() +
                "\nAllowed Devices: " + getAllowedDevices() +
                "\nUnlimited: " + isUnlimitedDevices();
    }

    @Override
    public double getCost(){
        return (member.getCost() + (1 * member.getSimultaneousLogins()) +
                (member.isUnlimitedDevices() ? 50 : (1 * member.getAllowedDevices())));
    }

    @Override
    public int getAllowedDevices(){
        return member.isUnlimitedDevices() ? 9999 : member.getAllowedDevices();
    }

    @Override
    public int getSimultaneousLogins(){
        return member.isUnlimitedDevices() ? 9999 : member.getSimultaneousLogins();
    }

    @Override
    public boolean isUnlimitedDevices(){
        return member.isUnlimitedDevices();
    }
}
