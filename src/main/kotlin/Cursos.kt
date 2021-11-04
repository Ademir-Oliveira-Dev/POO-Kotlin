import java.lang.reflect.Constructor

class Cursos (var nomeCurso : String? = null, var professor : String? = null, var ano: Int){


    val listaEstudantes = mutableListOf<Estudante?>()


    fun matricularEstudante(estudante: Estudante?){
        listaEstudantes.add(estudante)
        println("Estudante cadastrado com Sucesso!")
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

}