import java.util.Scanner;

import javax.swing.JOptionPane;

public class Seleccion {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, min, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

        arreglo = new int [nElementos];

        System.out.print("Rellenando el arreglo: ");
        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Metodo selección
        for(int i=0;i<(nElementos-1);i++){ // Cuantas vueltas tiene que dar
            min = i; //El elemento menor
            for(int j=i+1;j<nElementos;j++){
                if(arreglo[j] < arreglo[min]){
                    min = j; //Encontramos el elemento menor
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
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
