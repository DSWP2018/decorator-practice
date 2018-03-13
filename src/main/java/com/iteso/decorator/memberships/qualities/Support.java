package com.iteso.decorator.memberships.qualities;

import com.iteso.decorator.memberships.memberships.Membership;
import com.iteso.decorator.memberships.memberships.MembershipDecorator;

public class Support extends MembershipDecorator {
    Membership member;

    public Support (Membership member){
        this.member = member;
    }

    public String getDescription() {
        return "Is support available?: " + member.isSupport();
    }
}
