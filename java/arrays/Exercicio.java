package arrays;

public class Exercicio {
    public static void main(String[] args) {
        
        double[] meuArray;

        meuArray = new double[5];

        meuArray[0] = 3;
        meuArray[1] = 8;
        meuArray[2] = 5;
        meuArray[3] = 9;
        meuArray[4] = 2;

        for (int i = 0; i < meuArray.length; i++){

            System.out.print(meuArray[i] + ", ");

        }

    }
}
