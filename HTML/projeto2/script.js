console.log('Javascript iniciado!');

var quadradoVermelho = document.getElementById('quadrado1');
var quadradoVerde = document.getElementsByClassName('quadrado'); //retorna collection
//console.log(quadradoVermelho);

posicionaQuadrados(quadradoVerde);

//css no js
quadradoVermelho.style.width = '100px';
quadradoVermelho.style.height = '100px';

function posicionaQuadrados (collection) {
    console.log(collection);
    for (let i = 0; i < collection.length; i++) {
        const element = collection[i];        
        console.log(element);
        element.style.top = retornaPosicao('Y');
        element.style.left = retornaPosicao('X');
       // element.style.display = 'block';
    }
}

function retornaPosicao(varXY) {
    var altura = 500, largura = 500;
    var medidaRetorno; 

    if (varXY === 'X') { //left
        medidaRetorno = Math.random() * (largura - 0) + 0;
    } else { //top
        medidaRetorno = Math.random() * (altura - 0) + 0;
    }
    return `${medidaRetorno}px`;
}

