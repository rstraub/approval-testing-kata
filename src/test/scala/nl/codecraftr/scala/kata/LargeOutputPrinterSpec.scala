package nl.codecraftr.scala.kata

import org.junit.jupiter.api.Test

import scala.util.chaining.scalaUtilChainingOps;

/**
 * Next we have to get the [[LargeOutputPrinter]] under test.
 * It's relatively simple, but the output can be unwieldy.
 *
 * Once again, let's see how approval tests can help.
 */
class LargeOutputPrinterSpec {
  @Test
  def shouldPrintStatementGivenBooks(): Unit = {
    LargeOutputPrinter
      .print(
        Order(
          1337,
          Book("The Pragmatic Programmer", 30),
          Book("Clean Code", 40),
          Book("Refactoring", 25),
          Book("Design Patterns", 50),
          Book("Domain Driven Design", 45)
        )
      )
      .pipe(println)

    // 1 - TODO: Write a test that asserts the printed output using an inline string
    // 2 - TODO: Rewrite the test to use Approvals instead
    // 3 - Q: What did you notice?
  }

  @Test
  def shouldPrintStatementGivenNoBooks(): Unit = {
    // 4 - TODO: Write an approval test that asserts the printed output for this case
    LargeOutputPrinter
      .print(
        Order(
          0
        )
      )
      .pipe(println)

    // 5 - TODO: Adjust the implementation to include a message that the order did not contain books
    // 6 - TODO: Capture and approve the new output
    // 7 - Q: What was this workflow like? Any pro's and cons?
  }
}
