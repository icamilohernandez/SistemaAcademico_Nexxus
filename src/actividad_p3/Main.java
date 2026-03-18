package actividad_p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
static ArrayList<Nota> notas = new ArrayList<>();

    
    public static void main(String[] args) {
        System.out.println("Sistema funcionando");
    }
    public static void registrarNota() {
    System.out.println("\n--- REGISTRAR NOTA ---");
    
    System.out.print("Código del estudiante: ");
    String codEst = sc.nextLine();
    
    System.out.print("Código de la asignatura: ");
    String codAsig = sc.nextLine();
    
    System.out.print("Valor de la nota: ");
    double valor = sc.nextDouble();
    sc.nextLine(); // limpiar el buffer
    
    Nota nota = new Nota(codEst, codAsig, valor);
    notas.add(nota);
    
    System.out.println("Nota registrada correctamente.");
}
}