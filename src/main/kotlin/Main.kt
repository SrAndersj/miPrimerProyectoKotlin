fun main(args: Array<String>) {
    //convertir un nulable a un no nulable

    var nombre:String?=null

   //operador elvis ?: asigna un valor por defecto
    //en el momento que una propiedad sea nula
    val caracterDeNombre:Int=nombre?.length?:0

    println(caracterDeNombre)



    }



