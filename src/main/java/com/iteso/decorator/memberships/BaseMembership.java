package com.iteso.decorator.memberships;

import java.util.ArrayList;

import com.iteso.decorator.Membership;

public class BaseMembership extends Membership{
/***var**/
public static final double cost=8;
/***var**/
public static final String descriptionBM="Membership";	
/***constructor**/
public BaseMembership(){
description = descriptionBM;
}
/***@return double**/
@Override
public double getCost() {
return cost;  
}	
}
