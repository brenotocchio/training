package poo;

class Personagem {
    
    String nome;
    int nivelPoder;

    Personagem(String nome, int nivelPoder){
        this.nome = nome;
        this.nivelPoder = nivelPoder;
    }

    public void tentarAumentarNivelPoder(int nivel){
        nivel += 10;
    }

    public void mudarNome(Personagem personagem){
        personagem.nome = "Pedro";
    }

    public static void main(String[] args) {
        
        Personagem personagem = new Personagem("Breno", 5);

        // NIVEL PODER
        
        System.out.println("Nível de poder: " + personagem.nivelPoder);

        personagem.tentarAumentarNivelPoder(personagem.nivelPoder);

        System.out.println("Novo nível de poder: " + personagem.nivelPoder);

        System.out.println();

        // NOME

        System.out.println("Nome: " + personagem.nome);

        personagem.mudarNome(personagem);

        System.out.println("Novo nome: " + personagem.nome);

    }

}
