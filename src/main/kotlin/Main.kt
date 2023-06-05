@file:Suppress("UNREACHABLE_CODE")

fun main(args: Array<String>) {

    val fraseAleatoria="En Platzi nunca paramos de aprender"

    imprimirFrase(fraseAleatoria)

    val fraseOrdenadaAleatoriamente = randomCase(fraseAleatoria)

    println(fraseOrdenadaAleatoriamente)

    val fraseAleatoriaExtension ="En Platzi nunca paramos de aprender frase por extension".randomCaseExtension()

    println(fraseAleatoriaExtension)
}






fun imprimirFrase(frase:String):Unit{

    println("tu rase es : $frase")
}

fun randomCase(frase:String):String {

    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    //rem es para devolver el residuo de la division del numero dividido 2
    return if (resultadoAleatorio.rem(2) == 0) {
        return frase.toUpperCase()

    } else {
        frase.toLowerCase()
    }

}

    fun String.randomCaseExtension(): String {

        val numeroAleatorioExtension = 0..99
        val resultadoAleatorioExtension = numeroAleatorioExtension.random()
        //rem es para devolver el residuo de la division del numero dividido 2
        return if (resultadoAleatorioExtension.rem(2) == 0) {
            return this.toUpperCase()

        } else {
            this.toLowerCase()
        }
    }




