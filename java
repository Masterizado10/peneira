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

tomogochi como lo iba pensando
package pruebacodigo;

public class Mascota {
    private float energia;
    private float humor;
    
    public Mascota(int energia, int humor) {
        if (energia < 0 || energia > 100) {
            throw new IllegalArgumentException("La energía debe estar entre 0 y 100.");
        }
        if (humor < 0 || humor > 5) {
            throw new IllegalArgumentException("El humor debe estar entre 0 y 5.");
        }
        this.energia = energia;
        this.humor = humor;
    }
    public void comer() {
        if (energia < 100) {
            energia = 10*energia/100 + energia;
            if (energia > 100) {
                energia = 100;
            }
            System.out.println("La mascota ha comido. Energía actual: " + energia);
        } else {
            System.out.println("La mascota ya tiene la energía al máximo.");
        }
    }
    public void beber() {
        if (humor < 5) {
            humor= 5*humor/100 + humor;
            System.out.println("La mascota ha bebido. Humor actual: " + humor);
        } else {
            System.out.println("La mascota ya tiene el humor al máximo.");
        }
    }

    public static void main(String[] args) {
        Mascota mascota = new Mascota(80, 4);
        System.out.println("Energía inicial: " + mascota.energia);
        System.out.println("Humor inicial: " + mascota.humor);
        mascota.comer();
        mascota.beber();
    }
}



