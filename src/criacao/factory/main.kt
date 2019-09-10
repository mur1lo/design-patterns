package criacao.factory

fun main() {
    val pais = Pais.BR
    val codigoMoeda = MoedaFactory().moedaPorPais(pais)?.codigo ?: "Nenhuma moeda disponivel"
    println("${pais.nome} moeda: $codigoMoeda")
}