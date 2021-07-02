package mycorda.app.integration

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import mycorda.app.tasks.BaseBlockingTask
import mycorda.app.tasks.executionContext.DefaultExecutionContext
import mycorda.app.tasks.executionContext.ExecutionContext
import org.junit.Test


/**
 * Some simple tests with Tasks
 */
class TaskSpec {

    @Test
    fun `should include tasks jar`() {
        class MyTask : BaseBlockingTask<String, String>() {
            override fun exec(executionContext: ExecutionContext, params: String): String {
                return params.toUpperCase()
            }
        }
        assertThat(MyTask().exec(DefaultExecutionContext(), "hello world"), equalTo("HELLO WORLD"))
    }
}