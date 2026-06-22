package Input_Output;

import java.io.*;

public class Exemplo_IO {
    public static void main(String[] args) {
        
        try {

            // Escrevendo um arquivo
            FileWriter writer = new FileWriter("meuArquivo.txt");

            writer.write("Olá mundo!"); // Gravando os Dados

            writer.close();

            // Lendo um Arquivo
            FileReader reader = new FileReader("meuArquivo.txt");

            int data = reader.read();

            while (data != -1){

                System.out.print((char)data);
                
                data = reader.read();

            }

            reader.close();
        } catch (IOException e){
            System.out.println("Problema de IO: " + e.getMessage());
        }

    }
}