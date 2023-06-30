
fun main(args: Array<String>) {

    val moviles = mutableListOf("Google Pixel 2xl","Google Pixel 4a ","Huawei Redmi 9","xiaomi mi a3")
        moviles.run {
            removeIf{ movil -> movil.contains("Google")}
        }

    println(moviles)


}







