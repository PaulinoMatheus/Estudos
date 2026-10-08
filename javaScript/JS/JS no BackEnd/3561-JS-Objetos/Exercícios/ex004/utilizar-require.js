const dados = require('./dados.json');

console.log(dados);
console.log(Object.keys(dados));
console.log(dados.produtos);
console.log(dados.usuarios);
console.log(dados.produtos[0]);

console.log(Object.values(dados.produtos[1]))