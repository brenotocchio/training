let peso = 67;
let altura = 1.77;
c = console

// imc = peso/(altura*2);
let imc = peso / (altura*altura);

c.log("Seu IMC é: ", imc.toFixed(2))

if (imc < 18.5) {
    c.log("Abaixo do peso");
}
else if(imc >= 18.5 && imc <25) {
    c.log("peso normal");
}
else if (imc >= 25 && imc <30){
    c.log("Sobrepeso");
}
else
    c.log("Obesidade")