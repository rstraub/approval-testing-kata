package nl.codecraftr.scala.kata

import org.junit.jupiter.api.Test

import scala.util.chaining.scalaUtilChainingOps

/** We're now tasked with testing some complex object structures of the
  * [[ComplexStructureBuilder]]. Complex objects can be tricky especially to
  * build up programmatically. They also tend to make tests hard to read.
  *
  * Let's see how we can use approval tests to help us out here.
  */
class ComplexStructureBuilderSpec {
  @Test
  def shouldAssertComplexObjectStructure(): Unit = {
    // 1 - TODO: Write an assertion capturing the intended structure of the object
    // No cheating, you can't assert on the `show`/`toString` output!
    ComplexStructureBuilder
      .build(12)
      .pipe(_.show)
      .pipe(println)
  }

  def shouldAssertComplexObjectJson(): Unit = {
    // 2 - TODO: Write an approval test that asserts on the json structure instead
    // Tip 1: Use the `toJson` method on the `Chain` trait
    // Tip 2: ApprovalTests has a nifty `JsonApprovals` class that can help you out here
  }

  // 3 - Q: What did you notice between these two cases?
  // That concludes the exercises, well done! Check out the summary.
}
