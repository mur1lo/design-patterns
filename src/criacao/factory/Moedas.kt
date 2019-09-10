package criacao.factory

enum class TipoMoeda(val tipo: String) {
    EURO("EUR"), DOLAR("USD"), REAL("BRL")
}

class Dolar(override val codigo: String = TipoMoeda.DOLAR.tipo) : Moeda

class Real(override val codigo: String = TipoMoeda.REAL.tipo) : Moeda

class Euro(override val codigo: String = TipoMoeda.EURO.tipo) : Moeda