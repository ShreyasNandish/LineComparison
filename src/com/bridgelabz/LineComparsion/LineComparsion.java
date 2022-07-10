package com.bridgelabz.LineComparsion;

import java.util.Scanner;

public class LineComparsion {
        public static void calculatelength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 : ");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 : ");
        int y1 = sc.nextInt();
        System.out.println("Enter x2 : ");
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

        double res1=(float)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)*1.0);
        double res2=(float)Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2)*1.0);
        System.out.println("Length of line is :"+res1);
        System.out.println("Length of line is :"+res2);

        if(res1==res2)
            System.out.println("Both lines are equal");
        else
            System.out.println("Both lines are not equal");
        }


    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison program ");
        calculatelength();

    }
}
