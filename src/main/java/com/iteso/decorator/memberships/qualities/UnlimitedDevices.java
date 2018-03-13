package com.iteso.decorator.memberships.qualities;

import com.iteso.decorator.memberships.memberships.Membership;
import com.iteso.decorator.memberships.memberships.MembershipDecorator;

public class UnlimitedDevices extends MembershipDecorator {
    Membership member;

    public UnlimitedDevices (Membership member){
        this.member = member;
    }

    public String getDescription() {
        return "Does the account support unlimited devices?: " + member.isUnlimitedDevices();
    }
}
