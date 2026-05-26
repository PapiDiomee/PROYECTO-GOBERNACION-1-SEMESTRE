package carpeta;

import java.time.LocalDate;

public class AccidenteLaboral {

    public String cedulaServidor;
    public LocalDate fecha;
    public String tipo;
    public String descripcion;
    public String lugar;
    public String gravedad;
    public String testigos;
    public int diasIncapacidad;
    public String atencionMedica;
    public String causa;

    public AccidenteLaboral(
        String cedulaServidor,
        LocalDate fecha,
        String tipo,
        String descripcion,
        String lugar,
        String gravedad,
        String testigos,
        int diasIncapacidad,
        String atencionMedica,
        String causa
    ) {

        this.cedulaServidor = cedulaServidor;
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;

        this.lugar = lugar;
        this.gravedad = gravedad;
        this.testigos = testigos;
        this.diasIncapacidad = diasIncapacidad;
        this.atencionMedica = atencionMedica;
        this.causa = causa;
    }

    public void mostrarInfo() {

        System.out.println("\n===== ACCIDENTE LABORAL =====");

        System.out.println("Cedula: " + cedulaServidor);

        System.out.println("Fecha: " + fecha);

        System.out.println("Tipo: " + tipo);

        System.out.println("Descripcion: " + descripcion);

        System.out.println("Lugar: " + lugar);

        System.out.println("Gravedad: " + gravedad);

        System.out.println("Testigos: " + testigos);

        System.out.println("Dias incapacidad: " + diasIncapacidad);

        System.out.println("Atencion medica: " + atencionMedica);

        System.out.println("Causa: " + causa);
    }
}