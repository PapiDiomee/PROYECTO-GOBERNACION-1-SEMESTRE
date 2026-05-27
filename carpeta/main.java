package carpeta;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    static ArrayList<person>                  personas     = new ArrayList<>();
    static ArrayList<contrato>                contratos    = new ArrayList<>();
    static ArrayList<SituacionAdministrativa> situaciones  = new ArrayList<>();
    static ArrayList<Incentivo>               incentivos   = new ArrayList<>();
    static ArrayList<EvaluacionMedica>        evaluaciones = new ArrayList<>();
    static ArrayList<AccidenteLaboral>        accidentes   = new ArrayList<>();
    static ArrayList<PerfilSociodemografico>  perfiles     = new ArrayList<>();

    static final String[] TIPOS_INCENTIVO = {
        "Cumpleanos (Celebra la Vida)",
        "Tiempo de servicio",
        "Reconocimiento",
        "Capacitacion"
    };

    static final String[] CONCEPTOS_MEDICOS = {
        "Apto",
        "Apto con restricciones",
        "No apto"
    };

    static final String CLAVE_DIRECTIVOS = "Directivos";

    static final Scanner           sc            = new Scanner(System.in);
    static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("d/M/yyyy");

    // MAIN //

    public static void main(String[] args) {

        Seed.personasCreadas(personas, contratos, situaciones, incentivos, evaluaciones, accidentes);
        mostrarBienvenida();
        int opcion;
        do {
            opcion = leerOpcionMenuPrincipal();
            switch (opcion) {
                case 1: menuPersonas();       break;
                case 2: menuContratos();      break;
                case 3: menuSituaciones();    break;
                case 4: menuVacaciones();     break;
                case 5: menuBienestar();      break;
                case 6: menuSeguridadYSalud();break;
            }
        } while (opcion != 0);
        System.out.println("Programa finalizado.");
    }

    public static void mostrarBienvenida() {
        System.out.println("==============================================");
        System.out.println("     SISTEMA DE GESTION DE TALENTO HUMANO");
        System.out.println("       Gobernacion - Modulo de Personal    ");
        System.out.println("==============================================");
        System.out.println("       Bienvenido al sistema de gestion");
        System.out.println("          Fecha: " + LocalDate.now());
        System.out.println("==============================================");
        System.out.print("\nPresione ENTER para continuar...");
        sc.nextLine();
    }
    
    // MENU PRINCIPAL//
    public static int leerOpcionMenuPrincipal() {
        while (true) {
            System.out.println("\n----------MENU PRINCIPAL--------");
            System.out.println();
            System.out.println("¿Que deseas hacer?");
            System.out.println();
            System.out.println("1) Gestion de Personas");
            System.out.println("2) Gestion de Contratos");
            System.out.println("3) Situaciones administrativas");
            System.out.println("4) Control de vacaciones");
            System.out.println("5) Plan de bienestar e incentivos");
            System.out.println("6) Seguridad y salud en el trabajo");
            System.out.println("0) Salir");
            System.out.print("Opcion: ");
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static int leerOpcionMenuPersonas() {
        while (true) {
            System.out.println("\n-----MODULO PERSONAS-----");
            System.out.println("1) Crear persona");
            System.out.println("2) Buscar persona por cedula");
            System.out.println("3) Mostrar todas las personas");
            System.out.println("0) Volver al menu principal.");
            System.out.print("Opcion: ");
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static int leerOpcionMenuContratos() {
        while (true) {
            System.out.println("\n-----MODULO CONTRATOS-----");
            System.out.println("1) Crear contrato");
            System.out.println("2) Buscar contrato por ID");
            System.out.println("3) Mostrar todos los contratos");
            System.out.println("4) Mostrar contratos por cedula");
            System.out.println("0) Volver al menu principal.");
            System.out.print("Opcion: ");
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static int leerOpcionMenuSituaciones() {
        while (true) {
            System.out.println("\n-----MODULO SITUACIONES ADMINISTRATIVAS-----");
            System.out.println("1) Registrar situacion administrativa");
            System.out.println("2) Consultar situacion actual de un servidor");
            System.out.println("3) Ver historial de situaciones por cedula");
            System.out.println("0) Volver al menu principal.");
            System.out.print("Opcion: ");
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static int leerOpcionMenuVacaciones() {
        while (true) {
            System.out.println("\n-----MODULO CONTROL DE VACACIONES-----");
            System.out.println("1) Ver resumen de vacaciones de un servidor");
            System.out.println("2) Ver historial de vacaciones de un servidor");
            System.out.println("3) Generar reporte de alertas (toda la planta)");
            System.out.println("0) Volver al menu principal.");
            System.out.print("Opcion: ");
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static int leerOpcionMenuBienestar() {
        while (true) {
            System.out.println("\n-----MODULO PLAN DE BIENESTAR E INCENTIVOS-----");
            System.out.println("1) Registrar incentivo");
            System.out.println("2) Consultar historial de incentivos de un servidor");
            System.out.println("3) Verificar elegibilidad de un servidor");
            System.out.println("0) Volver al menu principal.");
            System.out.print("Opcion: ");
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static int leerOpcionMenuSeguridadYSalud() {
        while (true) {
            System.out.println("\n-----MODULO SEGURIDAD Y SALUD EN EL TRABAJO-----");
            System.out.println("1) Crear perfil sociodemografico");
            System.out.println("2) Consultar perfil sociodemografico");
            System.out.println("3) Registrar evaluacion medica ocupacional");
            System.out.println("4) Consultar evaluaciones medicas de un servidor");
            System.out.println("5) Consultar condiciones medicas (vista directivos)");
            System.out.println("6) Registrar accidente o incidente laboral");
            System.out.println("7) Ver accidentes laborales de un servidor");
            System.out.println("0) Volver al menu principal.");
            System.out.print("Opcion: ");
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static int leerTipoSituacion() {
        while (true) {
            System.out.println("\nSeleccione el tipo de situacion administrativa:");
            for (int i = 0; i < SituacionAdministrativa.TIPOS.length; i++) {
                System.out.println((i + 1) + ") " + SituacionAdministrativa.TIPOS[i]);
            }
            System.out.println("0) Volver");
            System.out.print("Opcion: ");
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                if (valor == 0) return -1;
                if (valor < 1 || valor > SituacionAdministrativa.TIPOS.length) {
                    System.out.println("Valor incorrecto");
                    continue;
                }
                return valor - 1;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static int leerTipoIncentivo() {
        while (true) {
            System.out.println("\nSeleccione el tipo de incentivo:");
            for (int i = 0; i < TIPOS_INCENTIVO.length; i++) {
                System.out.println((i + 1) + ") " + TIPOS_INCENTIVO[i]);
            }
            System.out.print("Opcion: ");
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                if (valor < 1 || valor > TIPOS_INCENTIVO.length) {
                    System.out.println("Valor incorrecto");
                    continue;
                }
                return valor - 1;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static int leerConceptoMedico() {
        while (true) {
            System.out.println("\nConcepto medico:");
            for (int i = 0; i < CONCEPTOS_MEDICOS.length; i++) {
                System.out.println((i + 1) + ") " + CONCEPTOS_MEDICOS[i]);
            }
            System.out.print("Opcion: ");
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                if (valor < 1 || valor > CONCEPTOS_MEDICOS.length) {
                    System.out.println("Valor incorrecto");
                    continue;
                }
                return valor - 1;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static LocalDate leerFecha(String pregunta) {
        while (true) {
            System.out.print(pregunta);
            try {
                String entrada = sc.nextLine().trim();
                return LocalDate.parse(entrada, FORMATO_FECHA);
            } catch (DateTimeParseException e) {
                System.out.println("Valor incorrecto. Use el formato DD/MM/AAAA (ej: 5/3/2025)");
            }
        }
    }

    public static int leerIdContrato(String pregunta) {
        while (true) {
            System.out.print(pregunta);
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                if (valor <= 0) { System.out.println("Valor incorrecto"); continue; }
                return valor;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static int leerDiasIncapacidad(String pregunta) {
        while (true) {
            System.out.print(pregunta);
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                if (valor < 0) { System.out.println("Valor incorrecto"); continue; }
                return valor;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static double leerSalario(String pregunta) {
        while (true) {
            System.out.print(pregunta);
            try {
                double valor = sc.nextDouble();
                sc.nextLine();
                if (valor <= 0) { System.out.println("Valor incorrecto"); continue; }
                return valor;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    public static String leerTexto(String pregunta) {
        while (true) {
            System.out.print(pregunta);
            String valor = sc.nextLine().trim();
            if (!valor.isEmpty()) return valor;
            System.out.println("Valor incorrecto");
        }
    }

    public static String leerCedula(String pregunta) {
        while (true) {
            System.out.print(pregunta);
            String valor = sc.nextLine().trim();
            if (!valor.isEmpty() && valor.matches("\\d+")) return valor;
            System.out.println("Valor incorrecto");
        }
    }

    public static String leerCedulaExistente(String pregunta) {
        while (true) {
            System.out.print(pregunta + " (0 para cancelar): ");
            String valor = sc.nextLine().trim();
            if (valor.equals("0")) return null;
            if (valor.isEmpty() || !valor.matches("\\d+")) {
                System.out.println("Valor incorrecto");
                continue;
            }
            if (buscarPorCedula(valor) == null) {
                System.out.println("Servidor no encontrado");
                continue;
            }
            return valor;
        }
    }

    public static boolean verificarClaveDirectivos() {
        System.out.print("\nIngrese la contrasena de acceso (0 para cancelar): ");
        String clave = sc.nextLine().trim();
        if (clave.equals("0")) return false;
        if (clave.equals(CLAVE_DIRECTIVOS)) return true;
        System.out.println("Contrasena incorrecta. Acceso denegado.");
        return false;
    }

    //MENUS DE GESTIONES//
    public static void menuPersonas() {
        int op;
        do {
            op = leerOpcionMenuPersonas();
            switch (op) {
                case 1: crearPersona();  break;
                case 2: buscarPersona(); break;
                case 3: mostrarTodas();  break;
            }
        } while (op != 0);
    }

    public static void menuContratos() {
        int op;
        do {
            op = leerOpcionMenuContratos();
            switch (op) {
                case 1: crearContrato();             break;
                case 2: buscarContrato();            break;
                case 3: mostrarContratos();          break;
                case 4: mostrarContratosPorCedula(); break;
            }
        } while (op != 0);
    }

    public static void menuSituaciones() {
        int op;
        do {
            op = leerOpcionMenuSituaciones();
            switch (op) {
                case 1: registrarSituacion();       break;
                case 2: consultarSituacionActual(); break;
                case 3: verHistorialSituaciones();  break;
            }
        } while (op != 0);
    }

    public static void menuVacaciones() {
        int op;
        do {
            op = leerOpcionMenuVacaciones();
            switch (op) {
                case 1: resumenVacaciones();   break;
                case 2: historialVacaciones(); break;
                case 3: reporteAlertas();      break;
            }
        } while (op != 0);
    }

    public static void menuBienestar() {
        int op;
        do {
            op = leerOpcionMenuBienestar();
            switch (op) {
                case 1: registrarIncentivo();           break;
                case 2: consultarHistorialIncentivos(); break;
                case 3: verificarElegibilidad();        break;
            }
        } while (op != 0);
    }

    public static void menuSeguridadYSalud() {
        int op;
        do {
            op = leerOpcionMenuSeguridadYSalud();
            switch (op) {
                case 1: registrarPerfilSociodemografico(); break;
                case 2: consultarPerfilSociodemografico(); break;
                case 3: registrarEvaluacionMedica();       break;
                case 4: consultarEvaluaciones();           break;
                case 5:
                    // CAMBIO 11: contraseña requerida para vista directivos
                    if (verificarClaveDirectivos()) {
                        consultarCondicionesMedicas();
                    }
                    break;
                case 6: registrarAccidente(); break;
                case 7: verAccidentes();      break;
            }
        } while (op != 0);
    }

    public static ArrayList<person> personasOrdenadas() {
        ArrayList<person> copia = new ArrayList<>(personas);
        Collections.sort(copia, new Comparator<person>() {
            @Override
            public int compare(person a, person b) {
                return a.name.compareToIgnoreCase(b.name);
            }
        });
        return copia;
    }
    
    //GESTIONES CON PERSONAS// 
    public static void crearPersona() {
        System.out.println();

        String nombre = leerTexto("Nombre: ");
        String cedula = leerCedula("Cedula: ");
        if (buscarPorCedula(cedula) != null) {
            System.out.println("Ya existe una persona con esa cedula. Operacion cancelada.");
            return;
        }

        String genero          = leerTexto("Genero: ");
        String estado          = leerTexto("Estado Civil: ");
        String rh              = leerTexto("RH: ");
        String telefono        = leerTexto("Telefono: ");
        String email           = leerTexto("Email: ");
        LocalDate fechaIngreso = leerFecha("Fecha de Ingreso (DD/MM/AAAA): ");

        personas.add(new person(nombre, cedula, genero, estado, rh, telefono, email, fechaIngreso));
        System.out.println("\nPersona creada correctamente.");
    }

    public static person buscarPorCedula(String cedula) {
        for (person p : personas) {
            if (p.getDocument_id().equals(cedula)) return p;
        }
        return null;
    }

    public static void buscarPersona() {
        String cedula = leerCedula("Cedula: ");
        person p = buscarPorCedula(cedula);
        if (p != null) System.out.println(p);
        else System.out.println("\nPersona no encontrada.");
    }

    public static void mostrarTodas() {
        if (personas.isEmpty()) { System.out.println("\nNo hay personas registradas."); return; }
        ArrayList<person> ordenadas = personasOrdenadas();
        System.out.println("\n--- Servidores (orden alfabetico) ---");
        for (person p : ordenadas) System.out.println(p);
    }

    //GESTIONES CON CONTRATOS//
    public static void crearContrato() {
        // CAMBIO 5: no permitir IDs de contrato duplicados
        int id;
        while (true) {
            id = leerIdContrato("ID del contrato: ");
            boolean existe = false;
            for (contrato c : contratos) {
                if (c.id == id) { existe = true; break; }
            }
            if (existe) {
                System.out.println("Ya hay un contrato con este ID, ingrese otro valido.");
            } else {
                break;
            }
        }

        String cedula = leerCedula("Cedula de la persona: ");
        person p = buscarPorCedula(cedula);
        if (p == null) { System.out.println("\nLa persona no existe."); return; }
        String tipo    = leerTexto("Tipo de contrato: ");
        double salario = leerSalario("Salario: ");
        String fecha   = leerTexto("Fecha inicio: ");
        contratos.add(new contrato(id, cedula, tipo, salario, fecha));
        System.out.println("Contrato creado correctamente.");
    }

    public static void buscarContrato() {
        int id = leerIdContrato("Ingrese ID del contrato: ");
        for (contrato c : contratos) {
            if (c.id == id) { c.mostrarInfo(); return; }
        }
        System.out.println("Contrato no encontrado.");
    }

    public static void mostrarContratos() {
        if (contratos.isEmpty()) { System.out.println("\nNo hay contratos registrados."); return; }
        for (contrato c : contratos) c.mostrarInfo();
    }

    public static void mostrarContratosPorCedula() {
        String cedula = leerCedula("Ingrese cedula: ");
        boolean encontrado = false;
        for (contrato c : contratos) {
            if (c.personaCedula.equals(cedula)) {
                c.mostrarInfo();
                System.out.println("---------------------");
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("\nNo existen contratos para esa persona.");
    }

    //GESTIONES CON SITUACIONES ADMINISTRATIVAS//
    public static void registrarSituacion() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        int indiceTipo = leerTipoSituacion();
        if (indiceTipo == -1) { System.out.println("Operacion cancelada."); return; }

        String tipo = SituacionAdministrativa.TIPOS[indiceTipo];
        String acto = leerTexto("Acto administrativo (resolucion/numero) [0 para cancelar]: ");
        if (acto.equals("0")) { System.out.println("Operacion cancelada."); return; }

        LocalDate inicio;
        LocalDate fin;

        while (true) {
            inicio = leerFecha("Fecha de inicio (DD/MM/AAAA) [0 para cancelar]: ");
            fin    = leerFecha("Fecha de fin    (DD/MM/AAAA) [0 para cancelar]: ");

            if (inicio.isAfter(fin)) {
                System.out.println("La fecha de inicio no puede ser posterior a la fecha de fin.");
                continue;
            }

            boolean haySolapamiento = false;
            for (SituacionAdministrativa s : situaciones) {
                if (s.cedulaServidor.equals(cedula) && s.seSolapaCon(inicio, fin)) {
                    haySolapamiento = true;
                    System.out.println("El servidor ya tiene una situacion en esas fechas: "
                        + s.tipo + " del " + s.fechaInicio + " al " + s.fechaFin);
                    break;
                }
            }
            if (!haySolapamiento) break;
        }

        situaciones.add(new SituacionAdministrativa(cedula, tipo, inicio, fin, acto));
        System.out.println("\nSituacion administrativa registrada correctamente.");
    }

    public static void consultarSituacionActual() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        person p = buscarPorCedula(cedula);
        System.out.println("\nServidor: " + p.name + " | Cedula: " + cedula);
        System.out.println("Fecha de consulta: " + LocalDate.now());
        System.out.println("----------------------------------------");

        boolean tieneActiva = false;
        for (SituacionAdministrativa s : situaciones) {
            if (s.cedulaServidor.equals(cedula) && s.estaActiva()) {
                System.out.println("SITUACION ACTIVA:");
                s.mostrarInfo();
                tieneActiva = true;
            }
        }
        if (!tieneActiva) System.out.println("El servidor no tiene situacion activa hoy.");
    }

    public static void verHistorialSituaciones() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        person p = buscarPorCedula(cedula);
        System.out.println("\nHistorial de: " + p.name + " | Cedula: " + cedula);
        System.out.println("----------------------------------------");

        boolean hayRegistros = false;
        for (SituacionAdministrativa s : situaciones) {
            if (s.cedulaServidor.equals(cedula)) {
                s.mostrarInfo();
                System.out.println("  ........");
                hayRegistros = true;
            }
        }
        if (!hayRegistros) System.out.println("No hay situaciones registradas para este servidor.");
    }

    //GESTIONES CON CONTROL DE VACACIONES//
    public static int calcularPeriodosAcumulados(person p) {
        LocalDate hoy = LocalDate.now();
        int anios = hoy.getYear() - p.fechaIngreso.getYear();
        if (hoy.getMonthValue() < p.fechaIngreso.getMonthValue() ||
           (hoy.getMonthValue() == p.fechaIngreso.getMonthValue() &&
            hoy.getDayOfMonth() < p.fechaIngreso.getDayOfMonth())) {
            anios--;
        }
        return Math.max(anios, 0);
    }

    public static int calcularPeriodosDisfrutados(String cedula) {
        int count = 0;
        for (SituacionAdministrativa s : situaciones) {
            if (s.cedulaServidor.equals(cedula) && s.tipo.equalsIgnoreCase("Vacaciones")) count++;
        }
        return count;
    }

    public static void resumenVacaciones() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        person p        = buscarPorCedula(cedula);
        int acumulados  = calcularPeriodosAcumulados(p);
        int disfrutados = calcularPeriodosDisfrutados(cedula);
        int pendientes  = acumulados - disfrutados;

        System.out.println("\n========================================");
        System.out.println("  RESUMEN DE VACACIONES");
        System.out.println("  Servidor     : " + p.name);
        System.out.println("  Cedula       : " + cedula);
        System.out.println("  Fecha ingreso: " + p.fechaIngreso);
        System.out.println("----------------------------------------");
        System.out.println("  Periodos acumulados : " + acumulados);
        System.out.println("  Periodos disfrutados: " + disfrutados);
        System.out.println("  Periodos pendientes : " + pendientes);
        if (pendientes > 1) System.out.println("\n  *** ALERTA: Adeuda mas de un periodo de vacaciones ***");
        if (pendientes >= 1) System.out.println("  *** Debe salir a vacaciones en el periodo actual ***");
        System.out.println("========================================");
    }

    public static void historialVacaciones() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        person p = buscarPorCedula(cedula);
        System.out.println("\n========================================");
        System.out.println("  HISTORIAL DE VACACIONES");
        System.out.println("  Servidor: " + p.name + " | Cedula: " + cedula);
        System.out.println("========================================");

        boolean hay = false;
        int numero  = 1;
        for (SituacionAdministrativa s : situaciones) {
            if (s.cedulaServidor.equals(cedula) && s.tipo.equalsIgnoreCase("Vacaciones")) {
                System.out.println("\n  Periodo #" + numero);
                System.out.println("  Fecha inicio       : " + s.fechaInicio);
                System.out.println("  Fecha fin          : " + s.fechaFin);
                System.out.println("  Acto administrativo: " + s.actoAdministrativo);
                System.out.println("  Estado             : " + (s.estaActiva() ? "ACTIVA" : "Disfrutada"));
                System.out.println("  ........");
                numero++;
                hay = true;
            }
        }
        if (!hay) System.out.println("\nEste servidor no tiene vacaciones registradas.");
        System.out.println("========================================");
    }

    // CAMBIO 10: reporteAlertas usa personasOrdenadas()
    public static void reporteAlertas() {
        if (personas.isEmpty()) { System.out.println("\nNo hay servidores registrados."); return; }

        System.out.println("\n========================================");
        System.out.println("  REPORTE DE ALERTAS DE VACACIONES");
        System.out.println("  Fecha: " + LocalDate.now());
        System.out.println("========================================");

        ArrayList<person> ordenadas = personasOrdenadas();

        System.out.println("\n  [!] SERVIDORES QUE ADEUDAN MAS DE UN PERIODO:");
        System.out.println("  ----------------------------------------");
        boolean hayDeudores = false;
        for (person p : ordenadas) {
            int pendientes = calcularPeriodosAcumulados(p) - calcularPeriodosDisfrutados(p.getDocument_id());
            if (pendientes > 1) {
                System.out.println("  Servidor  : " + p.name + " | Cedula: " + p.getDocument_id());
                System.out.println("  Pendientes: " + pendientes + " periodos");
                System.out.println("  ........");
                hayDeudores = true;
            }
        }
        if (!hayDeudores) System.out.println("  Ningun servidor adeuda mas de un periodo.");

        System.out.println("\n  [>] SERVIDORES QUE DEBEN SALIR A VACACIONES (periodo actual):");
        System.out.println("  ----------------------------------------");
        boolean haySalida = false;
        for (person p : ordenadas) {
            int pendientes = calcularPeriodosAcumulados(p) - calcularPeriodosDisfrutados(p.getDocument_id());
            if (pendientes >= 1) {
                System.out.println("  Servidor  : " + p.name + " | Cedula: " + p.getDocument_id());
                System.out.println("  Pendientes: " + pendientes + " periodo(s)");
                System.out.println("  ........");
                haySalida = true;
            }
        }
        if (!haySalida) System.out.println("  Todos los servidores estan al dia con sus vacaciones.");
        System.out.println("========================================");
    }

    //GESTIONES CON PLAN DE BIENESTAR E INCENTIVOS//
    public static void registrarIncentivo() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        while (true) {
            int       indiceTipo = leerTipoIncentivo();
            String    tipo       = TIPOS_INCENTIVO[indiceTipo];
            LocalDate fecha      = leerFecha("Fecha de otorgamiento (DD/MM/AAAA): ");
            int       year       = fecha.getYear();

            boolean duplicado = false;
            for (Incentivo inv : incentivos) {
                if (inv.cedulaServidor.equals(cedula)
                        && inv.tipoIncentivo.equals(tipo)
                        && inv.year == year) {
                    duplicado = true;
                    System.out.println("\nEse servidor ya recibio \"" + tipo
                        + "\" en el year " + year + ". Elija un tipo diferente o una fecha de otro year.\n");
                    break;
                }
            }

            if (!duplicado) {
                String descripcion        = leerTexto("Descripcion del incentivo: ");
                String actoAdministrativo = leerTexto("Acto administrativo (resolucion/numero): ");
                int    id                 = incentivos.size() + 1;
                incentivos.add(new Incentivo(id, cedula, tipo, fecha, year, descripcion, actoAdministrativo));
                System.out.println("\nIncentivo registrado correctamente.");
                break;
            }
        }
    }

    public static void consultarHistorialIncentivos() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        person p = buscarPorCedula(cedula);
        System.out.println("\n========================================");
        System.out.println("  HISTORIAL DE INCENTIVOS");
        System.out.println("  Servidor: " + p.name + " | Cedula: " + cedula);
        System.out.println("========================================");

        boolean hayRegistros = false;
        for (Incentivo inv : incentivos) {
            if (inv.cedulaServidor.equals(cedula)) {
                inv.mostrarInfo();
                System.out.println("  ........");
                hayRegistros = true;
            }
        }
        if (!hayRegistros) System.out.println("No hay incentivos registrados para este servidor.");
        System.out.println("========================================");
    }

    public static void verificarElegibilidad() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        person p        = buscarPorCedula(cedula);
        int currentYear = LocalDate.now().getYear();

        System.out.println("\n==========================================");
        System.out.println("  ELEGIBILIDAD DE INCENTIVOS - Year: " + currentYear);
        System.out.println("  Servidor: " + p.name + " | Cedula: " + cedula);
        System.out.println("------------------------------------------");

        for (String tipo : TIPOS_INCENTIVO) {
            boolean yaOtorgado = false;
            for (Incentivo inv : incentivos) {
                if (inv.cedulaServidor.equals(cedula)
                        && inv.tipoIncentivo.equals(tipo)
                        && inv.year == currentYear) {
                    yaOtorgado = true;
                    break;
                }
            }
            String estado = yaOtorgado ? "NO ELEGIBLE (ya otorgado)" : "ELEGIBLE";
            System.out.printf("  %-34s: %s%n", tipo, estado);
        }
        System.out.println("==========================================");
    }

    //GESTIOMES CON SEGURIDAD Y SALUD EN EL TRABAJO//
    public static void registrarEvaluacionMedica() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        LocalDate fecha      = leerFecha("Fecha de evaluacion (DD/MM/AAAA): ");
        int indice           = leerConceptoMedico();
        String concepto      = CONCEPTOS_MEDICOS[indice];
        String observaciones = leerTexto("Observaciones: ");
        String tipoExamen    = leerTexto("Tipo de examen: ");
        String peso          = leerTexto("Peso (kg): ");
        String altura        = leerTexto("Altura (m): ");
        String restricciones = leerTexto("Restricciones: ");
        String medico        = leerTexto("Medico evaluador: ");

        evaluaciones.add(new EvaluacionMedica(cedula, fecha, concepto, observaciones, tipoExamen, peso, altura, restricciones, medico));
        System.out.println("\nEvaluacion medica registrada correctamente.");
    }

    public static void consultarEvaluaciones() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        person p = buscarPorCedula(cedula);
        System.out.println("\n========================================");
        System.out.println("  EVALUACIONES MEDICAS OCUPACIONALES");
        System.out.println("  Servidor: " + p.name + " | Cedula: " + cedula);
        System.out.println("========================================");

        boolean hay = false;
        for (EvaluacionMedica e : evaluaciones) {
            if (e.cedulaServidor.equals(cedula)) {
                e.mostrarInfo();
                System.out.println("  ........");
                hay = true;
            }
        }
        if (!hay) System.out.println("No existen evaluaciones medicas para este servidor.");
        System.out.println("========================================");
    }

    public static void consultarCondicionesMedicas() {
        if (personas.isEmpty()) { System.out.println("\nNo hay servidores registrados."); return; }

        System.out.println("\n========================================");
        System.out.println("  CONDICIONES MEDICAS - PLANTA DE PERSONAL");
        System.out.println("  (Vista autorizada para directivos)");
        System.out.println("  Fecha consulta: " + LocalDate.now());
        System.out.println("========================================");

        ArrayList<person> ordenadas = personasOrdenadas();
        for (person p : ordenadas) {
            EvaluacionMedica ultima = null;
            for (EvaluacionMedica e : evaluaciones) {
                if (e.cedulaServidor.equals(p.getDocument_id())) {
                    if (ultima == null || e.fechaEvaluacion.isAfter(ultima.fechaEvaluacion)) {
                        ultima = e;
                    }
                }
            }
            System.out.println("\n  Servidor: " + p.name + " | Cedula: " + p.getDocument_id());
            if (ultima != null) {
                System.out.println("  Ultimo concepto  : " + ultima.concepto);
                System.out.println("  Fecha evaluacion : " + ultima.fechaEvaluacion);
                System.out.println("  Observaciones    : " + ultima.observaciones);
            } else {
                System.out.println("  Sin evaluacion medica registrada.");
            }
            System.out.println("  ........");
        }
        System.out.println("========================================");
    }

    public static void registrarAccidente() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        LocalDate fecha       = leerFecha("Fecha del accidente (DD/MM/AAAA): ");
        String tipo           = leerTexto("Tipo (Accidente / Incidente): ");
        String descripcion    = leerTexto("Descripcion: ");
        String lugar          = leerTexto("Lugar del accidente: ");
        String gravedad       = leerTexto("Gravedad: ");
        String testigos       = leerTexto("Testigos: ");
        int diasIncapacidad   = leerDiasIncapacidad("Dias de incapacidad: ");
        String atencionMedica = leerTexto("Recibio atencion medica (Si/No): ");
        String causa          = leerTexto("Causa del accidente: ");

        accidentes.add(new AccidenteLaboral(cedula, fecha, tipo, descripcion, lugar, gravedad, testigos, diasIncapacidad, atencionMedica, causa));
        System.out.println("\nAccidente/incidente registrado correctamente.");
    }

    public static void verAccidentes() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        person p = buscarPorCedula(cedula);
        System.out.println("\n========================================");
        System.out.println("  ACCIDENTES E INCIDENTES LABORALES");
        System.out.println("  Servidor: " + p.name + " | Cedula: " + cedula);
        System.out.println("========================================");

        boolean hay = false;
        for (AccidenteLaboral a : accidentes) {
            if (a.cedulaServidor.equals(cedula)) {
                a.mostrarInfo();
                System.out.println("  ........");
                hay = true;
            }
        }
        if (!hay) System.out.println("No existen accidentes registrados para este servidor.");
        System.out.println("========================================");
    }

    public static void registrarPerfilSociodemografico() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        int edad;
        while (true) {
            try {
                System.out.print("Edad: ");
                edad = sc.nextInt();
                sc.nextLine();
                if (edad <= 0) { System.out.println("Edad invalida."); continue; }
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto.");
            }
        }

        String direccion       = leerTexto("Direccion: ");
        String estadoCivil     = leerTexto("Estado civil: ");
        String nivelEducativo  = leerTexto("Nivel educativo: ");

        int estrato;
        while (true) {
            try {
                System.out.print("Estrato: ");
                estrato = sc.nextInt();
                sc.nextLine();
                if (estrato < 1 || estrato > 6) { System.out.println("Estrato invalido."); continue; }
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto.");
            }
        }

        String eps   = leerTexto("EPS: ");
        String cargo = leerTexto("Cargo: ");

        String nombreTutor   = "";
        String telefonoTutor = "";

        if (edad < 18) {
            System.out.println("\nEl servidor es menor de edad.");
            nombreTutor   = leerTexto("Nombre del tutor: ");
            telefonoTutor = leerTexto("Telefono del tutor: ");
        }

        perfiles.add(new PerfilSociodemografico(cedula, edad, direccion, estadoCivil, nivelEducativo, estrato, eps, cargo, nombreTutor, telefonoTutor));
        System.out.println("\nPerfil sociodemografico registrado correctamente.");
    }

    public static void consultarPerfilSociodemografico() {
        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        boolean encontrado = false;
        for (PerfilSociodemografico p : perfiles) {
            if (p.cedulaServidor.equals(cedula)) {
                p.mostrarInfo();
                encontrado = true;
            }
        }
    if (!encontrado) System.out.println("\nNo existe perfil sociodemografico para este servidor.");
    }
}