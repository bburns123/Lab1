/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

import java.util.Scanner;

/**
 *
 * @author 0800633
 */
public class CookieCalories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of cookies: ");
        
        int amountOfCookies = scanner.nextInt();
        
        
        int caloriesPerCookie = 30;
        int totalAmountOfCalories = amountOfCookies * caloriesPerCookie;
        
        System.out.println("You have consumed " + totalAmountOfCalories + " calories in cookies!");
        
    }
}
