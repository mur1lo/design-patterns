package criacao.builder

class Professor(val nome: String, val materia: Materia?) {
    class Builder {
        private var nome: String = ""
        private var materia: Materia? = null
        fun nome(nome: String) = apply { this.nome = nome }
        fun materia(materia: Materia) = apply { this.materia = materia }
        fun build() = Professor(nome, materia)
    }
}