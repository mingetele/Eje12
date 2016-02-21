
package eje12;

import java.util.Scanner;

public class Eje12 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int codigo = 0;
        double eva1 = 0, eva2 = 0, eva3 = 0, eva4 = 0, contCod = 0, contEva1 = 0, contEva2 = 0, contEva3 = 0, contEva4 = 0,
                contNotDef = 0, notDef = 0, perdedores =0, promeNotas, porcPerd;

        for (int i = 1; i <= 10; i++) {

            System.out.println("Digite el codigo del estudiante: ");
            codigo = lector.nextInt();
            contCod++;

            System.out.println("Digite la nota de la evaluacion 1: ");
            eva1 = lector.nextInt();
            contEva1++;
            System.out.println("Digite la nota de la evaluacion 2: ");
            eva2 = lector.nextInt();
            contEva2++;
            System.out.println("Digite la nota de la evaluacion 3: ");
            eva3 = lector.nextInt();
            contEva3++;
            System.out.println("Digite la nota de la evaluacion 4: ");
            eva4 = lector.nextInt();
            contEva4++;

            notDef = (eva1 * 0.25) + (eva2 * 0.20) + (eva3 * 0.25) + (eva4 * 0.30);
            if (notDef>=3)
                contNotDef++;
            else perdedores++;

        }
        
        promeNotas = (contNotDef + perdedores) / 10;
        porcPerd = perdedores / 10 * 100;
        
        

        System.out.println("la nota definitiva de  "+codigo+ " es " + notDef);
        
        System.out.println("El promedio de las notas definitivas es: " + promeNotas);
        System.out.println("El porcuntaje de perdedores es: " + porcPerd);
             
        
    }

}
