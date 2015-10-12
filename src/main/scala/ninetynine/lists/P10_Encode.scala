/**
 * Run-length encoding of a list.
 */
object P10_Encode {

  def main(args: Array[String]) {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val res = encode(l)
    println(res)

  }

  def pack[A](l:List[A]):List[List[A]] = {

    if (l.isEmpty)
      List(List())
    else{
      val (p,np) = l.span( _ == l.head)
      if (np.isEmpty)
        List(p)
      else
        p :: pack(np)
    }

  }

  def encode[A](l:List[A]):List[(A,Int)] = {

    if (l.isEmpty){
      Nil
    }
    else
      pack(l).map(x => (x.head,x.length))
  }

}
