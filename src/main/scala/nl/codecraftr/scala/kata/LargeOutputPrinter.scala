package nl.codecraftr.scala.kata

object LargeOutputPrinter {
  def print(order: Order): String =
    s"""Statement for order
      | ${order.books.mkString("\n ")}
      |Total: €${order.total}""".trim.stripMargin
}

case class Book(description: String, price: Int) {
  override def toString: String = s"$description - €$price"
}

case class Order(id: Int, books: List[Book]) {
  lazy val total: Int = books.map(_.price).sum
}

object Order {
  def apply(id: Int, books: Book*): Order = Order(id, books.toList)
}
