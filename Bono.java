
public class Bono extends Empleado {

    private double bono;

    public Bono(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    @Override
    public void calcularSalario() {
        double salarioTotal = salario + bono;
        System.out.println("Información");
        System.out.println("Nombre"+nombre);      
        System.out.println("Salario base"+salario);        
        System.out.println("Bono" + bono);
        System.out.println("Salario total" + salarioTotal);
    }
}

    

