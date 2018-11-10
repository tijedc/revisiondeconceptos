public class Alumno {
    
    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;
        if (nombre.length() < 3){
            System.out.println("El nombre debe de tener más de tres caracteres");
        }
        if (numeroMatricula.length() < 4){
            System.out.println("El numero de matricula debe de tener más de cuatro caracteres");
        }
    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }
    
    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " aÃ±os");
    }
    
    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        int numeroCaracteresNombre;
        int numeroCaracteresMatricula;
        if(nombre.length() < 3){
           numeroCaracteresNombre = nombre.length();
        }
        else{
            numeroCaracteresNombre = 3;
        }
        
        if(numeroMatricula.length() < 4){
            numeroCaracteresMatricula = numeroMatricula.length();
        }
        else{
            numeroCaracteresMatricula = 4;
        }
        return nombre.substring(0, numeroCaracteresNombre) + numeroMatricula.substring(0, numeroCaracteresMatricula);
    }
}
