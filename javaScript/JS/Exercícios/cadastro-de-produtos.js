const produtos = [
    { nome: "Detergente Minuano", preco: 5.99, quantidade: 4 },
    { nome: "Sabão em Pó Ipê", preco: 14.99, quantidade: 1 },
    { nome: "Sabonete Johnsons&Jhonsons", preco: 2.99, quantidade: 3 },
];

function adicionarProduto(lista, produto) {
    lista.push(produto);
}

const novoProduto = { nome: "Chocolate Snickers", preco: 5.99, quantidade: 2 };
adicionarProduto(produtos, novoProduto);

function valorTotal(lista) {
    let valorTotal = 0;
    lista.forEach(item => {
        let precoDoItem = (item.preco * item.quantidade)
        valorTotal += precoDoItem;
    });
    return valorTotal;
}

console.log("Valor total: R$" + valorTotal(produtos).toFixed(2));

function buscarProduto(lista, produto) {
    let produtoBuscado = lista.find((element) => element.nome.toLowerCase().includes(produto.toLowerCase()));
    if(produtoBuscado){
        return produtoBuscado
    } else {
        return null;
    }
}

console.log(buscarProduto(produtos, "snickers"));

const stringProdutos = JSON.stringify(produtos, null, 2);
console.log(stringProdutos);
const produtosRecuperados = JSON.parse(stringProdutos);
console.log(produtosRecuperados)
