// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val newUser = Usuario = Usuario("Yasmin", 26);
    val newUser2 = Usuario = Usuario("Victor", 33);
    val kotlin:ConteudoEducacional = ConteudoEducacional("Kotlin", 60, Nivel.BASICO);
    val java:ConteudoEducacional = ConteudoEducacional("Java", 60, Nivel.BASICO)
    val formacao: Formacao = Formacao("DIO", listOf(kotlin, java));
    formacao.matricular(newUser);
    formacao.matricular(newUser2);
    
    println(formacao.inscritos);

}
