package carpeta;

import java.time.LocalDate;
import java.util.ArrayList;

public class Seed {

    public static void personasCreadas(
        ArrayList<person>                  personas,
        ArrayList<contrato>                contratos,
        ArrayList<SituacionAdministrativa> situaciones,
        ArrayList<Incentivo>               incentivos,
        ArrayList<EvaluacionMedica>        evaluaciones,
        ArrayList<AccidenteLaboral>        accidentes
    ) {

        //PERSONAS//
        personas.add(new person("Juan Felipe Perez",       "1001234567", "Masculino", "Activo", "O+",  "3201111111", "jfperez@gob.co",    LocalDate.of(2020, 5, 10)));
        personas.add(new person("Maria Paz Gomez",         "1002345678", "Femenino",  "Activo", "A+",  "3112222222", "mpgomez@gob.co",    LocalDate.of(2019, 3, 15)));
        personas.add(new person("Carlos Andres Ramirez",   "1003456789", "Masculino", "Activo", "B+",  "3003333333", "caramirez@gob.co",  LocalDate.of(2018, 7, 20)));
        personas.add(new person("Laura Alejandra Torres",  "1004567890", "Femenino",  "Activo", "AB+", "3214444444", "latorres@gob.co",   LocalDate.of(2021, 1,  8)));
        personas.add(new person("Andres Felipe Lopez",     "1005678901", "Masculino", "Activo", "O+",  "3145555555", "aflopez@gob.co",    LocalDate.of(2017, 9, 12)));
        personas.add(new person("Angela Sofia Martinez",   "1006789012", "Femenino",  "Activo", "A+",  "3206666666", "asmartinez@gob.co", LocalDate.of(2022, 4, 18)));
        personas.add(new person("Daniel Alejandro Castro", "1007890123", "Masculino", "Activo", "B-",  "3157777777", "dacastro@gob.co",   LocalDate.of(2016, 11, 3)));
        personas.add(new person("Maria Valentina Rojas",   "1008901234", "Femenino",  "Activo", "O+",  "3178888888", "mvrojas@gob.co",    LocalDate.of(2020, 8, 25)));
        personas.add(new person("Miguel Angel Herrera",    "1009901234", "Masculino", "Activo", "AB-", "3239999999", "maherrera@gob.co",  LocalDate.of(2015, 2, 28)));
        personas.add(new person("Maria Camila Diaz",       "1010111111", "Femenino",  "Activo", "A+",  "3184444444", "mcdiaz@gob.co",     LocalDate.of(2023, 6,  5)));

        //CONTRATOS//
        contratos.add(new contrato(1, "1001234567", "Planta",   3500000, "10/05/2020"));
        contratos.add(new contrato(2, "1002345678", "Temporal", 2800000, "15/03/2019"));

        //SITUACIONES ADMINISTRATIVAS//
        situaciones.add(new SituacionAdministrativa(
            "1001234567", "Vacaciones",
            LocalDate.of(2026, 1, 10), LocalDate.of(2026, 1, 20), "RES-001"
        ));

        //INCENTIVOS//
        incentivos.add(new Incentivo(
            1, "1001234567", "Reconocimiento",
            LocalDate.of(2026, 3, 10), 2026,
            "Excelente desempeno en el trabajo", "ACT-001"
        ));

        //EVALUACIONES MEDICAS//
        evaluaciones.add(new EvaluacionMedica(
            "1001234567", LocalDate.of(2026, 4, 12),
            "Apto", "Sin restricciones", "Ingreso",
            "70.5", "1.75", "Ninguna", "Dra. Carolina Ruiz"
        ));

        //ACCIDENTES LABORALES//
        accidentes.add(new AccidenteLaboral(
            "1003456789", LocalDate.of(2026, 5, 1),
            "Accidente", "Caida en escaleras",
            "Bloque administrativo", "Moderado",
            "Juan Perez", 5, "Si", "Piso mojado"
        ));
    }
}