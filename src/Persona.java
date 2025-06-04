
public class Persona {

    String nombre = "";
    String apellido = "";
    String numeroid = "";
    int edad;
    String direccion = "";
    String telefono = "";


    public static void main (String[] ars)
    {
        Persona jorge = new Persona("jorge","rojas","12342",20,"malvinas argentinas","23456");
        jorge.mostrarinfo();
    }

public Persona(String nombre,String apellido, String numeroid,int edad, String direccion, String telefono )
{
    this.nombre = nombre;
    this.apellido = apellido;
    this.numeroid = numeroid;
    this.edad = edad;
    this.direccion = direccion;
    this.telefono = telefono;
}



public void setNombre(String nombre)
{
    if (nombre!= null && !nombre.trim().isEmpty())
    {
      this.nombre = nombre;
    }
    else {
        System.out.println("Error : no a ingresado un nombre");
        this.nombre = "Desconocido";
    }
}


    public void setApellido(String apellido)
    {
        if (apellido!= null && !apellido.trim().isEmpty())
        {
            this.apellido = apellido;
        }
        else {
            System.out.println("Error : no a ingresado un apellido");
            this.apellido = "Desconocido";
        }
    }

    public void mostrarinfo()
    {

        System.out.println("Informacion de la persona :\n Nombre: "+ nombre + "\n Apellido : "+ apellido
        +"\nNuemero de identificacion : "+ numeroid+ "\n Edad : "+ edad + "\n Direccion: "+ direccion + "\n Telefono : "+ telefono);
    }

}




