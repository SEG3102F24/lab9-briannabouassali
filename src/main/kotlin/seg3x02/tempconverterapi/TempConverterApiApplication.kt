package seg3x02.tempconverterapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
class TempConverterApiApplication

fun main(args: Array<String>) {
	runApplication<TempConverterApiApplication>(*args)
}
