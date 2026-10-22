const { log } = require('console');
const fs = require('fs');
const { text } = require('stream/consumers');

const caminhoArquivo = process.argv;
const link = caminhoArquivo[2]
fs.readFile(link, "utf-8", (err, data) => {
    if (err) throw err;
    quebraEmParagrafos(data)
    // verificaPalavrasDuplicadas(data)
})

// criar um array com as palavras
// contas as ocorrências
// montar um objeto com o resultado

// {
//     "web": 5,
//     "computador": 4,

// }

function quebraEmParagrafos (texto) {
    const paragrafos = texto.toLowerCase().split("\n");
    const contagem = paragrafos.map((paragrafo) => {
        return verificaPalavrasDuplicadas(paragrafo)
    });
    console.log(contagem);
}
function verificaPalavrasDuplicadas(texto) {
    const listaPalavras = texto.split(" ");
    const resultado = {};
    // objeto[propriedade] = valor;
    listaPalavras.forEach(palavra => {
        resultado[palavra] = (resultado[palavra] || 0) + 1
    });
    return resultado;
}
