package Serialization;

import java.io.*;
import java.util.*;

public class ExemploSerializacao {

    // Método para Serializar os contatos
    private static void serializarContatos(List<Contatos> listaContatos) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("agenda.ser"))){
            outputStream.writeObject(listaContatos);
            System.out.println("Contatos serializados e salvos com sucesso!");
        }
    }

    // Método para deserealizar e exibir contatos
    @SuppressWarnings("unchecked")
    private static void deserializarContatos() throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("agenda.ser"))){
            List<Contatos> contatosLidos = (List<Contatos>) inputStream.readObject();
            for (Contatos contato : contatosLidos) {
                System.out.println("Nome: " + contato.nome + ", Telefone: " + contato.telefone);
            }
        }
    }

    public static void main(String[] args) {
        Contatos contato1 = new Contatos("Breno", "(18) 99697-2908");
        Contatos contato2 = new Contatos("Maria", "(18) 99825-6904");
        Contatos contato3 = new Contatos("Pai", "(18) 99421-2548");

        List<Contatos> listaContatos = new ArrayList<>();
        listaContatos.add(contato1);
        listaContatos.add(contato2);
        listaContatos.add(contato3);

        try {
            serializarContatos(listaContatos);
            deserializarContatos();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao manipular contatos: " + e.getMessage());
        }
    }
}
