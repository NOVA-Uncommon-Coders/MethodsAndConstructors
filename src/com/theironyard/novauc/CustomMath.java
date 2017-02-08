package com.theironyard.novauc;

/**
 * Created by souporman on 2/7/17.
 */
public class CustomMath {
    static double AreaOfCircle(double radius){
        return (Math.PI*(radius*radius));
    }
    static double LengthOfHypotenuse(double verticalLeg,double horizontalLeg){
        double hypotenuseSquared=(verticalLeg*verticalLeg)+(horizontalLeg*horizontalLeg);
        double g1;
        double squareRoot = hypotenuseSquared/2;
        do
        {
            g1=squareRoot;
            squareRoot = (g1 + (hypotenuseSquared/g1))/2;
        }
        while((g1-squareRoot)!=0);
        return squareRoot;
    }
}
