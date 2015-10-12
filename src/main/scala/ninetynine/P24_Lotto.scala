package ninetynine.lists

/**
 * Lotto: Draw N different random numbers from the set 1..M.
 */
object P24_Lotto {

  def lotto(n:Int,r:Int):List[Int] = {
    def lottoans(n:Int,r:Int,lres:List[Int]):List[Int] = {
      if(n==0)
        lres
      else{
        val k = scala.util.Random.nextInt(r)
        if (!lres.contains(k)) {
          lottoans(n - 1, r, lres :+ k)
        }
        else{
          lottoans(n,r,lres)
        }
      }
    }
    lottoans(n,r,List())
  }

}
