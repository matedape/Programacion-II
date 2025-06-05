public class Estudiante extends Persona {
    String matricula = "";
    String carrera = "";
    double promedio;

    public static void main (String[] ars)
    {
        Estudiante Rita = new Estudiante("Rita","Perez","1222",18,"martin fierro",
                "12345" , "2025-001", "turismo", 7);
        Rita.mostrarinfo();
    }
public Estudiante (String nombre,String apellido, String numeroid,
                   int edad, String direccion, String telefono, String matricula, String carrera , double promedio) {
    super(nombre, apellido, numeroid, edad, direccion, telefono);
    this.matricula= matricula;
    this.carrera = carrera;
    this.promedio = promedio;
}

    public String getmatricula() {
        return matricula;
    }

    public void setmatricula(String matricula) {
        if (matricula!= null && !matricula.trim().isEmpty())
        {
            this.matricula = matricula;
        }
        else {
            System.out.println("Error : no a ingresado una matricula");
            this.matricula = "Desconocido";
        }
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        if (carrera!= null && !carrera.trim().isEmpty())
        {
            this.carrera = carrera;
        }
        else {
            System.out.println("Error : no a ingresado una carrera");
            this.carrera = "Desconocido";
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0)
        {
            this.promedio = promedio;
        }
        else {
            System.out.println("Error : no a ingresado un promedio");
            this.promedio = 0;
        }
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
