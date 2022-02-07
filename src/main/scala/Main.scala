import java.util.Scanner
import scala.collection.mutable.ArrayBuffer
object Main {
    def main(args: Array[String]){

      var scanner = new Scanner(System.in)

      for (i <- 0 to 4){

        try {
          println("Please enter in your pet's name '\n'")
          scanner.nextLine()

          if (!(scanner.equals(""))
            throw new BadUserEntryException
          
            

        }catch{
          case bue: BadUserEntryException => println("You did not enter in a name! Try again ")
        }

        try {
          println("Please enter in your pet's age '\n'")
          scanner.nextInt()

          if(!(scanner.hasNextInt()))
            throw new BadUserEntryException
          
            
        }catch {
          case bue: BadUserEntryException => println("You did not enter in your pet's age! Try again ")
        }
      }
  }
}