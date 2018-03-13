package com.iteso.decorator.memberships.qualities;

public class Cost extends MembershipDecorator{
    User user;

    public Envio (User user){
        this.user = user;
    }

    public String getDescription() {
        return user.getDescription() + " Cargo de envio";
    }

    public double price() {return user.price() + 100;
    }
}