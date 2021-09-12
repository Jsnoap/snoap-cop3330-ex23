/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jordan Snoap
 */

package org.example;
import java.util.Scanner;

public class App 
{
    // Program to diagnose a car issue
    // Only asks the necessary questions (user answers "y" or "n" for each)
    public static void main( String[] args )
    {
        String q1, q2, q3, q4, q5, q6;

        System.out.println("Is the car silent when you turn the key?");
        Scanner sc1 = new Scanner(System.in);
        q1 = sc1.next();

        if (q1.equals("y"))
        {
            System.out.println("Are the battery terminals corroded?");
            Scanner sc2 = new Scanner(System.in);
            q2 = sc2.next();

            if (q2.equals("y"))
            {
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else
            {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else
        {
            System.out.println("Does the car make a slicking noise?");
            Scanner sc3 = new Scanner(System.in);
            q3 = sc3.next();

            if (q3.equals("y"))
            {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else
            {
                System.out.println("Does the car crank up but fail to start?");
                Scanner sc4 = new Scanner(System.in);
                q4 = sc4.next();

                if (q4.equals("y"))
                {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Does the engine start and then die?");
                    Scanner sc5 = new Scanner(System.in);
                    q5 = sc5.next();

                    if (q5.equals("y"))
                    {
                        System.out.println("Does you car have fuel injection?");
                        Scanner sc6 = new Scanner(System.in);
                        q6 = sc6.next();

                        if (q6.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
