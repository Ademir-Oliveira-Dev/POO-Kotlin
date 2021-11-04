class Estudante (var primeiroNome: String?, var ultimoNome: String?, var codigoAluno: Int){


        var mediaAluno = 0.0
        var ano = 0
        val foiAprovado : Boolean
            get(){
                return mediaAluno >= 60
            }

        constructor(primeiroNome: String?, ultimoNome: String?, codigoAluno : Int,
                    mediaAluno: Double) : this(primeiroNome, ultimoNome, codigoAluno){
                        this.mediaAluno = mediaAluno
                    }

        constructor(primeiroNome: String?, ultimoNome: String?, condigoAluno: Int,
                    mediaAluno: Double, ano : Int )
                :this(primeiroNome, ultimoNome, condigoAluno, mediaAluno){
            this.ano = ano
        }

        fun nomeCompleto(){
            println("Nome completo: $primeiroNome $ultimoNome.")
        }

        fun passouDeAno() {
            if (foiAprovado){
                ano+=1
                println("Parabéns, você passou de ano!")
            }else{
                println("Reprovado")
            }
        }

        fun mostraInformacoesAluno(){
            println("Nome: $primeiroNome $ultimoNome")
            println("Código: $codigoAluno")
            println("Média: $mediaAluno")
            println("Ano: $ano")
            println("Foi aprovado: $foiAprovado")
        }
}