



object Question5 {
/*<script>*/object Question5 {
    def mergesort(list: List[Int]):List[Int] = {

        def split(a: List[Int], b: List[Int], pivot: Int): (List[Int], List[Int]) = {
            if (pivot == 0) return (a, b)
            return split(a.tail, b ++ List(a.head), pivot - 1)
        }

        def merge(a: List[Int], b: List[Int], c: List[Int]): List[Int] = {
            if (a.isEmpty && b.isEmpty) return c
            else if (a.isEmpty) return c ++ b
            else if (b.isEmpty) return c ++ a
            else if (a.head < b.head) return merge(a.tail, b, c ++ List(a.head))
            return merge(a, b.tail, c ++ List(b.head))
        }

        if (list.length <= 1) return list
        val (a, b) = split(list, List(), list.length / 2)
        return merge(mergesort(a), mergesort(b), List())
    }

    def main(args: Array[String]): Unit = {
        val l = List(3, 1, 4, 2, 5)
        println(mergesort(l))
    }
}/*</script>*/ /*<generated>*/
def args = Question5_sc.args$
  /*</generated>*/
}

object Question5_sc {
  private var args$opt0 = Option.empty[Array[String]]
  def args$set(args: Array[String]): Unit = {
    args$opt0 = Some(args)
  }
  def args$opt: Option[Array[String]] = args$opt0
  def args$: Array[String] = args$opt.getOrElse {
    sys.error("No arguments passed to this script")
  }
  def main(args: Array[String]): Unit = {
    args$set(args)
    Question5.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}

