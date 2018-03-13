package com.iteso.decorator.memberships.qualities;

import com.iteso.decorator.memberships.memberships.Membership;
import com.iteso.decorator.memberships.memberships.MembershipDecorator;

public class SimultaneousLogins extends MembershipDecorator {
    Membership member;

    public SimultaneousLogins (Membership member){
        this.member = member;
    }

    public String getDescription() {
        return "The allowed simultaneous logins is/are: " + member.getSimultaneousLogins();
    }
}