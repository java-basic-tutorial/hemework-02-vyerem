package com.softserveinc;

import java.util.Locale;

/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    public static void main(String[] args) {
        //  I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = {-1.7, -1.0, 2.6, 9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9, 1.4};
        // TODO: Write your code here
        double avg = temperature[0];
        int min = 0;
        int max = 0;
        for (int i = 1; i < temperature.length; i++) {
            avg += temperature[i];
            if (temperature[i] < temperature[min]) {
                min = i;
            }
            if (temperature[i] > temperature[max]) {
                max = i;
            }
        }
        avg /= temperature.length;
        System.out.printf(Locale.ENGLISH, "Average annual temperature: %2.5g\n", avg);
        System.out.print("Month with the lowest temperature in a year: ");
        switch (min) {
            case 0:
                System.out.println("I");
                break;
            case 1:
                System.out.println("II");
                break;
            case 2:
                System.out.println("III");
                break;
            case 3:
                System.out.println("IV");
                break;
            case 4:
                System.out.println("V");
                break;
            case 5:
                System.out.println("VI");
                break;
            case 6:
                System.out.println("VII");
                break;
            case 7:
                System.out.println("VIII");
                break;
            case 8:
                System.out.println("IX");
                break;
            case 9:
                System.out.println("X");
                break;
            case 10:
                System.out.println("XI");
                break;
            case 11:
                System.out.println("XII");
                break;
        }
        System.out.print("The month with the highest temperatures in a year: ");
        switch (max) {
            case 0:
                System.out.println("I");
                break;
            case 1:
                System.out.println("II");
                break;
            case 2:
                System.out.println("III");
                break;
            case 3:
                System.out.println("IV");
                break;
            case 4:
                System.out.println("V");
                break;
            case 5:
                System.out.println("VI");
                break;
            case 6:
                System.out.println("VII");
                break;
            case 7:
                System.out.println("VIII");
                break;
            case 8:
                System.out.println("IX");
                break;
            case 9:
                System.out.println("X");
                break;
            case 10:
                System.out.println("XI");
                break;
            case 11:
                System.out.println("XII");
                break;
        }
    }
}
//

//        for (double month : temperature) {
//            if(month < min) min = month;
//            if(month > max) max = month;
//        }
//
//        if (min == -1.7) {
//            System.out.println("Month with the lowest temperature in a year: I");
//        }
//        else if (min == -1.0) {
//            System.out.println("Month with the lowest temperature in a year: II");
//        }
//        else if (min == 2.6) {
//            System.out.println("Month with the lowest temperature in a year: III");
//        }
//        else if (min == 9.0) {
//            System.out.println("Month with the lowest temperature in a year: IV");
//        }
//        else if (min == 15.1) {
//            System.out.println("Month with the lowest temperature in a year: V");
//        }
//        else if (min == 19.4) {
//            System.out.println("Month with the lowest temperature in a year: VI");
//        }
//        else if (min == 21.4) {
//            System.out.println("Month with the lowest temperature in a year: VII");
//        }
//        else if (min == 21.2) {
//            System.out.println("Month with the lowest temperature in a year: VIII");
//        }
//        else if (min == 17.1) {
//            System.out.println("Month with the lowest temperature in a year: IX");
//        }
//        else if (min == 11.1) {
//            System.out.println("Month with the lowest temperature in a year: X");
//        }
//        else if (min == 5.9) {
//            System.out.println("Month with the lowest temperature in a year: XI");
//        }
//        else if (min == 1.4) {
//            System.out.println("Month with the lowest temperature in a year: XII");
//        }
//        else {
//            System.out.println("Month with the lowest temperature in a year is unknown");
//        }
//
//        if (max == -1.7) {
//            System.out.println("The month with the highest temperatures in a year: I");
//        }
//        else if (max == -1.0) {
//            System.out.println("The month with the highest temperatures in a year: II");
//        }
//        else if (max == 2.6) {
//            System.out.println("The month with the highest temperatures in a year: III");
//        }
//        else if (max == 9.0) {
//            System.out.println("The month with the highest temperatures in a year: IV");
//        }
//        else if (max == 15.1) {
//            System.out.println("The month with the highest temperatures in a year: V");
//        }
//        else if (max == 19.4) {
//            System.out.println("The month with the highest temperatures in a year: VI");
//        }
//        else if (max == 21.4) {
//            System.out.println("The month with the highest temperatures in a year: VII");
//        }
//        else if (max == 21.2) {
//            System.out.println("The month with the highest temperatures in a year: VIII");
//        }
//        else if (max == 17.1) {
//            System.out.println("The month with the highest temperatures in a year: IX");
//        }
//        else if (max == 11.1) {
//            System.out.println("The month with the highest temperatures in a year: X");
//        }
//        else if (max == 5.9) {
//            System.out.println("The month with the highest temperatures in a year: XI");
//        }
//        else if (max == 1.4) {
//            System.out.println("The month with the highest temperatures in a year: XII");
//        }
//        else {
//            System.out.println("The month with the highest temperatures in a year is unknown");
//        }
//
//
//    }
//}

//        System.out.println("Month with the lowest temperature in a year:" + min_temp_month);

////        double minfrommonth = min;
//        String nameofmonthmin;
//
//        switch (min) {
//            case -1.7:
//                nameofmonthmin = "I";
//                break;
//            case -1.0:
//                nameofmonthmin = "II";
//                break;
//            case 2.6:
//                nameofmonthmin = "III";
//                break;
//            case 9.0:
//                nameofmonthmin = "IV";
//                break;
//            case 15.1:
//                nameofmonthmin = "V";
//                break;
//            case 19.4:
//                nameofmonthmin = "VI";
//                break;
//            case 21.4:
//                nameofmonthmin = "VII";
//                break;
//            case 21.2:
//                nameofmonthmin = "VIII";
//                break;
//            case 17.1:
//                nameofmonthmin = "IX";
//                break;
//            case 11.1:
//                nameofmonthmin = "X";
//                break;
//            case 5.9:
//                nameofmonthmin = "XI";
//                break;
//            case 1.4:
//                nameofmonthmin = "XII";
//                break;
//            default:
//                nameofmonthmin = "???";
//
//        }
//        System.out.println("Month with the lowest temperature in a year:" + nameofmonthmin);
//        switch (max) {
//            case -1.7: nameofmonthmin = "I";
//                break;
//            case -1.0: nameofmonthmin = "II";
//                break;
//            case 2.6: nameofmonthmin = "III";
//                break;
//            case 9.0: nameofmonthmin = "IV";
//                break;
//            case 15.1: nameofmonthmin = "V";
//                break;
//            case 19.4: nameofmonthmin = "VI";
//                break;
//            case 21.4: nameofmonthmin = "VII";
//                break;
//            case 21.2: nameofmonthmin = "VIII";
//                break;
//            case 17.1: nameofmonthmin = "IX";
//                break;
//            case 11.1: nameofmonthmin = "X";
//                break;
//            case 5.9: nameofmonthmin = "XI";
//                break;
//            case 1.4: nameofmonthmin = "XII";
//                break;
//            default: nameofmonthmin = "???";
//        }
////        double maxfrommonth = max;
////        String nameofmonthmax;


//        System.out.println("Month with the lowest temperature in a year:" + );
//        System.out.println("The month with the highest temperatures in a year:" + max);


//
//        double mintemp;
//        mintemp = Arrays.stream(temperature).min();
//        System.out.println(findMin(temperature));

//         System.out.println("Month with the lowest temperature in a year:" + temperature[0]);
//
//        System.out.println("The month with the highest temperatures in a year:");


