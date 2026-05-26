package carpeta;

import java.time.LocalDate;

public class Incentivo {

    public int       id;
    public String    cedulaServidor;
    public String    tipoIncentivo;
    public LocalDate fechaOtorgamiento;
    public int       year;
    public String    descripcion;
    public String    actoAdministrativo;

    public Incentivo(
        int       id,
        String    cedulaServidor,
        String    tipoIncentivo,
        LocalDate fechaOtorgamiento,
        int       year,
        String    descripcion,
        String    actoAdministrativo
    ) {
        this.id                 = id;
        this.cedulaServidor     = cedulaServidor;
        this.tipoIncentivo      = tipoIncentivo;
        this.fechaOtorgamiento  = fechaOtorgamiento;
        this.year               = year;
        this.descripcion        = descripcion;
        this.actoAdministrativo = actoAdministrativo;
    }

    public void mostrarInfo() {
        System.out.println("  ID Incentivo       : " + id);
        System.out.println("  Tipo               : " + tipoIncentivo);
        System.out.println("  Fecha otorgamiento : " + fechaOtorgamiento);
        System.out.println("  Year periodo       : " + year);
        System.out.println("  Descripcion        : " + descripcion);
        System.out.println("  Acto administrativo: " + actoAdministrativo);
    }
}