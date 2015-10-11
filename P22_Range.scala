/**
 * Create a list containing all integers within a given range.
 */
object P22_Range {

  def main(args: Array[String]) {
    val res = range(4,9)
    val res2 = range2(4,9)
    println(res,res2)

  }

  def range(n:Int,m:Int):List[Int] = {

    if(n>m)
      Nil
    else
      List(n) ::: range(n+1,m)
  }

  def range2(n:Int,m:Int):List[Int] = {

    def range2ans(n:Int,m:Int,l:List[Int]):List[Int] = {

      if (n>m)
        l
      else
        range2ans(n+1,m, l :+ n)
    }
    range2ans(n,m,List())
  }

}
