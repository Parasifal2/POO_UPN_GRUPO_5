import java.util.UUID;

//Case
public abstract class Persona {
    //Variables privadas
    private final String id;
    private String nombre;
    private String telefono;
    private String email;

protected Persona (String nombre, String telefono, String email){
    this.id = UUID.randomUUID().toString();
    this.nombre = nombre;
    this.telefono = telefono;
    this.email = email;

}
//Getters, setters

public String getID(){ return id; }
public String getNombre() {return nombre;}
public void setNombre() {this.nombre = nombre;}

public String getTelefono() {return telefono;}
public void setTelefono () {this.telefono = telefono}

public String getEmail() {return telefono; }
public void setEmail() {this.email = email;}

}