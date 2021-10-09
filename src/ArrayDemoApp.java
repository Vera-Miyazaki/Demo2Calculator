public class ArrayDemoApp {
    public static void main(String[] args) {

        double[] articles = new double[5];
        articles[0] = 2.4;
        articles[1] = 2.0;
        articles[2] = 2.9;
        //nicht initialisierte Werte werden automatisch initialisiert mit 0

        //double sum = articles[0]+articles[1]+articles[2]+articles[3]+articles[4];
        // System.out.println(sum);
//double sum = 0;
//        sum = sum + articles[0]; //sum = 2.4
//        sum = sum + articles[1]; //sum = 4.4
//        sum = sum + articles[2]; //sum = 7.3
//        sum = sum + articles[3]; //sum = 7.3
//        sum = sum + articles[4]; //sum = 7.3
//
//        System.out.println(sum);

        double sumFor = 0;
        //for (int i = 0; i<5;i++) {
        //  sumFor = sumFor + articles[i];

        for (int i = 0; i < articles.length; i++) {
            sumFor = sumFor + articles[i];

            System.out.println("sumFor = " + sumFor);
        }


        int[] Array1 = new int[3];
        Array1[0] = 7;
        Array1[1] = 3;
        Array1[2] = 1;
        int[] Array2 = new int[3];
        Array2[0] = 3;
        Array2[1] = 3;
        Array2[2] = 3;

        for (int i = 0; i < Array1.length; i++) {
            System.out.print(Array1[i] + Array2[i] + ",");
        }
        System.out.println();
        for (int i = 0; i< Array1.length;i++){
            System.out.print (Array1[i] * Array2[i] +",");}
        }

    }

