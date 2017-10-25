/*
* @author Valanidis Efstathios
* @literal evalanidis@gmail.com
* @since 25/10/2017
* */

import java.util.Scanner;
import java.util.Random;

public class OddsAndEvens {


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String name, choice;
        int fingers,computer,sum,result;


        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.print("Hi "+name+", which do you choose?(O)dds or (E)vens?");
        while(true) {
            choice = input.nextLine();
            if (choice.equalsIgnoreCase("o")) {
                System.out.println(name + " has picked Odds! The computer will be Evens.");
                break;
            } else if (choice.equalsIgnoreCase("e")) {
                System.out.println(name + " has picked Evens! The computer will be Odds.");
                break;
            }else
                System.out.println("I didn't understand your choice. Can you say it again? <(O)dds/(E)vens>");
        }
        System.out.println("-------------------------");
        System.out.println("How many \"fingers\" do you put out? ");
        while(true) {
            fingers = input.nextInt();
            if(fingers < 0 || fingers >5)
                System.out.println("Choose between 0 and 5");
            else
                break;
        }
        computer = random.nextInt(6);
        System.out.println("The computer plays "+computer+" \"fingers\".");
        System.out.println("-------------------------");
        sum = fingers + computer;
        System.out.printf("%d + %d = %d \n",fingers,computer,sum);
        result = sum%2;
        if(result == 0){
            System.out.println(sum+" is ...even!");
            System.out.println("-------------------------");
            if(choice.equalsIgnoreCase("e")){
                System.out.println("That means "+name+" wins! :)");
            }
            else if (choice.equalsIgnoreCase("o"))
                System.out.println("That means the computer wins! :)");
        }else if(result != 0){
            System.out.println(sum+" is ...odd!");
            System.out.println("-------------------------");
            if(choice.equalsIgnoreCase("e")){
                System.out.println("That means the computer wins! :)");
            }
            else if (choice.equalsIgnoreCase("o"))
                System.out.println("That means "+name+" wins! :)");

        }



    }
}
