package blackjack.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ScoreTest : FunSpec({

    test("점수를 더한다") {
        Score(2) + Score(1) shouldBe Score(3)
    }

    test("점수를 뺀다") {
        Score(2) - Score(1) shouldBe Score(1)
    }

    test("점수를 비교한다") {
        (Score(2) > Score(1)) shouldBe true
        (Score(1) >= Score(1)) shouldBe true
        (Score(1) < Score(2)) shouldBe true
        (Score(1) <= Score(1)) shouldBe true
    }

    test("Bust 인지 여부를 반환한다") {
        Score(22).isBust() shouldBe true
        Score(21).isBust() shouldBe false
    }

    test("BlackJack 인지 여부를 반환한다") {
        Score(22).isBlackJack() shouldBe false
        Score(21).isBlackJack() shouldBe true
        Score(20).isBlackJack() shouldBe false
    }
})
