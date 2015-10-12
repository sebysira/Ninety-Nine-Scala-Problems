/**
 * Rotate a list N places to the left.
 */
object P19_Rotate {
  def main(args: Array[String]) {
    val l =  List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    val res = rotate(3,l)
    val res2 = rotate(-2,l)
    println(res,res2)

  }
  def rotate[A](n:Int,l:List[A]):List[A] = {

    if (n>=0){
      l.drop(n) ::: l.take(n)
    }
    else{
      l.drop(l.length + n) ::: l.take(l.length + n)
    }

  }

}
