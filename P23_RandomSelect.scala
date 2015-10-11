/**
 * Created by seby on 11/10/15.
 */

object P23_RandomSelect {

  def main(args: Array[String]) {
    val l = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    val res = randomSelect(3,l)
    println(res)

  }

  def removeAt[A](n:Int,l:List[A]):(List[A],A) = l.splitAt(n) match {

    case (_ , Nil)  => throw new NoSuchElementException
    case (Nil, _) => throw new NoSuchElementException
    case (pre, e :: post) => (pre ::: post,e)

  }

  def randomSelect[A](n:Int,l:List[A]):List[A] = {
    def loop(n: Int, lres: List[A]): List[A] = {
      if (n == 0)
        lres
      else {
        val k = scala.util.Random.nextInt(l.length)
        val (_, e) = removeAt(k, l)
        loop(n-1,lres :+ e)
      }
    }
    loop(n, List())
  }
}
