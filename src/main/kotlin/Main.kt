
const val PI=3.1416

fun main(args: Array<String>) {
    println("Hello World!")

    var dinero =10

    println(dinero)

    dinero =5

    println(dinero)

    val nombre = "Maria"  //val es una variable de solo lectura, no se puede editar

    println(nombre)

    println(PI)



    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}