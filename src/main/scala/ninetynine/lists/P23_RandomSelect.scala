package ninetynine.lists
/**
 * Created by seby on 11/10/15.
 */
object P23_RandomSelect {
  import P20_RemoveAt.removeAt
  def randomSelect[A](n:Int,l:List[A]):List[A] = {
    def loop(n: Int, lcur:List[A],lres: List[A]): List[A] = {
      if (n == 0)
        lres
      else {
        val k = scala.util.Random.nextInt(lcur.length)
        val (p, e) = removeAt(k, lcur)
        loop(n-1,p,lres :+ e)
      }
    }
    loop(n, l,List())
  }
}
