public class calculadoradecalificacionesparaalumno {
    private String nombreestudiante;
    private int[] calificaciones;

    public calculadoradecalificacionesparaalumno(String nombreestudiante, int[] calificaciones) {
        this.nombreestudiante = nombreestudiante;
        this.calificaciones = calificaciones;
    }

    public double calcularpromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    public char obtenercalificacionfinal(double promedio) {
        if (promedio <= 50) return 'F';
        else if (promedio <= 60) return 'E';
        else if (promedio <= 70) return 'D';
        else if (promedio <= 80) return 'C';
        else if (promedio <= 90) return 'B';
        else return 'A';
    }

    public void imprimirresultados() {
        double promedio = calcularpromedio();
        char calificacionfinal = obtenercalificacionfinal(promedio);
        System.out.println("Nombre del estudiante: " + nombreestudiante);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Calificación: " + calificacionfinal);
    }

    public static void main(String[] args) {
        int[] calificaciones = {85, 78, 92, 67, 88};
        calculadoradecalificacionesparaalumno estudiante = new calculadoradecalificacionesparaalumno("Juan Perez", calificaciones);
        estudiante.imprimirresultados();
    }
}
