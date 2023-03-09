package org.lessons.java;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //chiedo all'utente quanti numeri vuole stampare
        System.out.println("Enter a number between 0 and 1000: ");
        int numToPrint = Integer.parseInt(scan.nextLine());


        //qui gestisco il caso in cui l'utente inserisca un numero fuori dal range
        if(numToPrint < 0){
            System.out.println("************");
            System.out.println("Error, the number must be between 0 and 1000!");
            System.out.println("************");
            System.out.println("Enter a number between 0 and 1000: ");
            numToPrint = Integer.parseInt(scan.nextLine());
        } else if (numToPrint > 1000) {
            System.out.println("************");
            System.out.println("Error, the number must be between 0 and 1000!");
            System.out.println("************");
            System.out.println("Enter a number between 0 and 1000: ");
            numToPrint = Integer.parseInt(scan.nextLine());
        }

        //inizializzo un array con il numero inserito dall'user
        String[] numbers = new String[numToPrint];


        //vado a inserire i dati all'interno dell'array
        for(int i = 1; i <= numbers.length; i++){
            numbers[i - 1] = String.valueOf(i);

           if(i % 3 == 0){
               numbers[i - 1] = "Fizz";
           }

           if(i % 5 == 0){
                numbers[i - 1] = "Buzz";
           }


        }

        //stampo il risultato
        System.out.println(Arrays.toString(numbers));

        //chiudo lo scan
        scan.close();
    }
}
