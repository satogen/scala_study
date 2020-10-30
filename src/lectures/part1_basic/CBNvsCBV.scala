package lectures.part1_basic

object CBNvsCBV extends App {

  def calledByValue(x: Long): Unit = {
    println("by value: " + 1257387745764245L)
    println("by value: " + 1257387745764245L)
  }

  //返り値の型を設定
  def calledByName(x: => Long): Unit = {
    println("by name: " + System.nanoTime())
    println("by name: " + System.nanoTime())
  }

  calledByValue(1257387745764245L)
  calledByName(22)

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

//    printFirst(infinite(), 34)
  printFirst(34, infinite())
  // 値渡しパラメータは、参照された時に一度した評価されないが、名前渡しパラメータは、毎回評価される
}