const departamentos = [
    {
        id: 1,
        nome: "Vendas",
        funcionarios: [
            { id: 101, nome: "Ana", cargo: "Vendedor" },
            { id: 102, nome: "Carlos", cargo: "Gerente de vendas" }
        ]
    },
    {
        id: 2,
        nome: "TI",
        funcionarios: [
            { id: 201, nome: "Maria", cargo: "Desenvolvedor" },
            { id: 202, nome: "João", cargo: "Analista de sistemas" }
        ]
    }
]

function encontrarFuncionarioPorId(idBuscado) {
    for (const dpto of departamentos)   {
        const funcionarioBuscado = dpto.funcionarios.find(funcionario =>
            funcionario.id === idBuscado
        );

        if (funcionarioBuscado) {
            return funcionarioBuscado
        }
        return null
    }
}

console.log(encontrarFuncionarioPorId(101));