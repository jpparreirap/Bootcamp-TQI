/**
 * Atividade: API "catAPI"
 * 
 * Nesta atividade, vamos criar uma página que carrega fotos aleatórias de gatinhos sempre que clicamos em um botão.
 * 
 * Utilize a API https://thatcopy.pw/catapi/rest para fazer as chamadas com o método fetch();
 * Utilize seus conhecimentos na manipulação do DOM para criar a imagem e ativar o evento de clique do botão!
 */

const API_URL = 'https://thatcopy.pw/catapi/rest/';

const getCat = async () =>{
    try {
        const data = await fetch(API_URL);
        const json = await data.json();
        const { url } = json;

        return url;
    } catch (error) {
        console.log(error)
    }
}

const loadImg = async () =>{
    const img = document.getElementsByTagName('img')[0];
    img.src = await getCat();
}

loadImg();

const btn = document.getElementById('change-cat');
btn.addEventListener('click', loadImg)