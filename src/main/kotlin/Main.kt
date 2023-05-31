fun main(args: Array<String>) {

    val listaDeNombres = listOf("Juan","Enrique","Camila")

    println(listaDeNombres)

    //lista mutable

    val listaVacia = mutableListOf<String>()

    println(listaVacia)

    listaVacia.add("Andres")

    println(listaVacia)


    val valorUsandoGet=listaVacia.get(0)

    println(valorUsandoGet)

    val valorUsandoOperador= listaVacia[0]
    println(valorUsandoOperador)


    val primerValor = listaDeNombres.first()

    println(primerValor)

    // val primerValor = listaDeNombres.firstOrNull()

    listaVacia.removeAt(0)

    println(listaVacia)

    listaVacia.add("Andres")

    listaVacia.removeIf { caracteres -> caracteres.length > 3 }

    println(listaVacia)


    val array = arrayOf(1,2,3,4)

    println("nuestro array $array")
    println("nuestro array como lista ${array.toList()}")


    }



