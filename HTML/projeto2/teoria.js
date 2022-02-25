
//var é global
//let é local
//const não muda de estado

var  texto = 'Texto JS';
console.log(texto);

texto = 200;
console.log(texto);

//Objeto
texto = {
    id: 1,
    textoHTML: 'Meu texto objeto'
};
console.log(texto);

//var texto = objeto
//criando atributo atualizado
texto.atualizado = true;
console.log(texto);

//Transformando em metodo
texto.exibeTexto = function(){
    console.log(this.id + ' - ' + this.textoHTML);
    //alert(this.id + ' - ' + this.textoHTML);
}
texto.exibeTexto();

//html collections ?
