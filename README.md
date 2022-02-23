
# Desafio de Desenvolvimento

O objetivo deste desafio é obter uma ideia das habilidades que o candidato possui, da organização de tempo e também do código.

_Imagine que você quer fazer um sistema de escalação de times. Toda semana você vai montar um time vencedor._
_Não importa se é Esporte tradicional ou eSports_

_Exemplos de Esporte tradicional : Futebol, Basquete_

_Exemplos de eSports : Counter Strike, Valorant, Free Fire, League of Legends, APEX_

Sua tarefa é construir a melhor solução no tempo combinado, considerando os requisitos que estarão descritos abaixo.

**Você pode usar a criatividade pois não existe uma solução definitiva para o desafio.**


## Considerações Importantes

- O desafio já tem diversos códigos pré-prontos para você completar as funcionalidades. Não é preciso reinventar a roda.
- Use seu tempo de forma inteligente. Uma solução simples primeiro e depois avance.
- Comentários sempre são bem-vindos em métodos ou estruturas mais complexas.
- Parece não intuitivo mas deixe as telas por ultimo, pense na estrutura dos dados e nos métodos de gravação e exportação primeiro.
- **Utilize os testes unitários** já existentes e crie novos também, se possível. Não existe necessidade de 100% de cobertura, mas use eles para experimentar e validar sua solução.
- Faça commits **frequentes**, assim podemos ver a evolução da sua solução.
- Não se preocupe caso não consiga finalizar tudo o que é proposto no desafio. Entregue tudo o que conseguir fazer, indiferente de estar completo ou não.


## Estrutura dos Dados

### Tabela de "Integrante" :

- Id
- Franquia
- Nome
- Função

### Tabela de Time:

- Id
- Data

### Tabela de ComposicaoTime:

- Id
- Id_Time  (foreign key tabela Time)
- Id_Integrante  (foreign key tabela Integrante)

## Funcionalidades

### 1) Tratamento de dados

Esse passo é muito interessante no teste porque gostaríamos de medir a sua capacidade de lidar com estruturas de dados.
Já existe um service criado no projeto, com métodos para serem implementados.

Este passo complementa o passo 3, descrito mais abaixo.

No quadro, alguns detalhes sobre os métodos:

| Método  | Parâmetros | Descrição |
|--|--|--|
| TimeDaData | Data | Vai retornar uma lista com os nomes dos integrantes do time daquela data |
| IntegranteMaisUsado | Data inicial e Data final (podem ser null) | Vai retornar o integrante que tiver presente na maior quantidade de times dentro do período |
| TimeMaisComum | Data inicial e Data final (podem ser null) | Vai retornar uma lista com os nomes dos integrantes do time mais comum dentro do período |
| FuncaoMaisComum | Data inicial e Data final (podem ser null) | Vai retornar a função mais comum nos times dentro do período |
| FranquiaMaisFamosa | Data inicial e Data final (podem ser null) | Vai retornar o nome da Franquia mais comum nos times dentro do período |
| ContagemPorFranquia | Data inicial e Data final (podem ser null) | Vai retornar o número (quantidade) de Franquias dentro do período |
| ContagemPorFuncao | Data inicial e Data final (podem ser null) | Vai retornar o número (quantidade) de Funções dentro do período |


### 2) API de Cadastro

Lembrando: a prioridade é a funcionalidade correta, não as telas. 

#### Cadastro de Integrantes

Fazer um cadastro de integrantes para os times.

#### Cadastro de Times

Fazer um cadastro de times onde não importa muito a quantidade de integrantes. Para cadastrar um time para uma determinada semana basta escolher os personagens/integrantes que farão parte dele.


### 3) API para processamento de Dados

Seu sistema vai processar as informações do banco de dados e vai exportá-las através de endpoints.
Neste passo, colocamos uma restrição artificial: Não utilizar funções de SQL como 'count' para resolver esses processamentos. Você deve usar os selects para trazer todos os dados, mas processe eles na linguagem, através dos métodos implementados no passo 1.

| Endpoint  | Parâmetros |
|--|--|
| TimeDaData | Data | 
| IntegranteMaisUsado | Data inicial e Data final (podem ser null) |
| TimeMaisComum | Data inicial e Data final (podem ser null) |
| FuncaoMaisComum | Data inicial e Data final (podem ser null) |
| FranquiaMaisFamosa | Data inicial e Data final (podem ser null) |
| ContagemPorFranquia | Data inicial e Data final (podem ser null) |
| ContagemPorFuncao | Data inicial e Data final (podem ser null) |

Exemplos de Resultados esperados:

TimeDaData
``` 
{
  "data": 2021-01-15,
  "integrantes": [ "Bangalore", "BloodHound", "Crypto" ]
}
```

FuncaoMaisComum
``` 
{
  "Função" : "Meia"
}
```

ContagemPorFranquia
``` 
{
  "Apex Legends": 5,
  "Overwatch": 2,
  "FreeFire": 3
}
```


### 4) Telas

Conforme já foi dito as telas de cadastro tem prioridade menor do que o funcionamento da API.
Você pode fazer as telas da maneira mais simples possível e usar qualquer framework que facilite o desenvolvimento.

- Tela de Inserção de Integrantes
    - Um formulário com os campos é suficiente
- Tela de Montagem de Times pode ser feita de diversas maneiras, algumas sugestões:
    - Fazer uma listagem e colocar um checkbox ao lado de cada integrante
    - Fazer um "transfer" usando dois "selects" de html
    - Usar um componente de jquery ( https://www.jqueryscript.net/blog/best-multiple-select.html )

O importante é a tela estar funcional e a beleza não será avaliada.
