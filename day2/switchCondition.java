package day2;

import java.util.Scanner;

public class switchCondition {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int button=sc.nextInt();
        // if(button==1){
        //     System.out.println("Hello");
        // }
        // else if(button==2){
        //     System.out.println("Namaste");
        // }
        // else if(button==3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalide Button");
        int day=7;
        switch(day){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Friday");
            break;

            case 5:
            System.out.println("Saturday");
            break;

            // case 6:
            // System.out.println("Sunday");
            // break;
            default:
            System.out.println("it's the Weekend");
        }

        }
    }
    

    

