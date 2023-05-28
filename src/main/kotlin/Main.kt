fun main(args: Array<String>) {
    val nombre ="Maria"

    //  isNotEmpty nos ayuda a saber si el nombre esta vacio o no
    if(nombre.isNotEmpty()) {
    println("El Largo de nuestra variable nombre es ${nombre.length}")
    }else{
        println("Error la variable esta vacia ")
    }


    //codigo en una sola linea
    if(nombre.isNotEmpty()) println("El Largo de nuestra variable nombre es ${nombre.length}") else
        println("Error la variable esta vacia ")


    var mensaje : String

    if(nombre.length > 4) {

        mensaje="tu nombre es largo "
    }else {
        mensaje="tu nombre es corto "
    }
    println(mensaje)

    //forma recomendada por kotlin--------------------



    val nombreDos =""
    val mensajeDos : String

    mensajeDos = if(nombreDos.length > 4) {

        "tu nombre es largoo "
    }else if(nombreDos.isEmpty()){
        "el Nombre esta vacio "
    }
    else {
        "tu nombre es corto "
    }
    println(mensajeDos)


    }