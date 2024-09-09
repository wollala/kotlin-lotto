package model

import kotlin.random.Random

class Lotto {
    companion object {
        const val LOTTO_PRICE = 1000
        const val NUMBER_COUNT = 6
        const val MAX_NUMBER = 45
    }

    fun generateLottoNumbers(): List<Int> {
        return (1..MAX_NUMBER).shuffled().take(NUMBER_COUNT).sorted()
    }
}
