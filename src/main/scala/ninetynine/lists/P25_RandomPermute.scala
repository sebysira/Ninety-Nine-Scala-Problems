package ninetynine.lists

/**
 * Generate a random permutation of the elements of a list.
 */
object P25_RandomPermute {
  import P23_RandomSelect.randomSelect

  def randompermute[A](l:List[A]):List[A] = {

    randomSelect(l.length,l)
  }

}
