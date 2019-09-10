package criacao.builder

fun main() {
    val professor = Professor.Builder().materia(Materia.CIENCIA).nome("Professor").build()
    println("Nome: ${professor.nome} e Materia: ${professor.materia}")
}