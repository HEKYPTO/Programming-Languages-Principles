



object Question4 {
/*<script>*/object Question4 {
    def palindrome(list: List[Any]):Boolean = {
        
        def reverse(list: List[Any]): List[Any] = {
            if (list.isEmpty) return Nil
            return reverse(list.tail) ++ List(list.head)
        }

        def compare(l1: List[Any], l2: List[Any]): Boolean = {
            if (l1.isEmpty && l2.isEmpty) return true
            else if (l1.head != l2.head) return false
            compare(l1.tail, l2.tail)
        }

        return compare(list, reverse(list))
    }

    def main(args: Array[String]): Unit = {
        println(palindrome(List(3, 1, 4, 2, 5)))
        println(palindrome(List(1, 2, 3, 2, 1)))
        println(palindrome(List(1, 2, 2, 1)))
    }
}/*</script>*/ /*<generated>*/
def args = Question4_sc.args$
  /*</generated>*/
}

object Question4_sc {
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
    Question4.hashCode() // hasCode to clear scalac warning about pure expression in statement position
  }
}

