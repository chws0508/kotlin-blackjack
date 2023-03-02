package domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PlayerTest {
    @Test
    fun `처음에 패를 두 장 보여준다`() {
        val player = Player(
            Name("scott"), Cards(
                setOf(
                    Card(CardCategory.CLOVER, CardNumber.EIGHT),
                    Card(CardCategory.SPADE, CardNumber.NINE)
                )
            )
        )

        val actual = player.showInitCards().size
        val expected = 2
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun `21보다 작으면 더 받을 수 있도록 true를 반환한다`() {
        val player = Player(
            Name("scott"), Cards(
                setOf(
                    Card(CardCategory.CLOVER, CardNumber.EIGHT),
                    Card(CardCategory.SPADE, CardNumber.NINE)
                )
            )
        )
        val actual = player.isMoreAddCard()
        assertThat(actual).isTrue
    }
}