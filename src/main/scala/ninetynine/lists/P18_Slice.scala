/**
 * Created by seby on 10/10/15.
 */
object P18_Slice {

  def main(args: Array[String]) {
    val l = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val res = sliceRic(3,7,l)
    val res2 = sliceFun(3,7,l)
    println(res,res2)

  }

  def sliceRic[A](n:Int, m:Int, l:List[A]):List[A] = {
    if(n == 0 )
      l.take(m)
    else
      sliceRic(n-1,m-1,l.tail)
  }

  def sliceFun[A](n:Int,m:Int,l:List[A]):List[A] = {
    l.drop(n).take(m-n)
  }



}
