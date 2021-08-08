fun main() {
    val purchaseAmount = 1000.0
    val totalPurchases = 10001.0
    var finalSum = 0.0
    val isRegular = true


    if (totalPurchases in 1000.0..10000.0 && purchaseAmount >= 1000) {
        finalSum = purchaseAmount - 100
        println("Сумма покупки со скидкой 100р. составит $finalSum")
    } else if (totalPurchases > 10000) {
        finalSum = purchaseAmount - (purchaseAmount * 0.05)
        println("Сумма покупки со скидкой 5% составит $finalSum")
    } else {
        finalSum = purchaseAmount
        println("Сумма покупки составит $finalSum")
    }

    if (isRegular) {
        finalSum -= (finalSum * 0.01)
        println("После применения 1% скидки - $finalSum")
    }

}
