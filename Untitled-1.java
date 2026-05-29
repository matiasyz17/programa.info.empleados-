
public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("matias anaya", 2500);
        empleado1.mostrarInformacion();
    }
 }


class Empleado {
    
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    
    public double getSalario() {
        return salario;
    }

    
    public double calcularSalarioAnual() {
        return getSalario() * 12;
    }

    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario mensual: " + getSalario());
        System.out.println("Salario anual: " + calcularSalarioAnual());
    }
}

