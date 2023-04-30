object Question8 {
    def maxAll(lists:List[List[Int]]):List[Int] = {

        def forLists(lists: List[List[Int]], ans: List[Int]): List[Int] = {
            if (lists.isEmpty) return ans
            return forLists(lists.tail, compList(lists.head, ans))
        }

        def compList(a: List[Int], b: List[Int]): List[Int] = {
            if (a.isEmpty && b.isEmpty) return Nil
            else if (a.isEmpty) return b
            else if (b.isEmpty) return a
            else if (a.head > b.head) return a.head :: compList(a.tail, b.tail)
            return b.head :: compList(a.tail, b.tail)
        }

        forLists(lists, List())
    }

    def main(args: Array[String]):Unit = {
        println(maxAll(List()))
        println(maxAll(List(List()))) 
        println(maxAll(List(List(1,2,3,4,8,9),List(),List(4,5),List(1,2,3,5,6,10,11)))) 
        println(maxAll(List(List(3,4),List(1,2,3,4,51,61),List(1,2,31,41,61,51)))) 
        println(maxAll(List(List(1,2,3,40,5,6),List(10,2,30,4),List(1,200),List(0,0,0,0,0,0,0,0,9))))
    }
}