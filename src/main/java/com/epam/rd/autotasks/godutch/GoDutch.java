package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int billTotal = scanner.nextInt();
        int numberOfFriends = scanner.nextInt();

        double totalAmount = billTotal * 1.1;

        int partToPay = (int) Math.ceil(totalAmount / numberOfFriends);

        if (billTotal < 0) {
            System.out.println("Bill total amount cannot be negative");
            return;
        }

        if(numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
            return;
        }

        System.out.println(partToPay);
    }
}
