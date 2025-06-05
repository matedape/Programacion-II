public class Maestro extends Persona {
    String cargo = "";
    String horario = "";
    double salario ;

  public Maestro (String nombre,String apellido, String numeroid,
                   int edad, String direccion, String telefono,String cargo, String horario, double salario) {
    super(nombre,apellido,numeroid,edad,direccion,telefono);
    }
    public void setCargo() {
        if (cargo!= null && !cargo.trim().isEmpty())
        {
            this.cargo = cargo;
        }
        else {
            System.out.println("Error : no a ingresado una cargo");
            this.cargo = "Desconocido";
        }
    }
    public String getCargo() {
        return cargo;
    }
    public  void  setHorario()

    {
        if (horario != null && !horario.trim().isEmpty()) {
            this.cargo = cargo;
        } else {
            System.out.println("Error : no a ingresado una cargo");
            this.cargo = "Desconocido";
        }
    }
    public String getHorario() {
        return horario;
    }

    public double getSalario() {
        return salario;
    }

}
