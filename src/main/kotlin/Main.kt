fun main(args: Array<String>) {

    val numerosDeLoteria = listOf(11,22,43,56,78,66)

    println(numerosDeLoteria)

    //las ordena
    val numerosSorted = numerosDeLoteria.sorted()

    println(numerosSorted)

    val numerosDeLoteriaDescendientes =numerosDeLoteria.sortedDescending()

    println(numerosDeLoteriaDescendientes)

    println("----------")
    val ordenarPorMultiplos =numerosDeLoteria.sortedBy { numero -> numero <50 }

    println(ordenarPorMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()

    println("----------")

    println(numerosAleatorios)

    println("----------")
    val numerosEnReversa = numerosDeLoteria.reversed()

    println(numerosEnReversa)

        // convertir un elemento de un tipo a otro tipo

    val mensajesDeNumeros = numerosDeLoteria.map{numero ->
            println(numero)
        " tu numero de loteria es $numero"}

    println(mensajesDeNumeros)


    //funcion filter

    val numerosFiltrados =  numerosDeLoteria.filter { numero -> numero >50 }

    println(numerosFiltrados)
    }



