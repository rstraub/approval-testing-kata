# Summary

[Approval Testing](https://dev.to/sergiomarcial/unlocking-the-power-of-approval-testing-a-comprehensive-guide-for-software-engineers-3o6f)
is a testing technique where you capture the output a piece of code produces, and check
it against a previously approved output (hence the name).
You can think of it as recording a "[snapshot](https://jestjs.io/docs/snapshot-testing)"
of the current behavior and constantly compare outputs against it.

This makes the technique useful for the following use cases:

- Getting legacy code under test (what even is the current output?)
- Preventing regression or spotting behavioral change
- Verifying large textual output (plain text, json, xml, html, etc.)
- Asserting on large and/or complex object structures

However, there are drawbacks. Nothing comes for free, and this technique has tradeoffs:

- You capture existing behavior, but don't specify expectations upfront
- Makes creating assertions easy, but diminishes intentionality
- Easy to update assertions, but lowers the barrier to do so

So, should we throw our unit tests overboard in favor of approval tests? No. They
fulfill different needs, and can work complementary. Rather than and/or I see approval
testing as an additional tool in my toolbox. Unit testing is our hammer, and now we've
been handed a chisel - both useful in their respective contexts.
