import java.time.LocalDateTime;
import java.util.UUID;

public class EventoTicket {
    private final String id;
    private final LocalDateTime fecha;
    private final TipoEvento tipo;
    private final String descripcion;
    private final String responsable;

    public EventoTicket(TipoEvento tipo, String descripcion, String responsable) {
        this.id = UUID.randomUUID().toString();
        this.fecha = LocalDateTime.now();
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.responsable = responsable;
    }

    public String getId() { return id; }
    public LocalDateTime getFecha() { return fecha; }
    public TipoEvento getTipo() { return tipo; }
    public String getDescripcion() { return descripcion; }
    public String getResponsable() { return responsable; }

    @Override
    public String toString() {
        return "[" + fecha + "] " + tipo + " - " + descripcion + " (" + responsable + ")";
    }
}
