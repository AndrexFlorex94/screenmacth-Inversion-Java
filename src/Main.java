import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        //System.out.println("Pelicula Matrix");

        //Declaracion de Variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanbasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                Matriz la mejor pelicula del fin del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(sinopsis);
        System.out.println(incluidoEnElPlanbasico);


        double mediaEvaluacion = (4.5 + 4.8 + 3 )/ 3;
        System.out.println("Media de le evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula Popular en el Momento !");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");

            for (int i = 0; i < 3; i++) {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Ingresa la nota que le darias a Matrix");
                double notaMatrix = teclado.nextDouble();
                mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
            }
            System.out.println("La media de la pelicula" + "Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
        }
    }
}