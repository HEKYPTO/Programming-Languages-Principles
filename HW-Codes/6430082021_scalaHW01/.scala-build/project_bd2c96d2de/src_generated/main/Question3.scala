



object Question3 {
/*<script>*/object Question3 {
    def subList(l1:List[Any], l2:List[Any]): Boolean = {
        if (l1.isEmpty) return true
        else if (l2.isEmpty) return false
        else if (l1.length == 1) {
            if (l1.head == l2.head) return true
            return subList(l1, l2.tail)
        }
        return subList(l1.tail, l2) && subList(List(l1.head), l2)
    }
    def main(args: Array[String]): Unit = {
        println(subList(List(4), List(1, 2, 3, 4, 5)))
        println(subList(List(3, 1, 4), List(1, 2, 3, 4, 5)))
        println(subList(List(4, 6), List(1, 2, 3, 4, 5)))
    }
}/*</script>*/ /*<generated>*/
def args = Question3_sc.args$
  /*</generated>*/
}

object Question3_sc {
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
    Question3.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}

