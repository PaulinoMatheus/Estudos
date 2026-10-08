const listaDeNumeros = [7, 5, 4, 3, 2, 6, 8, 10, 9, 1];

function soma(array) {
    let valorTotal = 0;
    array.forEach((element) => soma += element);
    return valorTotal;
}

console.log("A soma total dos números da lista é: " + soma(listaDeNumeros))

//----------//----------//----------//----------//----------//

function maiorValor (array) {
    let valorMax = 0;
    for (let valor of array){
        if (valor > valorMax){
            valorMax = valor
        }
    }
    return valorMax
}

console.log("O maior valor da lista é: " + maiorValor(listaDeNumeros));

//----------//----------//----------//----------//----------//

function somentePares(array){
    return array.filter((a) => a % 2 === 0).sort((a, b) => a - b);
}

console.log(somentePares(listaDeNumeros))

//----------//----------//----------//----------//----------//

