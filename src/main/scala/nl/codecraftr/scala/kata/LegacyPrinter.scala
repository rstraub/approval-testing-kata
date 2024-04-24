package nl.codecraftr.scala.kata

object LegacyPrinter {
  def print(name: String): String = {
    // Imagine some horribly complex code here

    if (name.nonEmpty) {
      if (name == "null") "We don't do nulls here!"
      else if (name == "void") "Into oblivion!"
      else if (name == "dev") "1337!"
      else s"Hello, $name"
    } else {
      "Hello, World!"
    }
  }
}
