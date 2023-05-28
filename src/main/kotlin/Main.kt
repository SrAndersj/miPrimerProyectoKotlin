fun main(args: Array<String>) {
    val listaDeFrutas = listOf("Manzana","pera","Frambuesa","Durazno")

    for (fruta in listaDeFrutas){
        println("hoy voy a comer $fruta")
    }

    println("--------------")
    for (fruta in listaDeFrutas)println("hoy voy a comer $fruta")

    println("--------------")

    listaDeFrutas.forEach{fruta -> println("hoy si que voy a comer  $fruta") }

    println("--------------")

    val caracteresDeFrutas: List<Int> =listaDeFrutas.map{ fruta -> fruta.length}
    println(caracteresDeFrutas)

    println("--------------")

    val listaFiltrada = caracteresDeFrutas.filter { longitud -> longitud > 5  }

    println(listaFiltrada)
    }
