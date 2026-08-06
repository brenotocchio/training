#include <iostream>
#include <locale.h>

int main(){

    setlocale(LC_ALL, "Portuguese");
    using namespace std;

    double nota1, menorNota;
    int totalAlunos = 0, somaNotas = 0, maior8 = 0;
    bool primeiraNota = true;
    double maiorNota = 0;


    while (true)
    {
        cout<<"Digite a nota do aluno: (Escreva -1 para sair.)"<<endl;
        cin>>nota1;

        if (nota1 == -1)
        {
            break;
        }

        totalAlunos++;

        nota1 += somaNotas;

        if (nota1 >= 8)
        {
            maior8++;
        }

        // Menor nota

        if (primeiraNota)
        {
            menorNota = nota1;
            primeiraNota = false;
        } 
        
        if (nota1 < menorNota)
        {
            nota1 = menorNota;
        }

        // Maior nota

        if (nota1 > maiorNota)
        {
            maiorNota = nota1;
        }
        
    }

    double media = somaNotas/totalAlunos;

    cout<<"Quantidade total de alunos cadastrados: "<< totalAlunos <<endl;
    cout<<"Soma de todas as notas: " << somaNotas << endl;
    cout<<"Média notas: " << media << endl;
    cout<<"Maior nota: " << maiorNota << endl;
    cout<<"Menor nota: " << menorNota << endl;
    cout<<"Total de alunos que tiraram mais que 8: "<< maior8 << endl;
    

}