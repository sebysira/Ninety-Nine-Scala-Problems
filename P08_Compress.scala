/**
 * Eliminate consecutive duplicates of list elements.
 */
object P08_Compress {

  def main(args: Array[String]) {

    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val res = compress(l)
    val res2 = compress2(l)
    println(res)
    println(res2)
  }

  def compress[A](l:List[A]):List[A] = l match {

    case Nil => Nil
    case x :: Nil => List(x)
    case x :: xs => if ( x == xs.head) compress(xs) else x :: compress(xs)

  }

  def compress2[A](l:List[A]):List[A] = {

    l.foldRight(List[A]())((x,xs) =>if (xs.isEmpty || x != xs.head ) x :: xs else xs)

  }

}
