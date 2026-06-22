package Serialization;

import java.io.Serializable;

class Contatos implements Serializable {
    public String nome;
    public String telefone;

    public Contatos(String InitNome, String InitTelefone){
        nome = InitNome;
        telefone = InitTelefone;
    }
}
