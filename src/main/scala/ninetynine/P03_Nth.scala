/**
 * Find the Kth element of a list.
 */
object P03_Nth {
  def main(args: Array[String]) {
    val l = List(1, 1, 2, 3, 5, 8);
    val res = nth(5,l)
    println(res)

  }

  def nth[A](n:Int,l:List[A]):A = {
    def loop[A](n:Int,l:List[A]):A = l match {
      case Nil => throw new NoSuchElementException
      case x :: xs => if (n == 0) x else loop(n-1,xs)
    }

    loop(n,l)

  }

}
