/**
 * Insert an element at a given position into a list.
 */
object P21_InsertAt {

  def main(args: Array[String]) {
    def l = List('a, 'b, 'c, 'd)
    val res = insertAt('new,-1,l)
    println(res)

  }

  def insertAt[A](e:A,n:Int,l:List[A]):List[A] = l.splitAt(n) match {

    case (x,Nil) => x :+ e
    case (Nil,_) if (n<0) => e +: l
    case (p,n) => p ::: List(e) ::: n


  }

}
