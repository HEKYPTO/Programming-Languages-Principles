object Final1 {
    def swapPair(l: List[Int]): List[Int] = {
        def swap(l: List[Int], con: Boolean, out: List[Int]): List[Int] = {
        if (l.length < 2) return out ++ l
        else if (con) return swap(l.tail.tail, false, out ++ List(l.tail.head, l.head))
        return swap(l, true, out)
        }
        
        if (l.length <= 2) return l
        return swap(l, false, List())
    }

    def main(args: Array[String]): Unit = {
        val list1 = List()
        val list2 = List(22)
        val list3 = List(1,2,3)
        val list4 = List(1,2,3,4) 
        val list5 = List(1,2,3,4,5) 
        val list6 = List(1,2,3,4,5,6)
        println(swapPair(list1) == List()) 
        println(swapPair(list2) == List(22)) 
        println(swapPair(list3) == List(2,1,3))
        println(swapPair(list4) == List(2,1,4,3)) 
        println(swapPair(list5) == List(2,1,4,3,5)) 
        println(swapPair(list6) == List(2,1,4,3,6,5))
    }
}