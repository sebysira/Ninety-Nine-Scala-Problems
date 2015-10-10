/**
 *  Run-length encoding of a list (direct solution).
 */
object P13_Run_Length {

  def main(args: Array[String]) {
    val l = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    val res = runLength(l)
    println(res)

  }

  def runLength[A](l:List[A]):List[(Int,A)] = {

    if(l.isEmpty){
      Nil
    }
    else{

      val (p,np) = l.span(_ == l.head)
      if(np.isEmpty){
        List((p.length,p.head))
      }
      else{
        (p.length,p.head) :: runLength(np)
      }
    }
  }

}
