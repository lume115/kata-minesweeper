package at.oebb.dojo.minesweeper

import mu.KotlinLogging
import org.apache.commons.io.IOUtils
import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class MinesweeperTest {

    private val minesweeper = Minesweeper()
    private val log = KotlinLogging.logger {}

    @Test
    fun acceptanceTest() {
        log.info { "***** ACCEPTANCE TEST *****" }
        val inputContent = IOUtils.resourceToString("/in/acceptance.txt", Charsets.UTF_8)
        val outputContent = IOUtils.resourceToString("/out/acceptance.txt", Charsets.UTF_8)

        assertThat(minesweeper.parse(inputContent)).isEqualTo(outputContent)
    }
}