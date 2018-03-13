package com.iteso.decorator.memberships.qualities;

import com.iteso.decorator.memberships.memberships.Membership;
import com.iteso.decorator.memberships.memberships.MembershipDecorator;

public class AllowedDevices extends MembershipDecorator {
    Membership member;

    public AllowedDevices (Membership member){
        this.member = member;
    }

    public String getDescription() {
        return "Number of Allowed devices is: " + member.getAllowedDevices();
    }
}