import java.util.Scanner;

import javax.swing.JOptionPane;

public class Burbuja {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

        arreglo = new int [nElementos];

        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Metodo burbuja
        for(int i=0;i<(nElementos-1);i++){ // Cuantas vueltas tiene que dar
            for(int j=0;j<(nElementos-1);j++){ // Ordenar el arreglo
                if(arreglo[j] > arreglo[j+1]){ //Si numeroActual > numeroSiguiente
                    aux = arreglo[j];
                    arreglo [j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }
        //Ordenado de forma creciente
        System.out.print("\nArreglo ordenado en forma creciente: ");
        for(int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
         }
        //Ordenado de forma decreciente
         System.out.print("\nArreglo ordenado en forma decreciente: ");
         for(int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" - ");
         }
     }
}
