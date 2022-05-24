/**
 * Atividade: Light Mode/Dark Mode
 * 
 * Crie uma estrutura básica de projeto front-end (HTML, CSS e JS)
 * Copie o HTML e o CSS deste repositório
 * Crie um arquivo chamado scripts.js na sua pasta assets/js
 * Selecione os elementos: h1, button, footer e body
 * Se os elementos possuirem a classe dark-mode, modifique seus estilos. Caso contrário, volte os estilos para o original
 */

const h1 = document.getElementById('page-title')
const btn = document.getElementById('mode-selector')
const footer = document.getElementsByTagName('footer')[0]
const body = document.getElementsByTagName('body')[0]
const darkMode = 'dark-mode';

function changeMode(){
    h1.classList.toggle(darkMode);
    btn.classList.toggle(darkMode);
    footer.classList.toggle(darkMode);
    body.classList.toggle(darkMode);

    if(body.classList.contains(darkMode)){
        h1.innerHTML = 'Dark Mode ON'
        btn.innerHTML = 'Light Mode'
        return;
    }

    h1.innerHTML = 'Light Mode ON'
    btn.innerHTML = 'Dark Mode'
}

btn.addEventListener('click', changeMode)