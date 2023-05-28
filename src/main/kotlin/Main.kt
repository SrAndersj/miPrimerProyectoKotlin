fun main(args: Array<String>) {
    val nombreColor="Carmesi"


    when(nombreColor){
        "Amarillo"-> println("El Amarillo es el color de la alegria")
        "Rojo","Carmesi"-> println("$nombreColor color del calor ")
        else -> println("Error no tengo informacion del color")
    }

    val code =200
    //in significa un rango
    when(code){
        in 200..299 -> println("todo bien  el numero es $code")
        in 400..500 -> print("error")
        else -> println("codigo desconocido ")

    }

    val tallaDeZapatos =41

    val mensaje = when(tallaDeZapatos){

        41,43 -> "Tenemos disponible "
        42,44 -> "casi nos quedan "


        else -> "solo hay de 41 a 45"
    }
    println(mensaje)
    }
