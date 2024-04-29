
# Estudos SOLID

Repositório destinado à matéria Engenharia de Software - BCC3004. 


## Principios SOLID 

### SRP (Single Responsibility Principle)

"Esse princípio é uma aplicação direta da ideia de coesão. Ele propõe o seguinte: toda classe deve ter uma única responsabilidade. Mais ainda, responsabilidade, no contexto do princípio, significa motivo para modificar uma classe. Ou seja, deve existir um único motivo para modificar qualquer classe em um sistema". Marco Tulio Valente, em seu livro "Engenharia de Software Moderna" (2014).

#### [Violação: Código de Exemplo](https://github.com/guilhermefogacadev/BCC3004/blob/main/Single-Responsibility-Principle/Produto.java)


 A classe `Produto` viola a o SRP, pois o método `calcularImposto()` adiciona uma  nova responsabilidade , ou seja , mais um motivo para modificar a classe. A  [solução](https://github.com/guilhermefogacadev/BCC3004/blob/main/Single-Responsibility-Principle/ProdutoCorreto.java)  se da com a implementação de uma `interface`, `Imposto`, que realiza o calculo separadamente.

#### [Solução: Código de Exemplo](https://github.com/guilhermefogacadev/BCC3004/blob/main/Single-Responsibility-Principle/ProdutoCorreto.java)

 ### Aberto-Fechado (Open-Close)

"...O projeto da classe prevê a possibilidade de extensões e customizações. Para isso, o projetista pode se valer de recursos como herança, funções de mais alta ordem (ou funções lambda) e padrões de projeto, como Abstract Factory, Template Method e Strategy". Marco Tulio Valente, em seu livro "Engenharia de Software Moderna" (2014).

#### [Violação: Código de Exemplo](https://github.com/guilhermefogacadev/BCC3004/blob/main/Open-Close/AnimalErrado.java)

 A classe `Animal` viola Open Close, uma vez que cada animal realiza um som especifico. Deste modo, a classe seria alterada junto a seu método `fazerSom()` para cada novo animal. A  [solução](https://github.com/guilhermefogacadev/BCC3004/blob/main/Open-Close/AnimalCorreto.java) é dada por uma `Abstract Class` e uma `Class` para cada `Animal`, por meio de `Herança`, assim cada classe realiza `Override`no método `fazerSom()`, resultando em sua devida sonoridade.

#### [Solução: Código de Exemplo](https://github.com/guilhermefogacadev/BCC3004/blob/main/Open-Close/AnimalCorreto.java)

### Liskov

"O Princípio de Substituição de Liskov explicita regras para redefinição de métodos de classes base em classes filhas". Marco Tulio Valente, em seu livro "Engenharia de Software Moderna" (2014).

#### [ Código de Exemplo](https://github.com/guilhermefogacadev/BCC3004/blob/main/Liskov/Animal.java)

 A classe `Cachorro` e `Gato` respeita `Liskov` uma vez que herdam de `Animal` ,mantendo a coerência mesmo se substituida por sua `Classe Base`. Portanto ,  uma instância `Animal` pode ser troacada por `Cachorro` e `Gato` sem modificar seu comportamento padrão.

 ### Segregação da Interface (Interface Segregation)

"O princípio define que interfaces têm que ser pequenas, coesas e, mais importante ainda, específicas para cada tipo de cliente. O objetivo é evitar que clientes dependam de interfaces com métodos que eles não vão usar. Para evitar isso, duas ou mais interfaces específicas podem, por exemplo, substituir uma interface de propósito geral.". Marco Tulio Valente, em seu livro "Engenharia de Software Moderna" (2014).

#### [ Violação: Código de Exemplo](https://github.com/guilhermefogacadev/BCC3004/blob/main/Interface-Segregation/ReprodutorDeMidiaErrado.java)

 A `interface` `ReprodutorDeMidia` viola o ISP , uma vez que implementa para `ReprodutorDeFilme` o método `assistirProximoEpisodio()`, porém não deveria ser possível essa ação. A  [solução](https://github.com/guilhermefogacadev/BCC3004/blob/main/Interface-Segregation/ReprpdutorDeMidiaCorreto.java) apresenta uma nova `interface` com o método `assistirProximoEpisodio()` que herda de `ReprodutorDeMidia`. Respeitando assim o `ISP`. 


#### [ Solução: Código de Exemplo](https://github.com/guilhermefogacadev/BCC3004/blob/main/Interface-Segregation/ReprpdutorDeMidiaCorreto.java)


