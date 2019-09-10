package criacao.factory

class MoedaFactory {
    fun moedaPorPais(pais: Pais): Moeda? {
        return when (pais) {
            Pais.BRASIL -> Real()
            Pais.EUA -> Dolar()
        }
    }
}