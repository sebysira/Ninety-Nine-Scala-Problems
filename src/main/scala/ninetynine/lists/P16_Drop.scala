/**
 * Drop every Nth element from a list.
 */
object P16_Drop {

  def main(args: Array[String]) {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val res = drop(3,l)
    println(res)

  }

  def drop[A](n:Int, l:List[A]):List[A] = {

    if(n <= 0 )
      l.tail
    else {
      l.head :: drop(n-1,l.tail)
    }

  }

}
