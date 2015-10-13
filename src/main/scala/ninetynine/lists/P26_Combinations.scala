package ninetynine.lists

/**
 * Generate the combinations of K distinct objects chosen from the N elements of a list.
 */
object P26_Combinations {

    def flatMapSublist[A,B](l:List[A])(f:List[A]=>List[B]):List[B] = l match {
      case Nil => Nil
      case sublist@(_ :: tail) => f(sublist) ::: flatMapSublist(tail)(f)
    }

    def combinations[A](n:Int,l:List[A]):List[List[A]] = {
      if(n==0)
        List(Nil)
      else
        flatMapSublist(l){ sublist => combinations(n-1,sublist.tail).map(sublist.head :: _)
    }

  }

}
