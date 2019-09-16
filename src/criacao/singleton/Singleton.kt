package criacao.singleton

object Singleton {
    init {
        println("Singleton criado : $this")
    }

    fun print() = println("Imprimir com objeto: $this")
}

fun main() {
    Singleton.print()
    Singleton.print()
}