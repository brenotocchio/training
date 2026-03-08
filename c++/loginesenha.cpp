    #include <iostream>
    #include <locale.h>
    #include <string>

    using namespace std;

    int main(){

         setlocale(LC_ALL, "Portuguese");

        string user, sen, t_user, t_sen;
        int op;
        bool cadastrado = false;

        while (true)
        {
            cout<<"Digite 1- Cadastrar usuário // Digite 2- Logar usuário: // 3- Sair"<<endl;
            cin>>op;

                switch (op)
            {
            case 1:
                if (cadastrado)
                {
                    cout<<"Usuário já cadastrado."<<endl;
                    break;
                }
                
                cout<<"Digite seu usuário: "<<endl;
                cin>>user;

                cout<<"Digite sua senha: "<<endl;
                cin>>sen;

                cadastrado = true;

                cout<<"Usuário cadastrado com sucesso!"<<endl;
                break;
            
            case 2:

                if (cadastrado == false){
                    cout<<"Nenhum cadastro realizado!"<<endl;
                    break;
                }
                
                cout<<"Realizar login"<<endl;
                cout<<"Digite seu usuário: "<<endl;
                cin>>t_user;

                cout<<"Digite sua senha: "<<endl;
                cin>>t_sen;

                if(t_user == user && t_sen == sen){
                    cout<<"Logado com sucesso!"<<endl;
                }
                else{
                    cout<<"Usuário ou senha incorreto"<<endl;
                }
                break;

            case 3:
                cout<<"Saindo do sistema..."<<endl;
                return 0;

            default:
                cout<<"Opção inexistente."<<endl;
                break;
            }
        }
        return 0;

    }
