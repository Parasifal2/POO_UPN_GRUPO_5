import java.util.UUID;

public class Domicilio{
    private final String id;
    private String direccion;
    private String ciudad;
    private String referencia;

    public Domicilio (String direccion, String ciudad, String referencia){
        this.id = UUID.randomUUID().toString();
        this direccion = direccion;
        this.ciudad = ciudad;
        this.referencia = referencia;
    }

    public String getId(){
        return id;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getReferencia(){
        return referencia;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setCiudad(String ciudad){
        this.ciudad = ciudad;
    }

    public void setReferencia(String referencia){
        this.referencia = referencia;
    }

    @Override
    public String toString(){
        return "El domicilio { id: " + id + ", " + direccion + ", " + ciudad + " }"
    }
}