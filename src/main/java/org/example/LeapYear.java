package org.example;

public class LeapYear {

    private int year;

    public Boolean calculatorLapYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0 ) || year % 4000 == 0 ){
            System.out.println("Année Bissextile !");
            return true;
        }
        else {
            System.out.println("Ce n'est pas une année bissextile");
            return false;
        }
    }


}
