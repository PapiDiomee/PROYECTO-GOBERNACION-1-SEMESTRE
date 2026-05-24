package carpeta;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    static ArrayList<person> personas = new ArrayList<>();
    static ArrayList<contrato> contratos = new ArrayList<>();
    static ArrayList<SituacionAdministrativa> situaciones = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {

        int opcion;

        do {
            opcion = leerOpcionMenuPrincipal();

            switch (opcion) {
                case 1: menuPersonas();    break;
                case 2: menuContratos();   break;
                case 3: menuSituaciones(); break;
                case 4: menuVacaciones();  break;
            }

        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }

    // ================================================================
    // MÉTODOS DE LECTURA — Patrón: Pregunta → Try → Catch
    // La pregunta/menú se imprime DENTRO del bucle (Paso A),
    // así se repinta automáticamente tras cualquier error.
    // ================================================================

    /** Menú principal. */
    public static int leerOpcionMenuPrincipal() {

        while (true) {

            // PASO A
            System.out.println("\n¿Que deseas hacer?");
            System.out.println("1) Operaciones de las personas");
            System.out.println("2) Operaciones de los contratos");
            System.out.println("3) Situaciones administrativas");
            System.out.println("4) Control de vacaciones");
            System.out.println("0) Salir");
            System.out.print("Opcion: ");

            // PASO B
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            // PASO C
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    /** Menú de personas. */
    public static int leerOpcionMenuPersonas() {

        while (true) {

            // PASO A
            System.out.println("\n-----MODULO PERSONAS-----");
            System.out.println("1) Crear persona");
            System.out.println("2) Buscar persona por cedula");
            System.out.println("3) Mostrar todas las personas");
            System.out.println("0) Volver al menu principal.");
            System.out.print("Opcion: ");

            // PASO B
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            // PASO C
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    /** Menú de contratos. */
    public static int leerOpcionMenuContratos() {

        while (true) {

            // PASO A
            System.out.println("\n-----MODULO CONTRATOS-----");
            System.out.println("1) Crear contrato");
            System.out.println("2) Buscar contrato por ID");
            System.out.println("3) Mostrar todos los contratos");
            System.out.println("4) Mostrar contratos por cedula");
            System.out.println("0) Volver al menu principal.");
            System.out.print("Opcion: ");

            // PASO B
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            // PASO C
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    /** Menú de situaciones administrativas (RF-02). */
    public static int leerOpcionMenuSituaciones() {

        while (true) {

            // PASO A
            System.out.println("\n-----MODULO SITUACIONES ADMINISTRATIVAS-----");
            System.out.println("1) Registrar situacion administrativa");
            System.out.println("2) Consultar situacion actual de un servidor");
            System.out.println("3) Ver historial de situaciones por cedula");
            System.out.println("0) Volver al menu principal.");
            System.out.print("Opcion: ");

            // PASO B
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            // PASO C
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    /** Menú de control de vacaciones (RF-03). */
    public static int leerOpcionMenuVacaciones() {

        while (true) {

            // PASO A
            System.out.println("\n-----MODULO CONTROL DE VACACIONES-----");
            System.out.println("1) Ver resumen de vacaciones de un servidor");
            System.out.println("2) Ver historial de vacaciones de un servidor");
            System.out.println("3) Generar reporte de alertas (toda la planta)");
            System.out.println("0) Volver al menu principal.");
            System.out.print("Opcion: ");

            // PASO B
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            // PASO C
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    /**
     * Muestra la lista numerada de tipos de situación y pide al usuario
     * que elija uno. Se reimprime la lista completa si el input es inválido.
     */
    public static int leerTipoSituacion() {

        while (true) {

            // PASO A
            System.out.println("\nSeleccione el tipo de situacion administrativa:");
            for (int i = 0; i < SituacionAdministrativa.TIPOS.length; i++) {
                System.out.println((i + 1) + ") " + SituacionAdministrativa.TIPOS[i]);
            }
            System.out.print("Opcion: ");

            // PASO B
            try {
                int valor = sc.nextInt();
                sc.nextLine();

                if (valor < 1 || valor > SituacionAdministrativa.TIPOS.length) {
                    System.out.println("Valor incorrecto");
                    continue;
                }

                return valor - 1; // índice 0-based
            // PASO C
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    /**
     * Lee una fecha en formato DD/MM/AAAA.
     * La pregunta se reimprime si el formato es inválido.
     */
    public static LocalDate leerFecha(String pregunta) {

        while (true) {

            // PASO A
            System.out.print(pregunta);

            // PASO B
            try {
                String entrada = sc.nextLine().trim();
                return LocalDate.parse(entrada, FORMATO_FECHA);
            // PASO C
            } catch (DateTimeParseException e) {
                System.out.println("Valor incorrecto");
            }
        }
    }

    /** Lee el ID de un contrato (entero positivo). */
    public static int leerIdContrato(String pregunta) {

        while (true) {

            // PASO A
            System.out.print(pregunta);

            // PASO B
            try {
                int valor = sc.nextInt();
                sc.nextLine();

                if (valor <= 0) {
                    System.out.println("Valor incorrecto");
                    continue;
                }

                return valor;
            // PASO C
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    /** Lee un salario (decimal positivo). */
    public static double leerSalario(String pregunta) {

        while (true) {

            // PASO A
            System.out.print(pregunta);

            // PASO B
            try {
                double valor = sc.nextDouble();
                sc.nextLine();

                if (valor <= 0) {
                    System.out.println("Valor incorrecto");
                    continue;
                }

                return valor;
            // PASO C
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Valor incorrecto");
            }
        }
    }

    /** Lee una cadena de texto no vacía. */
    public static String leerTexto(String pregunta) {

        while (true) {

            // PASO A
            System.out.print(pregunta);

            // PASO B
            String valor = sc.nextLine().trim();

            if (!valor.isEmpty()) {
                return valor;
            }

            // PASO C
            System.out.println("Valor incorrecto");
        }
    }

    /** Lee una cédula (solo dígitos, no vacía). */
    public static String leerCedula(String pregunta) {

        while (true) {

            // PASO A
            System.out.print(pregunta);

            // PASO B
            String valor = sc.nextLine().trim();

            if (!valor.isEmpty() && valor.matches("\\d+")) {
                return valor;
            }

            // PASO C
            System.out.println("Valor incorrecto");
        }
    }

    /**
     * Lee una cédula que además debe existir en el ArrayList de personas.
     * Escribe 0 para cancelar → retorna null.
     */
    public static String leerCedulaExistente(String pregunta) {

        while (true) {

            // PASO A
            System.out.print(pregunta + " (0 para cancelar): ");

            // PASO B
            String valor = sc.nextLine().trim();

            if (valor.equals("0")) {
                return null; // cancelar
            }

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

    // ================================================================
    // MENÚS DE NAVEGACIÓN
    // ================================================================

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

    /** Menú RF-02. */
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

    /** Menú RF-03. */
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

    // ================================================================
    // OPERACIONES DE PERSONAS
    // ================================================================

    public static void crearPersona() {

        String nombre        = leerTexto("Nombre: ");
        String cedula        = leerCedula("Cedula: ");
        String genero        = leerTexto("Genero: ");
        String estado        = leerTexto("Estado: ");
        String rh            = leerTexto("RH: ");
        String telefono      = leerTexto("Telefono: ");
        LocalDate fechaIngreso = leerFecha("Fecha de ingreso (DD/MM/AAAA): ");

        personas.add(new person(nombre, cedula, genero, estado, rh, telefono, fechaIngreso));

        System.out.println("\nPersona creada.");
    }

    public static person buscarPorCedula(String cedula) {

        for (person p : personas) {
            if (p.getDocument_id().equals(cedula)) {
                return p;
            }
        }
        return null;
    }

    public static void buscarPersona() {

        String cedula = leerCedula("Cedula: ");
        person p = buscarPorCedula(cedula);

        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("\nPersona no encontrada.");
        }
    }

    public static void mostrarTodas() {

        if (personas.isEmpty()) {
            System.out.println("\nNo hay personas registradas.");
            return;
        }

        for (person p : personas) {
            System.out.println(p);
        }
    }

    // ================================================================
    // OPERACIONES DE CONTRATOS
    // ================================================================

    public static void crearContrato() {

        int id        = leerIdContrato("ID del contrato: ");
        String cedula = leerCedula("Cedula de la persona: ");

        person p = buscarPorCedula(cedula);

        if (p == null) {
            System.out.println("\nLa persona no existe. Debes crear una persona.");
            return;
        }

        String tipo    = leerTexto("Tipo de contrato: ");
        double salario = leerSalario("Salario: ");
        String fecha   = leerTexto("Fecha inicio: ");

        contratos.add(new contrato(id, cedula, tipo, salario, fecha));

        System.out.println("Contrato creado correctamente.");
    }

    public static void buscarContrato() {

        int id = leerIdContrato("Ingrese ID del contrato: ");

        for (contrato c : contratos) {
            if (c.id == id) {
                c.mostrarInfo();
                return;
            }
        }

        System.out.println("Contrato no encontrado.");
    }

    public static void mostrarContratos() {

        if (contratos.isEmpty()) {
            System.out.println("\nNo hay contratos registrados.");
            return;
        }

        for (contrato c : contratos) {
            c.mostrarInfo();
        }
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

        if (!encontrado) {
            System.out.println("\nNo existen contratos para esa persona.");
        }
    }

    // ================================================================
    // OPERACIONES RF-02 — SITUACIONES ADMINISTRATIVAS
    // ================================================================

    public static void registrarSituacion() {

        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        int indiceTipo = leerTipoSituacion();
        String tipo = SituacionAdministrativa.TIPOS[indiceTipo];

        String acto = leerTexto("Acto administrativo (resolucion/numero): ");

        LocalDate inicio;
        LocalDate fin;

        while (true) {

            // PASO A — pedir rango de fechas
            inicio = leerFecha("Fecha de inicio (DD/MM/AAAA): ");
            fin    = leerFecha("Fecha de fin    (DD/MM/AAAA): ");

            // PASO B — inicio no puede ser posterior al fin
            if (inicio.isAfter(fin)) {
                System.out.println("Valor incorrecto: la fecha de inicio no puede ser posterior a la fecha de fin.");
                continue;
            }

            // PASO B — regla crítica: sin solapamiento
            boolean haySolapamiento = false;

            for (SituacionAdministrativa s : situaciones) {
                if (s.cedulaServidor.equals(cedula) && s.seSolapaCon(inicio, fin)) {
                    haySolapamiento = true;
                    System.out.println("El servidor ya tiene una situacion activa en esas fechas.");
                    System.out.println("  Situacion existente: " + s.tipo +
                                       " del " + s.fechaInicio + " al " + s.fechaFin);
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

        if (!tieneActiva) {
            System.out.println("El servidor no tiene ninguna situacion administrativa activa hoy.");
        }
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

        if (!hayRegistros) {
            System.out.println("No hay situaciones registradas para este servidor.");
        }
    }

    // ================================================================
    // OPERACIONES RF-03 — CONTROL DE VACACIONES
    // ================================================================

    /**
     * Calcula cuántos períodos de vacaciones ha acumulado un servidor
     * desde su fecha de ingreso hasta hoy (1 período por año cumplido).
     */
    public static int calcularPeriodosAcumulados(person p) {
        LocalDate hoy = LocalDate.now();
        int anios = hoy.getYear() - p.fechaIngreso.getYear();

        // Ajuste: si aún no ha cumplido el aniversario este año, se resta 1
        if (hoy.getMonthValue() < p.fechaIngreso.getMonthValue() ||
           (hoy.getMonthValue() == p.fechaIngreso.getMonthValue() &&
            hoy.getDayOfMonth() < p.fechaIngreso.getDayOfMonth())) {
            anios--;
        }

        return Math.max(anios, 0);
    }

    /**
     * Cuenta cuántos períodos de vacaciones ya disfrutó un servidor,
     * buscando en el historial de RF-02 las situaciones de tipo "Vacaciones".
     * Criterio: cada registro de vacaciones cuenta como 1 período disfrutado.
     */
    public static int calcularPeriodosDisfrutados(String cedula) {

        int count = 0;

        for (SituacionAdministrativa s : situaciones) {
            if (s.cedulaServidor.equals(cedula) &&
                s.tipo.equalsIgnoreCase("Vacaciones")) {
                count++;
            }
        }

        return count;
    }

    /**
     * Muestra el resumen de vacaciones de un servidor:
     * períodos acumulados, disfrutados y pendientes.
     */
    public static void resumenVacaciones() {

        String cedula = leerCedulaExistente("Cedula del servidor");
        if (cedula == null) { System.out.println("Operacion cancelada."); return; }

        person p = buscarPorCedula(cedula);

        int acumulados  = calcularPeriodosAcumulados(p);
        int disfrutados = calcularPeriodosDisfrutados(cedula);
        int pendientes  = acumulados - disfrutados;

        System.out.println("\n========================================");
        System.out.println("  RESUMEN DE VACACIONES");
        System.out.println("  Servidor   : " + p.name);
        System.out.println("  Cedula     : " + cedula);
        System.out.println("  Fecha ingreso: " + p.fechaIngreso);
        System.out.println("----------------------------------------");
        System.out.println("  Periodos acumulados : " + acumulados);
        System.out.println("  Periodos disfrutados: " + disfrutados);
        System.out.println("  Periodos pendientes : " + pendientes);

        if (pendientes > 1) {
            System.out.println("\n  *** ALERTA: Adeuda mas de un periodo de vacaciones ***");
        }
        if (pendientes >= 1) {
            System.out.println("  *** Debe salir a vacaciones en el periodo actual ***");
        }

        System.out.println("========================================");
    }

    /**
     * Muestra el historial detallado de vacaciones disfrutadas por un servidor:
     * fechas, acto administrativo y período cubierto.
     */
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
            if (s.cedulaServidor.equals(cedula) &&
                s.tipo.equalsIgnoreCase("Vacaciones")) {

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

        if (!hay) {
            System.out.println("\nEste servidor no tiene vacaciones registradas.");
        }

        System.out.println("========================================");
    }

    /**
     * Recorre toda la planta de personal y genera dos reportes:
     *  1. Servidores que adeudan más de 1 período (alerta).
     *  2. Servidores que deben salir de vacaciones en el período actual.
     */
    public static void reporteAlertas() {

        if (personas.isEmpty()) {
            System.out.println("\nNo hay servidores registrados en el sistema.");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("  REPORTE DE ALERTAS DE VACACIONES");
        System.out.println("  Fecha: " + LocalDate.now());
        System.out.println("========================================");

        // --- Sección 1: Servidores con más de 1 período adeudado ---
        System.out.println("\n  [!] SERVIDORES QUE ADEUDAN MAS DE UN PERIODO:");
        System.out.println("  ----------------------------------------");

        boolean hayDeudores = false;

        for (person p : personas) {
            int acumulados  = calcularPeriodosAcumulados(p);
            int disfrutados = calcularPeriodosDisfrutados(p.getDocument_id());
            int pendientes  = acumulados - disfrutados;

            if (pendientes > 1) {
                System.out.println("  Servidor  : " + p.name + " | Cedula: " + p.getDocument_id());
                System.out.println("  Pendientes: " + pendientes + " periodos");
                System.out.println("  ........");
                hayDeudores = true;
            }
        }

        if (!hayDeudores) {
            System.out.println("  Ningun servidor adeuda mas de un periodo.");
        }

        // --- Sección 2: Servidores que deben salir a vacaciones ahora ---
        System.out.println("\n  [>] SERVIDORES QUE DEBEN SALIR A VACACIONES (periodo actual):");
        System.out.println("  ----------------------------------------");

        boolean haySalida = false;

        for (person p : personas) {
            int acumulados  = calcularPeriodosAcumulados(p);
            int disfrutados = calcularPeriodosDisfrutados(p.getDocument_id());
            int pendientes  = acumulados - disfrutados;

            // Debe salir si tiene al menos 1 período pendiente
            if (pendientes >= 1) {
                System.out.println("  Servidor  : " + p.name + " | Cedula: " + p.getDocument_id());
                System.out.println("  Pendientes: " + pendientes + " periodo(s)");
                System.out.println("  ........");
                haySalida = true;
            }
        }

        if (!haySalida) {
            System.out.println("  Todos los servidores estan al dia con sus vacaciones.");
        }

        System.out.println("========================================");
    }
}
