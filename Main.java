public class Main {
    public static void main(String[] args) {

   
        Animal animal = new Animal("Animal genérico", 5);
        animal.hacerSonido();

        System.out.println();
        Perro perro = new Perro("Rex", 3, "Pastor Alemán");
        perro.hacerSonido();
    }
}
