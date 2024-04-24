package nl.codecraftr.scala.kata

import org.junit.jupiter.api.Test

import scala.util.chaining.scalaUtilChainingOps

class ComplexStructureBuilderSpec {
  @Test
  def shouldAssertComplexObjectStructure(): Unit = {
    ComplexStructureBuilder
      .build(12)
      .pipe(println)
  }
}
