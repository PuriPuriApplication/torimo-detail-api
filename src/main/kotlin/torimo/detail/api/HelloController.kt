package torimo.detail.api

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import torimo.detail.api.domain.TestTable
import torimo.detail.api.domain.TestTableRepository
import javax.inject.Singleton

@Singleton
@Controller("/test")
class TestController(private val testTableRepository: TestTableRepository) {
    @Get("/{id}")
    fun show(id: Long): TestTable? = testTableRepository.findById(id)
}

@Singleton
@Controller("/hello")
class HelloController {

    @Get(produces = [MediaType.TEXT_PLAIN])
    fun index(): String {
        return "Hello World"
    }
}
