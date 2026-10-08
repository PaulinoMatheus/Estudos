const dados = require('./dados.json');

const produtos = JSON.parse(JSON.stringify(dados.produtos));

console.log(produtos)

console.log("Convertendo um objeto para uma string: " + JSON.stringify(produtos));