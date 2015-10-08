/**
 * Find the last element of a list.
 */
object P01_Last {

  def main (args: Array[String]){
    val l = List(1, 1, 2, 3, 5, 8)
    val res =last(l)
    println(res)

  }

  def last[A](l : List[A]) : A = l match {
    case x :: Nil => x
    case _ :: xs => last(xs)
    case _ =>throw new NoSuchElementException
  }

}
