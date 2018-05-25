/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class maven_class {
    public static void main(String args[])
    {
        try (Scanner s = new Scanner(System.in)) {
            int a= s.nextInt();
            int b=s.nextInt();
            int c=(a+b)/2;
            System.out.println("***************************");
            System.out.println("The value of c will be :"+c);
            System.out.println("***************************");
        }
    }
}
