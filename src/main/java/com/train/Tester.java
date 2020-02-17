package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        int count, roundCount ;

        Scanner scanner = new Scanner(System.in);

        System.out.print( "Please enter number of tickets:" );

        count = scanner.nextInt();

        while ( count != -1 ) {

            System.out.print("How many round-trip tickets:");

            roundCount = scanner.nextInt();

            Ticket ticket = new Ticket(count, roundCount);

            System.out.println("Total tickets: " + ticket.total +
                    " Round-trip: " + ticket.round +
                    " Total: " + ticket.getTotal() + "\n" );

            System.out.print( "Please enter number of tickets:" );

            count = scanner.nextInt();
        }
    }
}
