package com.train.kotlin

import java.util.*

fun main() {

    var ticket : Ticket = userInput()

    println("Total tickets: ${ticket.total} Round-trip: ${ticket.round} " +
            "Total: ${ ticket.totalMoney() } " )

}

fun userInput() : Ticket {

    val scanner = Scanner(System.`in`)

    print( "Please enter number of tickets:" )

    var count = scanner.nextInt()

    print("How many round-trip tickets:")

    var roundCount = scanner.nextInt()

    return Ticket( count, roundCount!! )

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
