package com.company;
import java.util.Scanner;

public class Main {
    public static void Convert(double Celsius) {
        double F = (Celsius * 9 / 5) + 32;
        System.out.print("Fahrenheit: " + F);
    }

    public static boolean isPalindrome(int number) {
        int n, digit, rev = 0;
        n = number;

        do {
            digit = number % 10;
            rev = (rev * 10) + digit;
            number = number / 10;
        } while (number != 0);

        System.out.println(" The reverse of the number is: " + rev);

        if (n == rev) return true;
        else  return false;
    }

    public static void CountVowelsConstants(String str)
    {
        int vCount = 0, cCount = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                vCount++;
            }

            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        while(true)
        {
            System.out.println("---------------------------------------");
            System.out.println("Please, choose action");
            System.out.println("1.Convert Celsius to Fahrenheit");
            System.out.println("2.Palindrome number");
            System.out.println("3.Count vowels and consonants");
            System.out.println("4.Finished actions");
            System.out.print("Your choice:");
            select = input.nextInt();

            switch (select) {
                   case 1:
                       System.out.print("Please, enter value in Celsius: ");
                       double Celsius = input.nextDouble();
                       Convert(Celsius);
                       System.out.println();
                       break;
                   case 2:
                       System.out.print("Please, enter the number: ");
                       int number = input.nextInt();
                       System.out.println(isPalindrome(number));
                       System.out.println();
                       break;
                case 3:
                       String str= "I like music";
                       CountVowelsConstants(str);
            }
               if (select==4) break;
            }
        }
    }




