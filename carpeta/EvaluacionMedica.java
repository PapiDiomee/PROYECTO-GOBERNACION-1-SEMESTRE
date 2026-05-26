package carpeta;

import java.time.LocalDate;

public class EvaluacionMedica {

    public String    cedulaServidor;
    public LocalDate fechaEvaluacion;
    public String    concepto;
    public String    observaciones;

    public EvaluacionMedica(
        String    cedulaServidor,
        LocalDate fechaEvaluacion,
        String    concepto,
        String    observaciones
    ) {
        this.cedulaServidor  = cedulaServidor;
        this.fechaEvaluacion = fechaEvaluacion;
        this.concepto        = concepto;
        this.observaciones   = observaciones;
    }

    public void mostrarInfo() {
        System.out.println("  Cedula            : " + cedulaServidor);
        System.out.println("  Fecha evaluacion  : " + fechaEvaluacion);
        System.out.println("  Concepto          : " + concepto);
        System.out.println("  Observaciones     : " + observaciones);
    }
}