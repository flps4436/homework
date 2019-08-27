package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        Ticket ticket = getUserInput();

        System.out.println( "Total tickets: " + ticket.total +
                " Round-trip: " + ticket.round +
                " Total: " + ticket.getTotal() );
    }

    private static Ticket getUserInput(){

        int count, roundCount ;

        Scanner scanner = new Scanner(System.in);

        System.out.print( "Please enter number of tickets:" );

        count = scanner.nextInt();

        System.out.print("How many round-trip tickets:");

        roundCount = scanner.nextInt();

        return new Ticket( count, roundCount );

    }

}
