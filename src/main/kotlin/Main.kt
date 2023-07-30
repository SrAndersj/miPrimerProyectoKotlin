
fun main(args: Array<String>) {

    val moviles = mutableListOf("Google Pixel 2xl","Google Pixel 4a ","Huawei Redmi 9","xiaomi mi a3").apply{
        removeIf {movil -> movil.contains("Google")}
        }
        println(moviles)


        val colores :MutableList<String>?= mutableListOf("Amarillo","azul","Rojo")
        colores?.apply{
            println("nuestros colores son $this")
            println("la cantidd de colres es $size")
        }
}







