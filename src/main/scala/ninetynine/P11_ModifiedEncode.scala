/**
 * Modified run-length encoding.
 */
object P11_ModifiedEncode {

  def main(args: Array[String]) {

    val l= List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val res = modifiedEncode(l)
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

  def modifiedEncode[A](l:List[A]):List[Any] = {

    if (l.isEmpty) {
      Nil
    }
    else
      pack(l).map(x => {
        if (x.length == 1) x.head
        else
          (x.head, x.length)
      })
  }

}
