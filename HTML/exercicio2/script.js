var user = {
    login: '',
    senha: '',
    logado: false
}

$(document).ready(() => {
    console.log('JQUERY load!');
});

function realizarLogin() {
    console.log('Login realizado')
    chamaLoad();
    var login = $('#login').val();
    var senha = $('#senha').val();

    if (login && senha) {
        user.login = login;
        user.senha = senha;
        user.logado = true;
        console.log(user);
    }
    chamaLoad(true);
   
}

function chamaLoad(destroy = false) {
    if(!destroy) {
        $('.load').show();
    } else {
        setTimeout(() => $('.load').hide(), 1000);
    }
}

function verificaLogin() {
    if (get(user)) {
    }
}

//Storage functions
function inserir(key, value) {
    if(localStorage.getItem(key)) {
        localStorage.removeItem(key);
        localStorage.setItem(key, value);
    } else {
        localStorage.setItem(key, value);
    }
}

function remover (key) {
    localStorage.removeItem(key);
}

function get(key) {
    localStorage.getItem(key);
}

