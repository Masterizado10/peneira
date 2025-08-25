prueba matrices
package pruebacodigo;
import java.util.Scanner;
public class modelo {
    int v[][]=new int[3][3];
    public static void main(String[] args) {
        modelo m=new modelo();
        m.llenarMatriz();
        m.mostrarMatriz();
    }
    public void llenarMatriz(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Ingrese el valor para la posicion ["+i+"]["+j+"]:");
                v[i][j]=sc.nextInt();
            }
        }
    }
    public void mostrarMatriz(){
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++){
                System.out.print(v[i][j]+" ");
            }
            System.out.println();
        }
    }

}
