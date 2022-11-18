public class Nombres {
    public static void main(String[] args) {
        String[] nombres = {"Matias", " Jesús", " Alicata"};
        String nombreCompleto = "";
        for (String nombre : nombres){
            nombreCompleto += nombre;
        }
        System.out.println("Nombre y Apellido: " + nombreCompleto);
    }
}
