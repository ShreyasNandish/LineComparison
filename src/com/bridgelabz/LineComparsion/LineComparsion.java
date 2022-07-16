package com.bridgelabz.LineComparsion;

import java.util.Scanner;

public class LineComparsion {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison program ");
        Points p1=new Points();
        Points p2=new Points();
        Length l1=new Length();
        Length l2=new Length();

        p1.getPoints();
        //calculatelength();
        Double L1=l1.length(p1.getX(),p2.getX(),p1.getY(), p2.getY());
        System.out.println("Length of Line 1 is :"+L1);

        System.out.println("\n****************");
        System.out.println("\n");
        p2.getPoints();
        //calculatelength();
        Double L2=l1.length(p1.getX(),p2.getX(),p1.getY(), p2.getY());
        System.out.println("Length of Line 2 is :"+L2);

        if(L1.equals(L2))
        {
            System.out.println("Lines are equal ");
        }
        else if(L1.compareTo(L2)>0)
        {
            System.out.println("Line 1 is greater than Line 2 ");
        }
        else
        {
            System.out.println("Line 2 is greater than Line 1");
        }

    }
}
