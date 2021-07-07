package mycorda.app.integration

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import mycorda.app.helpers.random
import mycorda.app.tasks.BaseBlockingTask
import mycorda.app.tasks.executionContext.DefaultExecutionContext
import mycorda.app.tasks.executionContext.ExecutionContext
import org.junit.Test


/**
 * Some simple tests with the helpers
 */
class HelpersSpec {

    @Test
    fun `should include helpers`() {
        assertThat(String.random(), !equalTo(String.random()))
    }
}