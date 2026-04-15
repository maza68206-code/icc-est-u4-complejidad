import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidadEstudiantes = 2000000;
        int cantidadConsultas = 40_000;

        System.out.println("Generando estudiantes...");
        List<Estudiante> estudiantes = Generador.generarEstudiantes(cantidadEstudiantes);

        // BUSCAR SI EXISTE EL USR (búsqueda lineal)
        String cedulaBuscar = "51_999_993";
        for (Estudiante est : estudiantes) {
            if (est.cedula.equals(cedulaBuscar)) {
                System.out.println("EXISTE");
                break;
            }
        }

        // BÚSQUEDA BINARIA
        // int inicio = 0;
        // int fin = estudiantes.size() - 1;

        // while (inicio <= fin) {
        //     int medio = inicio + (fin - inicio) / 2;
        //     Estudiante estudianteMedio = estudiantes.get(medio);
        //     int comparacion = estudianteMedio.cedula.compareTo(cedulaBuscar);

        //     if (comparacion == 0) {
        //         System.out.println("EXISTE (binaria)");
        //         break;
        //     } else if (comparacion < 0) {
        //         inicio = medio + 1;
        //     } else {
        //         fin = medio - 1;
        //     }
        }
    }
}