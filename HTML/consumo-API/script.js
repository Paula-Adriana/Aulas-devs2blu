$(document).ready(function () {
    console.log('JQUERY load!');

    //esconder as info abaixo de CEP
    $('#retornoCEP').hide();

    //criar evento alteracao valor
    $('#cep').on('blur', function () {
        var inputCep = $('#cep');
        console.log(inputCep.val());

        buscaCEP(inputCep.val()).then(
            (response) => {
                console.log(response);
                if (response && response.cep !== '') {
                    $('#retornoCEP').show();
                    $('#rua').val(response.logradouro);
                    $('#bairro').val(response.bairro);
                    $('#cidade').val(response.localidade);
                    $('#uf').val(response.uf);
                }
            }
        );

    });
});

async function buscaCEP(cep) {
    var urlAPI = `http://viacep.com.br/ws/${cep}/json/`;

    //promisse js faz uma requisiçao e existe uma "promessa" de resposta
    return fetch(urlAPI).then(resp => resp.json());
};
