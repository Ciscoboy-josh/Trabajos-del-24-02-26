public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Información");
        System.out.println("Nombre" + nombre);       
        System.out.println("Edad" + edad  );
        System.out.println("Raza:" + raza);
        System.out.println("Sonido:Guau");
    }
}