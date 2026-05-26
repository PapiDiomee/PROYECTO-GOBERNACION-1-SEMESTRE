package carpeta;

import java.time.LocalDate;
import java.util.ArrayList;

public class Seed {

    public static void personasCreadas(
        ArrayList<person> personas,
        ArrayList<contrato> contratos,
        ArrayList<SituacionAdministrativa> situaciones,
        ArrayList<Incentivo> incentivos,
        ArrayList<EvaluacionMedica> evaluaciones,
        ArrayList<AccidenteLaboral> accidentes
    ) {

        // =====================================================
        // PERSONAS
        // =====================================================

        personas.add(new person(
            "Juan Perez",
            "1001",
            "Masculino",
            "Activo",
            "O+",
            "3001111111",
            LocalDate.of(2020, 5, 10)
        ));

        personas.add(new person(
            "Maria Gomez",
            "1002",
            "Femenino",
            "Activo",
            "A+",
            "3002222222",
            LocalDate.of(2019, 3, 15)
        ));

        personas.add(new person(
            "Carlos Ramirez",
            "1003",
            "Masculino",
            "Activo",
            "B+",
            "3003333333",
            LocalDate.of(2018, 7, 20)
        ));

        personas.add(new person(
            "Laura Torres",
            "1004",
            "Femenino",
            "Activo",
            "AB+",
            "3004444444",
            LocalDate.of(2021, 1, 8)
        ));

        personas.add(new person(
            "Andres Lopez",
            "1005",
            "Masculino",
            "Activo",
            "O-",
            "3005555555",
            LocalDate.of(2017, 9, 12)
        ));

        personas.add(new person(
            "Sofia Martinez",
            "1006",
            "Femenino",
            "Activo",
            "A-",
            "3006666666",
            LocalDate.of(2022, 4, 18)
        ));

        personas.add(new person(
            "Daniel Castro",
            "1007",
            "Masculino",
            "Activo",
            "B-",
            "3007777777",
            LocalDate.of(2016, 11, 3)
        ));

        personas.add(new person(
            "Valentina Rojas",
            "1008",
            "Femenino",
            "Activo",
            "O+",
            "3008888888",
            LocalDate.of(2020, 8, 25)
        ));

        personas.add(new person(
            "Miguel Herrera",
            "1009",
            "Masculino",
            "Activo",
            "AB-",
            "3009999999",
            LocalDate.of(2015, 2, 28)
        ));

        personas.add(new person(
            "Camila Diaz",
            "1010",
            "Femenino",
            "Activo",
            "A+",
            "3010000000",
            LocalDate.of(2023, 6, 5)
        ));

        // =====================================================
        // CONTRATOS
        // =====================================================

        contratos.add(new contrato(1, "1001", "Planta", 3500000, "10/05/2020"));
        contratos.add(new contrato(2, "1002", "Temporal", 2800000, "15/03/2019"));

        // =====================================================
        // SITUACIONES
        // =====================================================

        situaciones.add(new SituacionAdministrativa(
            "1001",
            "Vacaciones",
            LocalDate.of(2026, 1, 10),
            LocalDate.of(2026, 1, 20),
            "RES-001"
        ));

        // =====================================================
        // INCENTIVOS
        // =====================================================

        incentivos.add(new Incentivo(
            1,
            "1001",
            "Reconocimiento",
            LocalDate.of(2026, 3, 10),
            2026,
            "Excelente desempeÃ±o",
            "ACT-001"
        ));

        // =====================================================
        // EVALUACIONES MEDICAS
        // =====================================================

        evaluaciones.add(new EvaluacionMedica(
            "1001",
            LocalDate.of(2026, 4, 12),
            "Apto",
            "Sin restricciones"
        ));

        // =====================================================
        // ACCIDENTES
        // =====================================================

        accidentes.add(new AccidenteLaboral(
            "1003",
            LocalDate.of(2026, 5, 1),
            "Accidente",
            "Caida en escaleras"
        ));

    }
}