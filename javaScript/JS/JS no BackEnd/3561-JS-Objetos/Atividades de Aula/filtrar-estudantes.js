const estudantes = require('./estudantes.json');

function filtrarPorPropriedade(lista, propriedade){
    return lista.filter((estudante) => {
        return !estudante.endereco.hasOwnProperty(propriedade);
    })
}

const listaDeEnderecosIncompletos = filtrarPorPropriedade(estudantes, 'cep');
console.log(listaDeEnderecosIncompletos);