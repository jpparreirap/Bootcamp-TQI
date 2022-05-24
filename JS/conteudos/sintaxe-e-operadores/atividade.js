/**
 * Crie uma função que recebe dois números como parâmetros.
 * Confira se os números são iguais.
 * Confira se a soma dos números é maior que 10 ou menor que 20.
 * Retorne uma string dizendo "Os números num1 e num2 não/são iguais. Sua soma é soma, que é maior/menor que 10 e maior/menor que 20".
 */

function check(num1, num2){

    if(!num1 || !num2 || typeof num1 === 'object' || typeof num2 === 'object'){
        return console.log("Digite dois números!")
    }

    const ehIgual = num1 === num2
    const soma = num1 + num2
    const maior10 = soma > 10
    const menor20 = soma < 20

    let str1 = `Os números ${num1} e ${num2} são iguais.` //DEFAULT

    if(!ehIgual){
        str1 = `Os números ${num1} e ${num2} não são iguais.`
    }

    if(maior10 && menor20){
        str2 = `Sua soma é ${soma}, que é maior que 10 e menor que 20.`
    }
    else if(!maior10 && menor20){
        str2 = `Sua soma é ${soma}, que é menor que 10 e menor que 20.`
    }
    else if(!maior10 && !menor20){
        str2 = `Sua soma é ${soma}, que é menor que 10 e maior que 20.`
    }
    else{
        str2 = `Sua soma é ${soma}, que é maior que 10 e maior que 20.`
    }

    return console.log(str1, str2)
}

check(1, 20)