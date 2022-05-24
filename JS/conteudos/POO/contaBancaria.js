/**
 * Atividade: Conta Bancária
 * 
 * Nesta atividade, vamos testar os conceitos de Orientação a Objetos simulando a criação de diversos tipos de contas bancárias e operações disponíveis em cada uma.
 * 
 * Crie a classe ContaBancaria, que possui os parâmetros agencia, numero, tipo e saldo;
 * Dentro de ContaBancaria, construa o getter e o setter de saldo;
 * Dentro de ContaBancaria, crie os métodos sacar e depositar;
 * Crie uma classe-filha chamada ContaCorrente que herda todos esses parâmetros e ainda possua o parâmetro cartaoCredito;
 * Ainda em ContaCorrente, construa o getter e o setter de cartaoCredito;
 * Ainda em ContaCorrente, faça com que o tipo seja 'conta corrente' por padrão;
 * Crie uma classe-filha chamada ContaPoupanca que herda todos os parâmetros de ContaBancaria;
 * Crie uma classe-filha chamada ContaUniversitaria que herda todos os parâmetros de ContaBancaria;
 * Faça com que o método saque de ContaUniversitaria apenas seja capaz de sacar valores menores que 500 reais.
 */

class ContaBancaria{
    agencia;
    numero;
    tipo;
    saldo;

    constructor(agencia, numero, tipo){
        this.agencia = agencia;
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0;
    }

    get getSaldo(){
        return this.saldo;
    }

    set setSaldo(valor){
        this.saldo = valor;
    }

    sacar(valor){
        if(valor > this.saldo){
            return console.log('Saldo insuficiente!')
        }

        return this.saldo -= valor;
    }

    depositar(valor){
        return this.saldo += valor;
    }

}

class ContaCorrente extends ContaBancaria {
    cartaoCredito;

    constructor(agencia, numero, cartaoCredito){
        super(agencia, numero);
        this.tipo = 'conta corrente';
        this.cartaoCredito = cartaoCredito;
    }

    get getCartaoCredito(){
        return this.cartaoCredito;
    }

    set setCartaoCretido(valor){
        this.cartaoCredito = valor;
    }

}

class ContaPoupanca extends ContaBancaria {

    constructor(agencia, numero){
        super(agencia, numero)
        this.tipo = 'conta poupança'
    }
}

class ContaUniversitaria extends ContaBancaria {
    
    constructor(agencia, numero){
        super(agencia, numero)
        this.tipo = 'conta universitária'
    }

    sacar(valor){
        if (valor > 500 || valor > this.saldo){
            return console.log('Operação negada! Só é permitidos saques de até 500 reais. Ou valor insuficiente')
        }

        return this.saldo -= valor;
    }
}

const contaCorrente = new ContaCorrente(3215, 11154, true);
const contaPoupanca = new ContaPoupanca(4612, 12354);
const contaUniversitaria = new ContaUniversitaria(5456, 215487);

// console.log(contaCorrente.getSaldo);
// contaCorrente.sacar(300);
// contaCorrente.depositar(1500);
// console.log(contaCorrente.getSaldo);
// contaCorrente.sacar(1000);
// console.log(contaCorrente.getSaldo);

// console.log(contaPoupanca.getSaldo);
// contaPoupanca.sacar(300);
// contaPoupanca.depositar(1500);
// console.log(contaPoupanca.getSaldo);
// contaPoupanca.sacar(1000);
// console.log(contaPoupanca.getSaldo);

console.log(contaUniversitaria.getSaldo);
contaUniversitaria.sacar(300);
contaUniversitaria.depositar(1500);
console.log(contaUniversitaria.getSaldo);
contaUniversitaria.sacar(200);
console.log(contaUniversitaria.getSaldo);
contaUniversitaria.sacar(1000);
console.log(contaUniversitaria.getSaldo);