package com.train;

public class Ticket {

    int total;
    int single;
    int round;

    public Ticket ( int total, int round ) {
        this.total = total;
        this.round = round;
        single = total - round;
    }

    public int getTotal(){

        return single * 1000 + round * 1800;

    }

}
