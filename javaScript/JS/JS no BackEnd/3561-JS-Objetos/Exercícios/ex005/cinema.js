const filmes = [
    {
        "id": 1,
        "titulo": "Matrix",
        "diretor": "Lana Wachowski",
        "anoLancamento": 1999
    },
    {
        "id": 2,
        "titulo": "Jurassic Park",
        "diretor": "Steven Spielberg",
        "anoLancamento": 1993
    },
    {
        "id": 3,
        "titulo": "Inception",
        "diretor": "Christopher Nolan",
        "anoLancamento": 2010
    }
]

function filtrarFilmesPorAno(lista, anoBuscado){
    return lista.filter((filme) => {
       return filme.anoLancamento === anoBuscado
    })
}

console.log(filtrarFilmesPorAno(filmes, 2010))
console.log(filtrarFilmesPorAno(filmes, 1999))