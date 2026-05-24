package carpeta;

import java.time.LocalDate;

public class person {

    String name;
    String document_id;
    String gender;
    String state;
    String rh;
    String phone;
    LocalDate fechaIngreso; // necesaria para calcular períodos de vacaciones (RF-03)

    public person(
        String nombre,
        String cedula,
        String gender,
        String state,
        String rh,
        String phone,
        LocalDate fechaIngreso
    ) {
        this.name         = nombre;
        this.document_id  = cedula;
        this.gender       = gender;
        this.state        = state;
        this.rh           = rh;
        this.phone        = phone;
        this.fechaIngreso = fechaIngreso;
    }

    public String getDocument_id() {
        return document_id;
    }

    @Override
    public String toString() {
        return "Nombre: " + name +
               ", Cedula: " + document_id +
               ", Genero: " + gender +
               ", Estado: " + state +
               ", RH: " + rh +
               ", Telefono: " + phone +
               ", Fecha ingreso: " + fechaIngreso;
    }
}
