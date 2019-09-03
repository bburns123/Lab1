/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;
import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author 0800633
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);
        System.out.println("Enter the amount of purchase: ");
        
        double amountOfPurchase = price.nextDouble();
      
        double stateSalesTax = amountOfPurchase * .04;
        double countySalesTax = amountOfPurchase * .02;
        double totalSalesTax = stateSalesTax + countySalesTax;
        double totalOfSale = amountOfPurchase + totalSalesTax;
        
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        // A formatter that will convert into a currency instance
        System.out.println("Amount of purchase: " + currencyInstance.format(amountOfPurchase));
        System.out.println("State Sales Tax: " + currencyInstance.format(stateSalesTax));
        System.out.println("County Sales Tax: " + currencyInstance.format(countySalesTax));
        System.out.println("Total Sales Tax: " + currencyInstance.format(totalSalesTax));
        System.out.println("Total Sale: " + currencyInstance.format(totalOfSale));
        
    }
}
