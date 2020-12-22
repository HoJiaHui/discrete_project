package com.ListClass;
import java.util.*;

class GCD {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Welcome to GCD Calculator---");
        System.out.println("--------------------------");
        System.out.print("Insert Number A: ");
        int n1 = scanner.nextInt();
        System.out.print("Insert Number B: ");
        int n2 = scanner.nextInt();

        {
            //int n1 = 50, n2 = 60;
            while (n1 != n2) {
                if (n1 > n2)
                    n1 = n1 - n2;
                else
                    n2 = n2 - n1;
            }
            System.out.println("GCD of Number A and Number B is: " + n2);
        }
    }
}
