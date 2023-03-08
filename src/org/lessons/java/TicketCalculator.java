package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numKm;
        int ageUser;
        double discount = 0;

        double priceKm = 0.21;

        double travelCost;

        //chiedo all'utente l'età
        System.out.println("Your age: ");
        ageUser = Integer.parseInt(scan.nextLine());
        System.out.println("*****************************");

        //chiedo quanti chilometri devere percorrere
        System.out.println("Distance in Km: ");
        numKm = Integer.parseInt(scan.nextLine());
        System.out.println("*****************************");

        //calcolo il prezzo del viaggio
        travelCost = numKm * priceKm;

        //calcolo lo sconto nel caso in cui l'utente è minorenne
        if(ageUser < 18){
            discount = (travelCost * 20) / 100;
            travelCost = (numKm * priceKm) - discount;
        }

        //calcolo lo sconto nel caso in cui l'utente è over 65
        if(ageUser > 65){
            discount = (travelCost * 40) / 100;
            travelCost = (numKm * priceKm) - discount;
        }




        //formatto il prezzo del viaggio
        DecimalFormat df = new DecimalFormat("0.00");
        String travelCostFormatter = df.format(travelCost) ;

        //stampo il prezzo del viaggio formattato
        System.out.println("Travel cost: " + travelCostFormatter);



    }
}
