/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;
import java.util.Scanner;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author 0800633
 */
public class Main {
    public static void main(String[] args) {
        Scanner price = new Scanner(System.in);
        System.out.println("Enter the amount of purchase: ");
        
        String amountOfPurchase = JOptionPane.showInputDialog("Please Enter Amount of Purchase: ");
        
        try {
            double amountOfPurchaseAsDouble = Double.parseDouble(amountOfPurchase); 
        } catch(Exception e){
            System.out.println("Please make sure to enter a decimal value!");

        }
        double amountOfPurchaseAsDouble = Double.parseDouble(amountOfPurchase);
      
        double stateSalesTax = amountOfPurchaseAsDouble * .04;
        double countySalesTax = amountOfPurchaseAsDouble * .02;
        double totalSalesTax = stateSalesTax + countySalesTax;
        double totalOfSale = amountOfPurchaseAsDouble + totalSalesTax;
        
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        // A formatter that will convert into a currency instance
        System.out.println("Amount of purchase: " + currencyInstance.format(amountOfPurchase));
        System.out.println("State Sales Tax: " + currencyInstance.format(stateSalesTax));
        System.out.println("County Sales Tax: " + currencyInstance.format(countySalesTax));
        System.out.println("Total Sales Tax: " + currencyInstance.format(totalSalesTax));
        System.out.println("Total Sale: " + currencyInstance.format(totalOfSale));
        
    }
}
