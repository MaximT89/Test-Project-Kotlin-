import java.lang.IllegalStateException

fun main() {
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if(isJugglingProficient){
        swordsJuggling = 2
    }
    try {
        proficientCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)
    } catch (e : Exception){
        println(e)
    }

    println("You juggle $swordsJuggling swords!")
}

fun proficientCheck(swordsJuggling: Int?){
    swordsJuggling ?: throw UnskilledSwordJugglerException()
}

class UnskilledSwordJugglerException():
        IllegalStateException("Player cannot juggle swords")