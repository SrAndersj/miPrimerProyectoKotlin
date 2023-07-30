
fun main(args: Array<String>) {

    val moviles = mutableListOf("Google Pixel 2xl","Google Pixel 4a ","Huawei Redmi 9","xiaomi mi a3")
        .also{
            lista -> println("el valor original de la lista es $lista")

        }.asReversed()
        println(" ")
        println(moviles)

}







