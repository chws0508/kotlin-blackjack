package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DealerTest {
    @Test
    fun `게임 시작 시 딜러의 처음 카드를 하나 보여준다`() {
        val dealer = Dealer(
            Cards(
                setOf(
                    Card(CardCategory.CLOVER, CardNumber.EIGHT),
                    Card(CardCategory.SPADE, CardNumber.NINE)
                )
            )
        )
        val actual = dealer.showInitCards()
        val expected = listOf(Card(CardCategory.CLOVER, CardNumber.EIGHT))
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `카드의 총합이 16이하면 카드를 더 받아야 한다`() {
        val dealer = Dealer(
            Cards(
                setOf(
                    Card(CardCategory.CLOVER, CardNumber.EIGHT),
                    Card(CardCategory.SPADE, CardNumber.SIX)
                )
            )
        )
        val actual = dealer.isPossibleDrawCard()
        val expected = true
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `자신의 종합 승패 결과를 반환한다`() {
        val dealer = Dealer(
            Cards(
                setOf(
                    Card(CardCategory.CLOVER, CardNumber.EIGHT),
                    Card(CardCategory.SPADE, CardNumber.SIX)
                )
            )
        )

        val players = Players(
            listOf(
                Player(
                    Name("pobi"), Cards(
                        setOf(
                            Card(CardCategory.CLOVER, CardNumber.EIGHT),
                            Card(CardCategory.SPADE, CardNumber.NINE)
                        )
                    )
                ),
                Player(
                    Name("jason"), Cards(
                        setOf(
                            Card(CardCategory.CLOVER, CardNumber.EIGHT),
                            Card(CardCategory.SPADE, CardNumber.TWO)
                        )
                    )
                )
            )
        )

        val result = dealer.getResult(players)
        assertThat(result[GameResult.WIN]).isEqualTo(1)
        assertThat(result[GameResult.LOSE]).isEqualTo(1)
    }
}