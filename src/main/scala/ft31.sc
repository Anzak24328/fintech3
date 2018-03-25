def factorial(n: Int) : BigInt = {
  if (n<=1) 1
  else factorial(n-1)*n
}

factorial(4)

def fintech31(list: List[Int]) : List[List[Int]] = {
  val size = list.size
  val variants = factorial(size)
  println(size + " " + variants)
  null
}

def red(list: List[Int]): List[List[Int]] = {
  val result: List[List[Int]] = List ( List(num1,num2) , List(num2, num1))
  result
}


