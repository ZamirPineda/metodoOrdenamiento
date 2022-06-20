import java.util.Scanner;

import javax.swing.JOptionPane;

public class Insercion {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, pos, aux;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo: "));

        arreglo = new int [nElementos];

        for(int i=0;i<nElementos;i++){
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Método insercion
        for(int i=0;i<nElementos;i++){ // Cuantas vueltas tiene que dar
            pos = i;
            aux = arreglo[i];
        
            while((pos>0) && (arreglo[pos-1] > aux)){
                arreglo[pos] = arreglo [pos-1];
                pos--;
            }
            arreglo[pos] = aux;
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

