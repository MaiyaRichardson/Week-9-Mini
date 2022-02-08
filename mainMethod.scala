import java util.Scanner
object main {
  def main(args: Array[String]): Unit = {
    var scan = new Scanner(System.in)
  println("Welcome to visit Animal.")
  var obj = new Animal("Lion", 50, "animal")
  obj.getname()
  obj.getage()
  obj.getclassification()

  prinln("Thank you for visited.")
  }
}