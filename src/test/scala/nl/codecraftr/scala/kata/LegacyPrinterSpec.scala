package nl.codecraftr.scala.kata

import org.approvaltests.Approvals
import org.junit.jupiter.api.Test

class LegacyPrinterSpec {
  @Test
  def printShouldOutputText(): Unit = {
    // 1 - TODO: Write an approval test to capture behavior for an input

    // Sample usage of the Approvals library
    Approvals.verify("hello!")
  }
}
