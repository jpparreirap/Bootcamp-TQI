/**
 * Atividade 1: Alunos Aprovados
 *
 * Crie uma função que recebe o array alunos e um número que irá representar a média final;
 * Percorra o array e popule um novo array auxiliar apenas com os alunos cujas notas são maiores ou iguais à média final;
 * Utilize a técnica "object destructuring" para manipular as propriedades desejadas de cada aluno.
 */

function verificaAprovado(alunos, mediaFinal) {
    alunosAprovados = []
    
    for (i in alunos){
        let { nome, nota } = alunos[i]

        if(nota >= mediaFinal){
            alunosAprovados.push(nome)
            console.log(`Aluno ${nome}, aprovado com a média de ${nota}`)
        }
        else
            console.log(`Aluno ${nome}, reprovado com a média de ${nota}`)
    }

    return alunosAprovados
}

alunos = [
    {
        nome: 'João',
        nota: 6.5
    },
    {
        nome: 'Paulo',
        nota: 7
    },
    {
        nome: 'Maria',
        nota: 8.5
    }
]

verificaAprovado(alunos, 7)