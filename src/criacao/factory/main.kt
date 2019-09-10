package criacao.factory

fun main() {
    val moedaDisponivel = "Nenhuma moeda disponivel"
    val codigoBrasil = MoedaFactory().moedaPorPais(Pais.BRASIL)?.codigo ?: moedaDisponivel
    println("Brasil moeda: $codigoBrasil")
}