public class Maestro extends Persona {
    String Departamento = "";
    String horario = "";
    double salario;

    public static void main(String[] ars) {
        Maestro carlos = new Maestro("Carlos", "Garcia", "12000", 60, "Manuel Belgrano 900", "20003",
                "Punilla", "Lunes a viernes de 10:00 am hasta las 15:00 pm", 1200000);
        carlos.mostrarinfo();
        carlos.enseñar();
    }

    public Maestro(String nombre, String apellido, String numeroid,
                   int edad, String direccion, String telefono, String Departamento, String horario, double salario) {
        super(nombre, apellido, numeroid, edad, direccion, telefono);
        this.Departamento = Departamento;
        this.salario = salario;
        this.horario = horario;
    }

    public void setCargo(String Departamento) {
        if (Departamento != null && !Departamento.trim().isEmpty()) {
            this.Departamento = Departamento;
        } else {
            System.out.println("Error : no a ingresado un departamento");
            this.Departamento = "Desconocido";
        }
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setHorario(String horario) {
        if (horario != null && !horario.trim().isEmpty()) {
            this.horario = horario;
        } else {
            System.out.println("Error : no a ingresado un horario");
            this.horario = "Desconocido";
        }
    }

    public String getHorario() {
        return horario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error : no a ingresado un salario valido");
            this.salario = 0;
        }
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void mostrarinfo() {
        super.mostrarinfo();
        System.out.println("Departamento :" + Departamento + "\n Horario : " + horario + "\n Salario :" + salario);
    }

    public void enseñar()
    {
        System.out.println("El profesor "+ nombre+", "+apellido+ " esta enseñando en el departamento de "+ Departamento);
    }
}

