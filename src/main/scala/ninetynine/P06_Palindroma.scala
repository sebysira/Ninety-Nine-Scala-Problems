/**
 * Find out whether a list is a palindrome.
 */

package scala.math

object P06_Palindroma {

  def main(args: Array[String]) {

    val l = List(1,2,3,2,1)
    val res = isPalindroma(l)
    println(res)

  }

  def isPalindroma[A](l:List[A]):Boolean = {

    val aux = l.reverse
    val len = ceil(l.length / 2.0)
    println(len)
    //aux == l    simple solutions but not efficient

    def auxpal(l1:List[A],l2:List[A],len:Double):Boolean = (l1,l2,len) match {

      case (_, _, 0) => true
      case (_,Nil,_) => false
      case (Nil,_,_) => false
      case (x :: xs, y :: ys, len) => if(x == y)auxpal(xs,ys,len -1) else false
    }

    auxpal(l,aux,len)
  }

}
