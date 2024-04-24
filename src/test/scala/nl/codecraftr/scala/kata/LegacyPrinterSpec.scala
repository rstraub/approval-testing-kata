package nl.codecraftr.scala.kata

import org.approvaltests.Approvals
import org.junit.jupiter.api.Test

import scala.util.chaining.scalaUtilChainingOps

/** You're tasked with maintaining some nasty legacy code: the
  * [[LegacyPrinter]]. The business wants you to add some new functionality, but
  * the code is horrible and there are no tests to help us here... Worse, the
  * business doesn't even know what the code does.
  *
  * Let's see if approval testing can help us here.
  */
class LegacyPrinterSpec {
  @Test
  def shouldAddApprovalTest(): Unit = {
    // 1 - TODO: Write an approval test to capture behavior for an input
    LegacyPrinter.print("John").pipe(println)

    // Sample usage of the Approvals library
    Approvals.verify("hello!")
  }

  @Test
  def shouldIncreaseCodeCoverage(): Unit = {
    // 2 - TODO: Use your IDE's 'run with coverage' feature to add tests until you fully cover the legacy code.

    // 3 - TODO: After getting sufficient code coverage, refactor the legacy code to something simpler,
    // hint: perhaps pattern matching would help?
  }

  @Test
  def shouldBeSafeToAddFeature(): Unit = {
    // 4 - TODO: When the CEO's daughter 'Jane' uses the system, the output should be "Dad was here!"
    // Bonus: develop this feature using approval tests and Test-Driven Unit Testing
    // How do they differ?
  }
}
