#include <iostream>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");

    using namespace std;

    int g1, g2, g3, media,ttg;

    cout<<"informe o primeiro valor gasto no dia "<<endl;
    cin>>g1;

    cout<<"informe o segundo valor gasto no dia "<<endl;
    cin>>g2;
    
    cout<<"informe o terceiro valor gasto no dia "<<endl;
    cin>>g3;
        
    ttg = g1 + g2 + g3;

    

    media = (g1 + g2 + g3) /3;

    cout<<"Sua total de gastos foi de R$" << ttg<<endl;

    cout<<"Sua media de gastos foi de R$" << media<<endl;
    

    if (media >= 100){
        cout<<"voce ultrapassou o limite de gastos" << media <<endl;
    }

    else
    {
        cout<<"voce pode gastar mais um pouco hoje";
    }
     
}