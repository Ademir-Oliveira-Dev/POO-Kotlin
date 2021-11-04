package courses

import students.Estudante

class Cursos (private var nomeCurso : String? = null, private var professor : String? = null,
              private var ano: Int){


    private val listaEstudantes = mutableListOf<Estudante?>()


    fun matricularEstudante(estudante: Estudante?){
        listaEstudantes.add(estudante)
        println("students.Estudante cadastrado com Sucesso!")
    }

    fun matricularEstudante(estudantes : Array<Estudante?>?){
        if (estudantes != null) {
            for (i in estudantes ){
                listaEstudantes.add(i)
            }
        }
        println("Estudantes cadastrados com sucesso!")
    }

    fun descadastrarAluno(estudante: Estudante){
        if (listaEstudantes.contains(estudante)){
            listaEstudantes.remove(estudante)
            println("Estudante removido com sucesso!")
        }else{
            println("Esse estudante não existe na lista!")
        }
    }

    fun contaEstudantesCadastrados() : Int{
        println("Número de estudantes cadastrados na lista: ${listaEstudantes.size}")
        return 0
    }

    fun maiorMedia() {
        var melhorMedia: Double? = listaEstudantes[0]?.mediaAluno

        for (i in listaEstudantes){
            if (i?.mediaAluno!! > melhorMedia!!){
                melhorMedia = i.mediaAluno
            }
        }
        println("A maior nota desse curso é $melhorMedia")
    }

   fun verificarAluno(student: Array<Estudante?>?){
        println("Digite o nome do Aluno para pesquisar: ")
        var nomesAlunos = readLine()!!
        //if (student == nomesAlunos) {
            for (i in student!!){
                if (listaEstudantes.contains(i)){
                    println("O aluno está na lista!")
                }else{
                    throw Exception("O aluno não existe na lista!")
                }
            }
        }
    //}
    


}