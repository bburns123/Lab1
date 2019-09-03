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
public class Main {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);
        System.out.println("Enter the amount of purchase: ");
        
        float amountOfPurchase = price.nextFloat();
        System.out.println(amountOfPurchase);
    }
}
