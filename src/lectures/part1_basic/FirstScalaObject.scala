package lectures.part1_basic

case object FirstScalaObject extends App{
  val x: Int = 42
  print(x)

//  変数宣言時は型を指定せずとも宣言できる
  val name: String = "Sato"
  val firstName = "Gen"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val sShort: Short = 4613
  val aLog: Long = 52455555555555L
  val aFloa: Float = 2.0f
  val aDouble: Double = 3.14

  var aVariable: Int = 4
  aVariable = 5

/* var name: type = value*/
/*　で宣言　*/
}
