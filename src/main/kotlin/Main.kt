//block es un sintaxis recomendada por kotlin para nombrar las lambdas
fun main(args: Array<String>) {

    val largoDelValorInicial = superFuncion(valorInicial = "Hola") { valor ->
        valor.length
    }

    println(largoDelValorInicial)

    val lambda: () -> String = funcionInception("Enrique")

    val valorLambda =lambda()

    println(valorLambda)

}

// esta lambda recibe un string y devuelve un entero
fun superFuncion(valorInicial: String,block: (String)->Int):Int{

    return block(valorInicial)
}

fun funcionInception(nombre:String):()-> String{

    return {
        "Hola desde la lambda $nombre"
    }
}





