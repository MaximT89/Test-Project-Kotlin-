fun main() {
    val name = "Madrigal"
    var healthPoints = 89
    var isBlessed = true
    var isImmortal = false

    // Health status
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)

    // Aura
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    // Player condition
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)

    castFireBall()


    
    var beverage = readLine()
// beverage = null
    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("I can't do that without crashing - beverage was null!")
    }
    val beverageServed: String = beverage ?: "Buttered Ale"
    println(beverageServed)
}



private fun printPlayerStatus(auraColor: String,
                              isBlessed: Boolean,
                              name: String,
                              healthStatus: String) {
    println("(Aura: $auraColor) " +
                "(Blessed: ${if (isBlessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean,
                      healthPoints: Int,
                      isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) =
    when (healthPoints) {
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

private fun castFireBall(numFireball: Int = 2) =
    println("A glass of Fireball springs into existence. (x$numFireball)")
