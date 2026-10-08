const animais = require('./animais.json')

console.log(animais);
animais.animais.push({ id: 4 , nome: "Cachorro", tipo: "Mamífero", habitat: "Urbano"});

console.log(animais);
animais.animais[2].habitat = "Floresta Amazônica";

console.log(animais);

animais.animais.pop(3);
console.log(animais);

console.log(JSON.stringify(animais));