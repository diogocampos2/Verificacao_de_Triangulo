import java.util.Scanner;
import java.text.DecimalFormat;
public class MyClass {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.0");
    
        float[] vet = new float[3];

        for (int i = 0; i < vet.length; i++){
            vet[i] = sc.nextFloat();
        }

        if(vet[0] + vet[1] > vet[2] && vet[0] + vet[2] > vet[1] && vet[1] + vet[2] > vet[0]){
            System.out.println("Perimetro = "  + formatador.format(vet[0] + vet[1] + vet[2]));
        }
        else {
            System.out.println("Area = "  + formatador.format(((vet[0] + vet[1]) * vet[2]) / 2f));
        }
    }
}