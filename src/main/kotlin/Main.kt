fun main(args: Array<String>) {

    val edadDeSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99

    )
    println(edadDeSuperHeroes)

    val edadSuperHeroesMutable = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99

    )

    println(edadSuperHeroesMutable)

    edadSuperHeroesMutable.put("Thor",45)
    edadSuperHeroesMutable["wolverin"] = 145
    println(edadSuperHeroesMutable)

    val edadIronman =edadSuperHeroesMutable["Ironman"]

    println(edadIronman)

    edadSuperHeroesMutable.remove("wolverin")
    println(edadSuperHeroesMutable)

    println(edadSuperHeroesMutable.keys)
    println(edadSuperHeroesMutable.values)





}





