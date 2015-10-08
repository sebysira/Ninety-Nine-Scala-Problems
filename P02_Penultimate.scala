/**
 * Find the last but one element of a list.
 */
object P02_Penultimate {

  def main(args: Array[String]) {

    val l = List(1, 1, 2, 3, 5, 8)
    val res = penultimate(l)
    println(res)

  }

  def penultimate[A](l : List[A]):A = l match {

    case x :: _ :: Nil => x
    case _ :: xs => penultimate(xs)
    case _ => throw new NoSuchElementException
  }

}
