package carpeta;

import java.time.LocalDate;

public class SituacionAdministrativa {

    public static final String[] TIPOS = {
        "Vacaciones",
        "Permiso (1 dia)",
        "Permiso (2-3 dias)",
        "Licencia remunerada",
        "Licencia no remunerada",
        "Licencia de maternidad",
        "Licencia de paternidad",
        "Licencia por enfermedad",
        "Encargo",
        "Traslado",
        "Comision"
    };

    public String  cedulaServidor;
    public String  tipo;
    public LocalDate fechaInicio;
    public LocalDate fechaFin;
    public String  actoAdministrativo; 

    public SituacionAdministrativa(
        String cedulaServidor,
        String tipo,
        LocalDate fechaInicio,
        LocalDate fechaFin,
        String actoAdministrativo
    ) {
        this.cedulaServidor     = cedulaServidor;
        this.tipo               = tipo;
        this.fechaInicio        = fechaInicio;
        this.fechaFin           = fechaFin;
        this.actoAdministrativo = actoAdministrativo;
    }

    public boolean seSolapaCon(LocalDate inicio, LocalDate fin) {
        return !this.fechaFin.isBefore(inicio) && !fin.isBefore(this.fechaInicio);
    }

    public boolean estaActiva() {
        LocalDate hoy = LocalDate.now();
        return !hoy.isBefore(fechaInicio) && !hoy.isAfter(fechaFin);
    }

    public void mostrarInfo() {
        System.out.println("  Tipo              : " + tipo);
        System.out.println("  Fecha inicio      : " + fechaInicio);
        System.out.println("  Fecha fin         : " + fechaFin);
        System.out.println("  Acto administrativo: " + actoAdministrativo);
        System.out.println("  Estado            : " + (estaActiva() ? "ACTIVA" : "Inactiva"));
    }
}
