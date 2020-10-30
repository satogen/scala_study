package lectures.part1_basic

object StringOps extends App {

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2)) //二番目
  println(str.substring(7, 11))//７〜１１番目
  println(str.split(" ").toList)//空白で分けリスト
  println(str.startsWith("Hello"))//Helloで始まっているかどう
  println(str.replace(" ", "-"))//入れ替え
  println(str.toLowerCase())//小文字に変換
  println(str.length)//長さ

  val aNumberString = "2"
  val aNumber = aNumberString.toInt//数字型に変換
  println('a' +: aNumberString :+ 'z')//文字の足し算
  println(str.reverse)//反対にしている
  println(str.take(2))//２番めまで取得

  // Scala-specific: String interpolators.

  // S-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"//＄マークで入れ込み
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age + 1} years old."//カッコで足すこともできる
  println(anotherGreeting)

  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per minute"//小数点指定もできる。この場合は小数点２位まで
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"//改行
  println(raw"$escaped")//変数で改行される
}
