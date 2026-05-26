package carpeta;

import java.time.LocalDate;

public class EvaluacionMedica {

    public String cedulaServidor;
    public LocalDate fechaEvaluacion;
    public String concepto;
    public String observaciones;
    public String tipoExamen;
    public String peso;
    public String altura;
    public String restricciones;
    public String medicoEvaluador;

    public EvaluacionMedica(
        String cedulaServidor,
        LocalDate fechaEvaluacion,
        String concepto,
        String observaciones,
        String tipoExamen,
        String peso,
        String altura,
        String restricciones,
        String medicoEvaluador
    ) {

        this.cedulaServidor = cedulaServidor;
        this.fechaEvaluacion = fechaEvaluacion;
        this.concepto = concepto;
        this.observaciones = observaciones;
        this.tipoExamen = tipoExamen;
        this.peso = peso;
        this.altura = altura;
        this.restricciones = restricciones;
        this.medicoEvaluador = medicoEvaluador;
    }

    public void mostrarInfo() {

        System.out.println("\n===== EVALUACION MEDICA =====");

        System.out.println("Cedula: " + cedulaServidor);
        System.out.println("Fecha evaluacion: " + fechaEvaluacion);
        System.out.println("Tipo examen: " + tipoExamen);
        System.out.println("Concepto: " + concepto);

        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");

        System.out.println("Restricciones: " + restricciones);

        System.out.println("Observaciones: " + observaciones);

        System.out.println("Medico evaluador: " + medicoEvaluador);
    }

    
}