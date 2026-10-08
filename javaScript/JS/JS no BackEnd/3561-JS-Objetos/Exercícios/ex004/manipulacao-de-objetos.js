const pessoaOriginal = {
    id: 1,
    nome: "Raquel",
    idade: 18
};

const copiaPessoa = JSON.parse(JSON.stringify(pessoaOriginal))

copiaPessoa.nome = "Ana Luiza"

console.log(copiaPessoa, pessoaOriginal)