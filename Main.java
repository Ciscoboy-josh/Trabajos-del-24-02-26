public class Main {
    public static void main(String[] args) {

       
        Empleado empleado = new Empleado("Carlos Lopez", 3000.0);
        empleado.calcularSalario();

        System.out.println();

       
        Bono empleadoBono = new Bono("Ana Garcia", 3000.0, 800.0);
        empleadoBono.calcularSalario();
    }
}
