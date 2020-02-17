package com.train.kotlin

import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    print( "Please enter number of tickets:" )

    var count = scanner.nextInt()

    while ( count != -1 ) {

        print("How many round-trip tickets:")

        var roundCount = scanner.nextInt()

        var ticket = Ticket(count, roundCount)

        println(
            "Total tickets: ${ticket.total} Round-trip: ${ticket.round} " +
                    "Total: ${ticket.totalMoney()} \n"
        )

        print( "Please enter number of tickets:" )

        count = scanner.nextInt()
    }
}

class Ticket( var total : Int, var round : Int ) {

    var single : Int = 0

    init {
        single = total - round
    }

    fun totalMoney() : Int {

        return single * 1000 + round * 1800

    }

}
