const estudante = require("./estudante.json");

const stringEstudante = JSON.stringify(estudante);
console.log(stringEstudante);//string com todas as informações do objeto
console.log(typeof stringEstudante); //object

console.log(typeof stringEstudante.nome); // undefined

const objEstudante = JSON.parse(stringEstudante);

console.log(objEstudante);
console.log(typeof objEstudante);
console.log(objEstudante.nome);