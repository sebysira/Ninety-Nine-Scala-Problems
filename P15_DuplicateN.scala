/**
 * Duplicate the elements of a list a given number of times.
 */
object P15_DuplicateN {

  def main(args: Array[String]) {
    val l = List('a, 'b, 'c, 'c, 'd)
    val res = duplicateN(3,l)
    println(res)

  }

  def duplicateN[A](n:Int, l:List[A]):List[A] = {
    if(l.isEmpty || n == 0)
      l
    else{
      l.flatMap(e => List.fill(n)(e))
    }

  }

}
