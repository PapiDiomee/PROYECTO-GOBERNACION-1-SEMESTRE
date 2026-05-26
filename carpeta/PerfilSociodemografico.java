package carpeta;

public class PerfilSociodemografico {

    public String cedulaServidor;
    public int edad;
    public String direccion;
    public String estadoCivil;
    public String nivelEducativo;
    public int estrato;
    public String eps;
    public String cargo;
    public String nombreTutor;
    public String telefonoTutor;

    public PerfilSociodemografico(
        String cedulaServidor,
        int edad,
        String direccion,
        String estadoCivil,
        String nivelEducativo,
        int estrato,
        String eps,
        String cargo,
        String nombreTutor,
        String telefonoTutor
    ) {

        this.cedulaServidor = cedulaServidor;
        this.edad = edad;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.nivelEducativo = nivelEducativo;
        this.estrato = estrato;
        this.eps = eps;
        this.cargo = cargo;
        this.nombreTutor = nombreTutor;
        this.telefonoTutor = telefonoTutor;
    }

    public void mostrarInfo() {

        System.out.println("\n===== PERFIL SOCIODEMOGRAFICO =====");

        System.out.println("Cedula: " + cedulaServidor);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccion);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("Nivel educativo: " + nivelEducativo);
        System.out.println("Estrato: " + estrato);
        System.out.println("EPS: " + eps);
        System.out.println("Cargo: " + cargo);
        
        if (edad < 18) {
    
    System.out.println("\nEres menor de edad, porfavor ingresa la informaciĂłn del tutor.");
    System.out.println("Tutor: " + nombreTutor);
    System.out.println("Telefono tutor: " + telefonoTutor);
}
    }
}