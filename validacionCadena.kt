fun verificaCadena(cadena: String): Boolean {

    if (cadena.isEmpty()) {
        return false
    }

    val primerChar = cadena[0]
    if (!primerChar.isLetter() && primerChar != '_') {
        return false
    }

    for (char in cadena) {
        if (!char.isLetterOrDigit() && char != '_') {
            return false
        }
    }

    return true
}

fun main() {

    println(verificaCadena("nombre")) // true
    println(verificaCadena("_nombre")) // true
    println(verificaCadena("_12")) // true
    println(verificaCadena("")) // false
    println(verificaCadena("012")) // false
    println(verificaCadena("no$")) // false
    
}
