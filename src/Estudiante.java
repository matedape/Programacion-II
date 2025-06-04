public class Estudiante extends Persona {
    String matricula = "";
    String carrera = "";
    double promedio;

    public static void main (String[] ars)
    {
        Estudiante Rita = new Estudiante("Rita","Perez","1222",18,"martin fierro", "12345" , "2025-001", "turismo", 7);
    }
public Estudiante (String nombre,String apellido, String numeroid,
                   int edad, String direccion, String telefono, String matricula, String carrera , double promedio) {
    super(nombre, apellido, numeroid, edad, direccion, telefono);
    this.matricula= matricula;
    this.carrera = carrera;
    this.promedio = promedio;
}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }


    public void estudiar() {
        System.out.println("El estudiante " + nombre + " " + apellido + " está estudiando " + carrera + ".");
    }


    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Matrícula: " + matricula+"\n Carrera: "+ carrera + "\n Promedio : "+ promedio);
    }
}
