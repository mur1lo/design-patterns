package criacao.factory

class MoedaFactory {
    fun moedaPorPais(pais: Pais): Moeda? {
        return when (pais) {
            Pais.BR -> Real()
            Pais.US -> Dolar()
            Pais.ES, Pais.PT -> Euro()
        }
    }
}