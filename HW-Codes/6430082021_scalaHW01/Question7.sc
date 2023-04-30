object Question7 {
    def myMap(f:Int=>Int)(list:List[Int]):List[Int] = {
        if (list.isEmpty) return Nil
        return f(list.head) :: myMap(f)(list.tail)
    }

    def main(args: Array[String]):Unit = {
        println(myMap((x: Int) => x * 2)(List(1, 2, 3, 4, 5, 6)))
    }
}