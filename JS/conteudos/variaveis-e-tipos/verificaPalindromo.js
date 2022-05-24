/**
 * Atividade 1
 * 
 * Verifique, de duas maneiras diferentes entre si, se uma String é um palíndromo.
 * 
 * Palíndromo: frase ou palavra que se pode ler, indiferentemente, da esquerda para a direita ou vice-versa (ex.: raiar, ama, ovo, radar)
 */


//PRIMEIRA FORMA

function verificaPalindromo(string) {
    
    if(!string || typeof string !== 'string'){
        console.log('\nTipo de dado inserido errado! Ou, Não foi passado nenhuma palavra!\n')
        return
    }
    
    // PARA CASO FOR VERIFICAR MAIS DE UMA STRING CORRETAMENTE
    // arrPalavras = string.match(/[^,|^\s]+/gm) 

    arrPalavras = string.split(' ')

    for (elem of arrPalavras) {
        
        let stringInvertida = elem.split('').reverse().join('')

        ehPalindromo = elem === stringInvertida

        ehPalindromo ? 
            console.log(`\nA palavra ${elem} é palíndromo!\n`)
            : 
            console.log(`\nA palavra ${elem} não é palíndromo! Sua forma inversa é ${stringInvertida}.\n`)
    }
}

//SEGUNDA FORMA

function outroVerificaPalindromo(string) {
    
    if(!string || typeof string !== 'string'){
        console.log('\nTipo de dado inserido errado! Ou, Não foi passado nenhuma palavra!\n')
        return
    }
    
    // PARA CASO FOR VERIFICAR MAIS DE UMA STRING CORRETAMENTE
    // arrPalavras = string.match(/[^,|^\s]+/gm) 

    arrPalavras = string.split(' ')

    for (elem of arrPalavras) {
        
        let stringInvertida = elem.split('').reverse().join('')

        for (let i = 0; i < elem.length / 2; i++){
            caractereIgual = elem[0] === elem[elem.length - 1 - i]
            
            if(!caractereIgual){
                console.log(`\nA palavra ${elem} não é palíndromo! Sua forma inversa é ${stringInvertida}.\n`)
                break
            }

            console.log(`\nA palavra ${elem} é palíndromo!\n`)
            break
        }
    }
}

// verificaPalindromo('raiar ama ovo radar')
outroVerificaPalindromo('')