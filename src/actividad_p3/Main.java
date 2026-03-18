package actividad_p3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    static ArrayList<Nota> notas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
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
        sc.nextLine();
        
        Nota nota = new Nota(codEst, codAsig, valor);
        notas.add(nota);
        
        System.out.println("Nota registrada correctamente.");
    }
    
   
    public static void listarNotas() {
        System.out.println("\n--- LISTA DE NOTAS ---");
        
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas.");
            return;
        }
        
        for (Nota n : notas) {
            System.out.println(n);
        }
    }
    
    
    public static void buscarNota() {
        System.out.println("\n--- BUSCAR NOTA ---");
        
        System.out.print("Código del estudiante: ");
        String codEst = sc.nextLine();
        
        System.out.print("Código de la asignatura: ");
        String codAsig = sc.nextLine();
        
        for (Nota n : notas) {
            if (n.getCodigoEstudiante().equals(codEst) && n.getCodigoAsignatura().equals(codAsig)) {
                System.out.println("Nota encontrada:");
                System.out.println(n);
                return;
            }
        }
        
        System.out.println("No se encontró nota para ese estudiante y asignatura.");
    }

public static void actualizarNota() {
    System.out.println("\n--- ACTUALIZAR NOTA ---");
    
    System.out.print("Código del estudiante: ");
    String codEst = sc.nextLine();
    
    System.out.print("Código de la asignatura: ");
    String codAsig = sc.nextLine();
    
    for (Nota n : notas) {
        if (n.getCodigoEstudiante().equals(codEst) && n.getCodigoAsignatura().equals(codAsig)) {
            System.out.print("Nuevo valor de la nota: ");
            double valor = sc.nextDouble();
            sc.nextLine();
            
            n.setValorNota(valor);
            System.out.println("Nota actualizada.");
            return;
        }
    }
    
    System.out.println("No se encontró nota para ese estudiante y asignatura.");
}

public static void eliminarNota() {
    System.out.println("\n--- ELIMINAR NOTA ---");
    
    System.out.print("Código del estudiante: ");
    String codEst = sc.nextLine();
    
    System.out.print("Código de la asignatura: ");
    String codAsig = sc.nextLine();
    
    for (int i = 0; i < notas.size(); i++) {
        Nota n = notas.get(i);
        if (n.getCodigoEstudiante().equals(codEst) && n.getCodigoAsignatura().equals(codAsig)) {
            notas.remove(i);
            System.out.println("Nota eliminada.");
            return;
        }
    }
    
    System.out.println("No se encontró nota para ese estudiante y asignatura.");
}
}