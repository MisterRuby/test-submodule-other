package ruby.testsubmoduleother

import TestClass
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TestSubmoduleOtherApplication

fun main(args: Array<String>) {
    runApplication<TestSubmoduleOtherApplication>(*args)
    TestClass().callTestClass()
}
