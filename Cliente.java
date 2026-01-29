public class Cliente extends Persona{
    public Cliente (String nombre, String telefono, String email){
        super(nombre,telefono,email)
    }

    @Override
    public String toString(){
        return "Cliente{id=" + getId() + ", nombre= " + getNombre() + "}";
    }
}