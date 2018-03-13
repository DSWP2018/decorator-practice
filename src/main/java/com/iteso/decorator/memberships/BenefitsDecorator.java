package com.iteso.decorator.memberships;

import com.iteso.decorator.Membership;

import java.util.ArrayList;

public abstract class BenefitsDecorator extends Membership {
    public abstract String getDescription(String description);
    public abstract double getCost(double cost);
}
