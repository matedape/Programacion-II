public class Estudiante extends Persona {
    String matricula = "";
    String carrera = "";
    double promedio;
public Estudiante (String nombre,String apellido, String numeroid,
                   int edad, String direccion, String telefono) {
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
        System.out.println("Matrícula: " + matricula);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }
}
