package arrays;

public class Soma100 {
    public static void main(String[] args) {
        
        int meuArray[] = new int[1000];
        int soma = 0;

        for(int i = 1; i <= 1000; i++){

            meuArray[i - 1] = i;
            soma += i;

        }

        System.out.println(soma);

    }
}
