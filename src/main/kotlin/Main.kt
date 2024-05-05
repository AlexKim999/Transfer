package org.example

fun main() {
    val amount = 1000.0
    val commissionPercentege =  0.0075
    val minCommission = 35.0


    val commission = if (amount * commissionPercentege < minCommission) {
        minCommission
    } else {
        amount * commissionPercentege
    }
    println("Размер комиссии: $commission рублей")
}