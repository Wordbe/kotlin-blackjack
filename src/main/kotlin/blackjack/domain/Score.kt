package blackjack.domain

@JvmInline
value class Score(
    val score: Int
) {
    operator fun plus(other: Score): Score {
        return Score(score + other.score)
    }

    operator fun minus(other: Score): Score {
        return Score(score - other.score)
    }

    operator fun compareTo(other: Score): Int {
        return score - other.score
    }

    fun isBust(): Boolean {
        return score > BLACKJACK_SCORE
    }

    fun isBlackJack(): Boolean {
        return score == BLACKJACK_SCORE
    }

    companion object {
        const val BLACKJACK_SCORE = 21
        val ZERO = Score(0)
    }
}
