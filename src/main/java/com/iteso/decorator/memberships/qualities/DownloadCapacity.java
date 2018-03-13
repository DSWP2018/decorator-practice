package com.iteso.decorator.memberships.qualities;

import com.iteso.decorator.memberships.memberships.Membership;
import com.iteso.decorator.memberships.memberships.MembershipDecorator;

public class DownloadCapacity extends MembershipDecorator {
    Membership member;

    public DownloadCapacity (Membership member){
        this.member = member;
    }

    public String getDescription() {
        return "The download capacity is: " + member.getDownloadCapacity();
    }
}