const alunos = [
    { nome: "Ana", nota: 8 },
    { nome: "Bruno", nota: 5 },
    { nome: "Carla", nota: 9 }
];

function listaNomes(listaAlunos){
    let nomes = [];
    listaAlunos.forEach((aluno) => {
        nomes.push(aluno.nome);
    })
    return nomes;
};

console.log(listaNomes(alunos));

function mediaTurma(listaAlunos) {
    let somaDeNotas = 0;
    listaAlunos.forEach(element => {
        somaDeNotas += element.nota;
    });
    return somaDeNotas / listaAlunos.length
}

console.log("A média da turma é de: " + mediaTurma(alunos));