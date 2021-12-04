fun main()
{
    printborder()
    println("Wishing you a Very Happy Birthday!!\n")
    printcake()
    printborder()

}
/*print instead pf println to avoid jumping to next line */
fun printborder()
{ repeat(35)
   {
     print("=")
   }
   println()
}
fun printcake()
{
      println(" *\t*\t * ")
      println("||\t||\t|| ")
      println("====================")
      println("@@@@@@@@@@@@@@@@@@@@")
      println("@@@@@@@@@@@@@@@@@@@@")
      println("@@@@@@@@@@@@@@@@@@@@")
      println("====================")


}