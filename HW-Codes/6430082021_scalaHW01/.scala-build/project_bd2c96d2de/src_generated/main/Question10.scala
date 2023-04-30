



object Question10 {
/*<script>*/object Question10 {
    def alternate(f1: (Int,Int) => Int, f2: (Int,Int) => Int, list:List[Int]): Int = {

        def alternado(l: List[Int], state: Int, acc: Int): Int = {
            if (l.isEmpty) return acc
            else if (state == 0) return alternado(l.tail, 1, f2(acc, l.head))
            return alternado(l.tail, 0, f1(acc, l.head))
        }

        if (list.isEmpty) return 0
        else if (list.length == 1) return list.head
        return alternado(list.tail.tail, 0, f1(list.head, list.tail.head))
    }


    def main(args: Array[String]): Unit = {
        println(alternate(_+_ ,_-_, List()))
        println(alternate(_+_ ,_-_, List(55)))
        println(alternate(_+_ ,_-_, List(1, 2)))
        println(alternate(_+_ ,_-_, List(1, 2, 3)))
        println(alternate(_+_ ,_-_, List(1, 2, 3, 4)))
        println(alternate(_+_ ,_-_, List(1, 2, 3, 4, 5)))
        println(alternate(_+_ ,_-_, List(1, 2, 3, 4, 5, 6)))
    }
}/*</script>*/ /*<generated>*/
def args = Question10_sc.args$
  /*</generated>*/
}

object Question10_sc {
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
    Question10.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}

