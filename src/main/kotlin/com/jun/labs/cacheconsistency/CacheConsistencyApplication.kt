package com.jun.labs.cacheconsistency

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CacheConsistencyApplication

fun main(args: Array<String>) {
    runApplication<CacheConsistencyApplication>(*args)
}
