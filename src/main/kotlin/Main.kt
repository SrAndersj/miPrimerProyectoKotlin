fun main(args: Array<String>) {
    //? significa que es nulable
    var nombre: String? =null

    // esto es lo que debemos evitar
    //!! le estoy diciendo a kotlin que estoy 100% seguro que no es un valor nulo
    // nombre!!.length


    nombre?.length
    println(nombre?.length)

    println("-------------")

    try {

        nombre!!.length

    }catch (exception : NullPointerException){
        println("ha ocurrido un error")
    }finally {
        println("ha courrido un error cerrando aplicacion ")
    }


    val primerValor = 10
    val segundoValor=0

    val resultado : Int =try{primerValor/segundoValor}catch (exception:Exception){0}
    println(resultado)

    }


    //recomendacion evitar usar !!
