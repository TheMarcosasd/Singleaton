public class Main {
    public static void main(String[] ars) {
        Singleton miUnicaInstancia = Singleton.getInstance();
        miUnicaInstancia.setEdad(20);
        miUnicaInstancia.setNombre("Pepe");
        Singleton otraInstanciaSeraLaMisma = Singleton.getInstance();
        otraInstanciaSeraLaMisma.setEdad(34);
    }
}