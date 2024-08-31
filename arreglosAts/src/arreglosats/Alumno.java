
package arreglosats;


public class Alumno {
    private int codigo;
    private String nombre;
    private double nota1;
    private double nota2;
    
    // Constructor
    public Alumno(int codigo, String nombre, double nota1, double nota2) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    // Método para calcular el promedio
    public double promedio() {
        return (nota1 + nota2) / 2;
    }
    
    // Método para determinar la condición (aprobado o desaprobado)
    public String condicion() {
        if (promedio() >= 12) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }
    
    // Método para obtener el código del alumno
    public int getCodigo() {
        return codigo;
    }
    
    // Método para obtener el nombre del alumno
    public String getNombre() {
        return nombre;
    }
    
    // Método para obtener la nota 1 del alumno
    public double getNota1() {
        return nota1;
    }
    
    // Método para obtener la nota 2 del alumno
    public double getNota2() {
        return nota2;
    }
    
    public static void main(String[] args) {
        // Ejemplo de uso
        Alumno alumno1 = new Alumno(1, "Juan", 15, 10);
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Código: " + alumno1.getCodigo());
        System.out.println("Nota 1: " + alumno1.getNota1());
        System.out.println("Nota 2: " + alumno1.getNota2());
        System.out.println("Promedio: " + alumno1.promedio());
        System.out.println("Condición: " + alumno1.condicion());
    }
}
    


