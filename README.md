Este projeto foi desenvolvido no curso +praTI, abordando conceitos de Programação Orientada a Objetos em Java.

## Atividades

### Encapsulamento
1. **Classe Produto**
   - Classe `Produto` com atributos privados: `nome`, `preco`, `quantidadeEmEstoque`.
   - Métodos para acesso e modificação, garantindo valores não negativos.

2. **Validação de Desconto**
   - Método `aplicarDesconto(double porcentagem)` com validação de até 50%.

### Herança
3. **Hierarquia de Classes**
   - Classe `Funcionario` e subclasses `Gerente` e `Desenvolvedor`.
   - Método `calcularBonus` com 20% e 10% do salário, respectivamente.

4. **Sobrescrita de Métodos**
   - Método `trabalhar()` genérico na classe `Funcionario`, sobrescrito nas subclasses.

### Polimorfismo
5. **Interfaces**
   - Interface `IMeioTransporte` com métodos `acelerar()` e `frear()` implementados em `Carro`, `Bicicleta` e `Trem`.

6. **Classes Abstratas**
   - Classe abstrata `Animal` com método `emitirSom()`, implementado em `Cachorro`, `Gato` e `Vaca`.

### Abstração
7. **Sistema de Pagamentos**
   - Classe abstrata `FormaPagamento` com subclasses `CartaoCredito`, `Boleto` e `Pix`.

8. **Gestão de Funcionários**
   - Sistema para gerenciar `Gerente`, `Desenvolvedor` e `Estagiario`, com cálculo de salários e bônus.

## Tecnologias Utilizadas
- Java
