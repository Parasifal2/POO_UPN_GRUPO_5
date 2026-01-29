public class Tecnico extends Persona{
    private String especialidad;

    public Tecnico (String nombre, String telefono, String email, String especialidad){
        super (nombre, telefono, email);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {return especialidad; }
    public void setEspecialidad(String especialidad) {this.especialidad = especialidad; }

    @Overridepublic String toString(){
        return "Tecnico{id=" + getId() + ", nombre= " + getNombre() + ", esp = " + especialidad + "}";
    }
}