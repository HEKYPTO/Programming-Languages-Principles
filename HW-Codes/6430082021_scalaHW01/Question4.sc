object Question4 {
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
}