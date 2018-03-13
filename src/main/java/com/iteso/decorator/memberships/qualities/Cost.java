package com.iteso.decorator.memberships.qualities;

import com.iteso.decorator.memberships.memberships.Membership;
import com.iteso.decorator.memberships.memberships.MembershipDecorator;

public class Cost extends MembershipDecorator{
    Membership member;

    public Cost (Membership member){
        this.member = member;
    }

    public String getDescription() {
        return "Costo Membrecía" + member.getDescription();
    }

    public double price() {return member.getCost();
    }
}