package nl.codecraftr.scala.kata

import io.circe.generic.auto.exportEncoder
import io.circe.syntax.EncoderOps

import scala.annotation.tailrec

object ComplexStructureBuilder {
  def build(levels: Int): Chain = {
    @tailrec
    def chain(left: Int, acc: Chain = End): Chain = {
      if (left == 0) acc
      else chain(left - 1, Link(left).append(acc))
    }

    chain(levels)
  }
}

sealed trait Chain {
  def show: String
  def append(next: Chain): Chain
  def toJson: String = this.asJson.toString()
}

case class Link(value: Int, next: Chain = End) extends Chain {
  override def append(next: Chain): Chain =
    Link(value, next)

  final def show: String = {
    next match {
      case End => s"$value"
      case _   => s"$value -> " + next.show
    }
  }
}

case object End extends Chain {
  override def show: String = ""
  override def append(next: Chain): Chain = next
}
