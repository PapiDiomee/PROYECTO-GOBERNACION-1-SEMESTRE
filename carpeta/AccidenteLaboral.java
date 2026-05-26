package carpeta;

import java.time.LocalDate;

public class AccidenteLaboral {

    public String    cedulaServidor;
    public LocalDate fecha;
    public String    tipo;
    public String    descripcion;

    public AccidenteLaboral(
        String    cedulaServidor,
        LocalDate fecha,
        String    tipo,
        String    descripcion
    ) {
        this.cedulaServidor = cedulaServidor;
        this.fecha          = fecha;
        this.tipo           = tipo;
        this.descripcion    = descripcion;
    }

    public void mostrarInfo() {
        System.out.println("  Cedula      : " + cedulaServidor);
        System.out.println("  Fecha       : " + fecha);
        System.out.println("  Tipo        : " + tipo);
        System.out.println("  Descripcion : " + descripcion);
    }
}