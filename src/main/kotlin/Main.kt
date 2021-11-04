fun main(args: Array<String>) {

    val alunoUm = Estudante("Ademir", "Oliveira", 112,
        70.0, 9)

    val alunoDois = Estudante("Esther", "Castellano", 113,
        70.0, 9)

    val alunoTres = Estudante("Camila", "Campos", 114,
        70.0, 9)

    val alunoQuatro = Estudante("Sandra", "Regina", 115,
        70.0, 9)


    alunoUm.nomeCompleto()
    alunoUm.passouDeAno()

    val cursoUm = Cursos("Filosofia", "Sandra", 5)
    cursoUm.matricularEstudante(alunoTres)
    cursoUm.matricularEstudante(alunoQuatro)

    cursoUm.contaEstudantesCadastrados()

    val listaEstudantes: Array<Estudante?> = arrayOf(alunoUm, alunoDois)

    cursoUm.matricularEstudante(listaEstudantes)
    cursoUm.maiorMedia()


}