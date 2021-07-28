package mycorda.app.integration

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import mycorda.app.registry.Registry
import org.junit.Test


/**
 * Some simple tests with Tasks
 */
class RegistryTests {

    @Test
    fun `should store and load from registry`() {
        val registry = Registry()
        registry.store(Red()).store(Green())

        val red = registry.get(Red::class.java)
        val green = registry.get(Green::class.java)
        val blue = registry.getOrElse(Blue::class.java, Blue())

        assertThat(red.javaClass.simpleName, equalTo("Red"))
        assertThat(green.javaClass.simpleName, equalTo("Green"))
        assertThat(blue.javaClass.simpleName, equalTo("Blue"))
    }
}

class Green {}
class Red {}
class Blue {}