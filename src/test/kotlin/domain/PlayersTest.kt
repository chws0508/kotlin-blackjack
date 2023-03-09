package domain

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class PlayersTest {
    @Test
    fun `플레이어의 수는 1명이상 8명이하여야 한다`() {
        assertThrows<IllegalStateException> {
            Players(
                List(9) {
                    Player(
                        Name("pobi"),
                        Cards(
                            listOf(
                                Card.of(CardCategory.CLOVER, CardNumber.EIGHT),
                                Card.of(CardCategory.SPADE, CardNumber.NINE),
                            ),
                        ),
                        BettingMoney(1000),
                    )
                },
            )
        }
    }
}
