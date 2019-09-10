package comportamento.strategy

class Imprimir(private val texto: (String) -> String) {
    fun printString(string: String) {
        println(texto(string))
    }
}

val lowerCaseFormatter: (String) -> String = { it.toLowerCase() }
val upperCaseFormatter = { it: String -> it.toUpperCase() }

fun main() {

    val texto = "LOREM ipsum DOLOR sit amet"

    val lowerCase = Imprimir(lowerCaseFormatter)
    lowerCase.printString(texto)

    val upperCase = Imprimir(upperCaseFormatter)
    upperCase.printString(texto)

    val prefixo = Imprimir { "Prefix: $it" }
    prefixo.printString(texto)
}