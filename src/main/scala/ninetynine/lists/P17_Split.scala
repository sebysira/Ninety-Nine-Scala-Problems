/**
 * Split a list into two parts.
 */
object P17_Split {
  def main(args: Array[String]) {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val res = split(3,l)
    println(res)

  }

  def split[A](n:Int, l:List[A]):List[List[A]] = {

    if(n <= 0 || l.isEmpty)
      Nil
    else
      List(l.take(n) , l.drop(n))
  }
}
