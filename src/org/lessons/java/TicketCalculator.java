package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TicketCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double priceKm = 0.21;

        double discount = 0;
        double discountUnder = 0.2;
        double discountOver = 0.4;

        int numKm;
        int ageUser;

        double travelCost;

        //chiedo all'utente l'età
        System.out.print("Your age: ");
        ageUser = Integer.parseInt(scan.nextLine());


        //chiedo quanti chilometri devere percorrere
        System.out.print("Distance in Km: ");
        numKm = Integer.parseInt(scan.nextLine());


        //calcolo il prezzo del viaggio
        travelCost = numKm * priceKm;

        //calcolo lo sconto nel caso in cui l'utente è minorenne o over 65
        if(ageUser < 18){
            discount = travelCost * discountUnder;
            travelCost -= discount;
        } else if (ageUser > 65){
            discount = travelCost * discountOver;
            travelCost -= discount;
        }




        //formatto il prezzo del viaggio
        DecimalFormat df = new DecimalFormat("0.00");
        String travelCostFormatter = df.format(travelCost) ;

        //stampo il prezzo del viaggio formattato
        System.out.println("Travel cost: " + travelCostFormatter);


        //chiudo lo scan
        scan.close();



    }
}
