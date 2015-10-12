/**
 * Remove the Kth element from a list.
 */
object P20_RemoveAt {

  def main(args: Array[String]) {
    val l = List('a, 'b, 'c, 'd);
    val res = removeAt(1,l)
    println(res)

  }

  def removeAt[A](n:Int,l:List[A]):(List[A],A) = l.splitAt(n) match {

    case (_ , Nil)  => throw new NoSuchElementException
    case (Nil, _) => throw new NoSuchElementException
    case (pre, e :: post) => (pre ::: post,e)



  }

}
