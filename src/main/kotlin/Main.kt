
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

    val boolean = true

    val numeroLargo:Long = 300000000000000

    val numeroLargoDos = 3L

    val double :Double =2.7182
    val double2 =2.7182

    val float : Float = 1.1f
    val float2 = 1.1f


    val primerValor =20

    println("-------------")

    println( primerValor.plus(30))


    val segundoValor=10

    //si me paro en cima de minux y le doy contrl b voy a la declaracion de la funcion

    val tercerValor =primerValor.minus(segundoValor)

    println(tercerValor)

    println("-------------")

    val cuartoValor =primerValor - segundoValor

    println(cuartoValor)

    println("-------------")

    val apellidoo="APELLIDO"

    val nombree="NOMBRE"

    val nombreCompleto = nombree + " "+ apellidoo
    println(nombreCompleto)
    println("-------------")

    val nombreCompletooo = "$nombree $apellidoo"

    println(nombreCompletooo)

    val nombreDeOTraForma = "Mi nombre es $nombree"

    println(nombreDeOTraForma)












    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}