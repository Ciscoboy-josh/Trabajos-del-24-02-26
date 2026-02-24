public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double velocidadMaxima;

    public Vehiculo(String marca, String modelo, double velocidadMaxima) {
     this.marca = marca;
     this.modelo = modelo;
     this.velocidadMaxima = velocidadMaxima;

    }
    public void mostrarInformacion() {
        System.out.println("Informacion del vehiculo");
        System.out.println("marca"+ marca);
        System.out.println("modelo"+ modelo);
        System.out.println("Velocidad maxima"+ velocidadMaxima);


    }
    


}                                