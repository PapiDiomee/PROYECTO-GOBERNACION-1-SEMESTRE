package carpeta;

import java.time.LocalDate;

public class person {

    String name;
    String document_id;
    String gender;
    String state;
    String rh;
    String phone;
    String email;
    LocalDate fechaIngreso;

    public person(
        String nombre,
        String cedula,
        String gender,
        String state,
        String rh,
        String phone,
        String email,
        LocalDate fechaIngreso//quitar
    ) {
        this.name         = nombre;
        this.document_id  = cedula;
        this.gender       = gender;
        this.state        = state;
        this.rh           = rh;
        this.phone        = phone;
        this.email        = email;
        this.fechaIngreso = fechaIngreso;
    }

    public String getDocument_id() {
        return document_id;
    }

    @Override
    public String toString() {
        return "\nNombre: "       + name        +
               "\nCedula: "       + document_id +
               "\nGenero: "       + gender      +
               "\nEstado: "       + state       +
               "\nRH: "           + rh          +
               "\nTelefono: "     + phone       +
               "\nEmail: "        + email       +
               "\nFecha ingreso: "+ fechaIngreso;
    }
}