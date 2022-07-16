package com.bridgelabz.LineComparsion;

import java.util.Scanner;

public class Points {
    private double x,y;

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public void setX(double x)
    {
        this.x=x;
    }

    public void setY(double y)
    {
        this.y=y;
    }

    public void getPoints()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1 values : ");
        setX(sc.nextInt());
        System.out.println("Enter y1 values : ");
        setY(sc.nextInt());
        System.out.println("Enter x1 values : ");
        setX(sc.nextInt());
        System.out.println("Enter y1 values: ");
        setY(sc.nextInt());
       /* System.out.println("Enter x2 : ");
        int x2 = sc.nextInt();
        System.out.println("Enter y2 : ");
        int y2 = sc.nextInt();
        System.out.println("Enter x3 : ");
        int x3 = sc.nextInt();
        System.out.println("Enter y3 : ");
        int y3 = sc.nextInt();
        System.out.println("Enter x4 : ");
        int x4 = sc.nextInt();
        System.out.println("Enter y4 : ");
        int y4 = sc.nextInt();

        */
    }
}
