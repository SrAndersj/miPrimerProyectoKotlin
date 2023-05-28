fun main(args: Array<String>) {
    var contador =10

    while(contador > 0) {
    println("El valor del contador es $contador")
        contador--
    }

    //do while primero ejecuta y luego compruba
    do {
        println("Generando un numero aleatorio")
        val numeroAleatorio = (0..100).random()
        println("el numero aleatorio es $numeroAleatorio")


    }while(numeroAleatorio > 50)


    }
