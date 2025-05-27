package co.edu.uniquindio.poo.proyectofinal.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorTest {

    Hospital hospitalTest;
    Farmacia farmaciaTest;
    Administrador administrador;
    Medico medico1;
    Medico medico2;
    Medico medico3;
    Medico medico4;
    HistorialMedico historial1;
    HistorialMedico historial2;
    HistorialMedico historial3;
    Cita cita1;
    Cita cita2;
    Cita cita3;
    Cita cita4;
    Medicamento medicamento1;
    Medicamento medicamento2;
    Medicamento medicamento3;
    Medicamento medicamento4;
    Medicamento medicamento5;
    Paciente paciente1;
    Paciente paciente2;
    Paciente paciente3;
    Paciente paciente4;
    Sala sala1;
    Sala sala2;
    Sala sala3;
    Sala sala4;
    Sala sala5;
    Horario horario1;
    Horario horario2;
    Horario horario3;
    Notificacion notificacion1;
    Notificacion notificacion2;
    Notificacion notificacion3;



    @BeforeEach
    void setUp() {

        // Hospital
        hospitalTest = new Hospital("Hospital Vida Sana");

        // Farmacia
        farmaciaTest = new Farmacia("Farmacia Central", "Calle Salud 123");

        // Administrador
        administrador = new Administrador("Dr. Luis Morales", "ADM001", "555-1111", "luis@hospital.com", farmaciaTest);

        // Medicos
        medico1 = new Medico("María Pérez", "MED001", "555-2221", "maria@hospital.com", DisponibilidadMedico.DISPONIBLE, EspecialidadMedico.CARDIOLOGIA);
        medico2 = new Medico("Juan Gómez", "MED002", "555-2222", "juan@hospital.com", DisponibilidadMedico.NO_DISPONIBLE, EspecialidadMedico.PEDIATRIA);
        medico3 = new Medico("Ana Ruiz", "MED003", "555-2223", "ana@hospital.com", DisponibilidadMedico.DISPONIBLE, EspecialidadMedico.DERMATOLOGIA);
        medico4 = new Medico("Carlos Díaz", "MED004", "555-2224", "carlos@hospital.com", DisponibilidadMedico.DISPONIBLE, EspecialidadMedico.NEUROLOGIA);

        // Historiales
        historial1 = new HistorialMedico("H001", "Hipertensión", "Medicamento X", medico1);
        historial2 = new HistorialMedico("H002", "Asma", "Inhalador Y", medico3);
        historial3 = new HistorialMedico("H003", "Dermatitis", "Crema Z", medico2);

        // Citas
        cita1 = new Cita("C001", LocalDate.of(2025, 6, 1), LocalTime.of(9, 0), historial1, EstadoCita.CONFIRMADO);
        cita2 = new Cita("C002", LocalDate.of(2025, 6, 2), LocalTime.of(10, 30), historial2, EstadoCita.CONFIRMADO);
        cita3 = new Cita("C003", LocalDate.of(2025, 6, 3), LocalTime.of(11, 15), historial3, EstadoCita.CANCELADO);
        cita4 = new Cita("C004", LocalDate.of(2025, 6, 4), LocalTime.of(14, 0), historial1, EstadoCita.CONFIRMADO);

        // Medicamentos
        medicamento1 = new Medicamento("Paracetamol", "M001", "Analgésico", 100, historial1, EstadoMedicamento.DISPONIBLE);
        medicamento2 = new Medicamento("Salbutamol", "M002", "Inhalador", 50, historial2, EstadoMedicamento.DISPONIBLE);
        medicamento3 = new Medicamento("Hidrocortisona", "M003", "Crema", 20, historial3, EstadoMedicamento.AGOTADO);
        medicamento4 = new Medicamento("Ibuprofeno", "M004", "Antiinflamatorio", 80, historial1, EstadoMedicamento.DISPONIBLE);
        medicamento5 = new Medicamento("Omeprazol", "M005", "Estómago", 150, historial2, EstadoMedicamento.DISPONIBLE);

        // Pacientes
        paciente1 = new Paciente("Andrea Torres", "P001", "555-3331", "andrea@correo.com", historial1, farmaciaTest, administrador);
        paciente2 = new Paciente("Pedro Márquez", "P002", "555-3332", "pedro@correo.com", historial2, farmaciaTest, administrador);
        paciente3 = new Paciente("Laura Nieto", "P003", "555-3333", "laura@correo.com", historial3, farmaciaTest, administrador);
        paciente4 = new Paciente("Tomás Ortega", "P004", "555-3334", "tomas@correo.com", historial2, farmaciaTest, administrador);

        // Salas
        sala1 = new Sala("101", TipoSala.CONSULTA, DisponiblidadSala.DISPONIBLE, administrador);
        sala2 = new Sala("102", TipoSala.EMERGENCIA, DisponiblidadSala.NO_DISPONIBLE, administrador);
        sala3 = new Sala("101", TipoSala.CONSULTA, DisponiblidadSala.DISPONIBLE, administrador);
        sala4 = new Sala("101", TipoSala.HOSPITALIZACION, DisponiblidadSala.DISPONIBLE, administrador);
        sala5 = new Sala("101", TipoSala.CONSULTA, DisponiblidadSala.DISPONIBLE, administrador);

        horario1 = new Horario("Lunes", "08:00", "14:00", TipoHorario.ATENCION, administrador);
        horario2 = new Horario("Martes", "14:00", "20:00", TipoHorario.ATENCION, administrador);
        horario3 = new Horario("Miércoles", "09:00", "15:00", TipoHorario.CONSULTA, administrador);

        notificacion1 = new Notificacion("Recordatorio de cita", paciente1);
        notificacion2 = new Notificacion("Resultados de laboratorio disponibles", paciente2);
        notificacion3 = new Notificacion("Campaña de vacunación", paciente3);

        // Agregar todos los objetos a la clase principal hospital

        hospitalTest.getListAdministradores().add(administrador);

        hospitalTest.getListMedicos().add(medico1);
        hospitalTest.getListMedicos().add(medico2);
        hospitalTest.getListMedicos().add(medico3);
        hospitalTest.getListMedicos().add(medico4);

        hospitalTest.getListHistorialMedicos().add(historial1);
        hospitalTest.getListHistorialMedicos().add(historial2);
        hospitalTest.getListHistorialMedicos().add(historial3);

        hospitalTest.getListPacientes().add(paciente1);
        hospitalTest.getListPacientes().add(paciente2);
        hospitalTest.getListPacientes().add(paciente3);
        hospitalTest.getListPacientes().add(paciente4);

        hospitalTest.getListCitas().add(cita1);
        hospitalTest.getListCitas().add(cita2);
        hospitalTest.getListCitas().add(cita3);
        hospitalTest.getListCitas().add(cita4);

        hospitalTest.getListSalas().add(sala1);
        hospitalTest.getListSalas().add(sala2);
        hospitalTest.getListSalas().add(sala3);
        hospitalTest.getListSalas().add(sala4);
        hospitalTest.getListSalas().add(sala5);

        hospitalTest.getListHorarios().add(horario1);
        hospitalTest.getListHorarios().add(horario2);
        hospitalTest.getListHorarios().add(horario3);

        // Agregar medicametos a la farmacia
        LinkedList<Medicamento> listMedicamentos = new LinkedList<>();
        farmaciaTest.setListMedicamentos(listMedicamentos);
        farmaciaTest.getListMedicamentos().add(medicamento1);
        farmaciaTest.getListMedicamentos().add(medicamento2);
        farmaciaTest.getListMedicamentos().add(medicamento3);
        farmaciaTest.getListMedicamentos().add(medicamento4);
        farmaciaTest.getListMedicamentos().add(medicamento5);

        // Agregar al administrador las instancias necesasrias
        administrador.getListCitas().add(cita1);
        administrador.getListCitas().add(cita2);
        administrador.getListCitas().add(cita3);
        administrador.getListCitas().add(cita4);

        administrador.getListHorarios().add(horario1);
        administrador.getListHorarios().add(horario2);
        administrador.getListHorarios().add(horario3);

        administrador.getListMedicos().add(medico1);
        administrador.getListMedicos().add(medico2);
        administrador.getListMedicos().add(medico3);
        administrador.getListMedicos().add(medico4);

        administrador.getListHistorialMedicos().add(historial1);
        administrador.getListHistorialMedicos().add(historial2);
        administrador.getListHistorialMedicos().add(historial3);

        administrador.getListPacientes().add(paciente1);
        administrador.getListPacientes().add(paciente2);
        administrador.getListPacientes().add(paciente3);
        administrador.getListPacientes().add(paciente4);

        administrador.getListSalas().add(sala1);
        administrador.getListSalas().add(sala2);
        administrador.getListSalas().add(sala3);
        administrador.getListSalas().add(sala4);
        administrador.getListSalas().add(sala5);

    }

    @Test
    @DisplayName("monitoreo y asignacion de medicos")
    public void monitoreoYAsignacionMedicosTest(){


        boolean resultado = administrador.monitoreoYAsignacionMedico("MED001", "P001" );
        assertTrue(medico1.getListPacientes().contains(paciente1));


    }

    @Test
    @DisplayName("gestion de salas y horarios de atencion")
    public void gestionDeSalasYHorariosDeAtencionTest(){


        boolean resultado = administrador.ocuparSala("101");
        assertTrue(resultado);

        boolean resultado2 = administrador.liberarSala("102");
        assertTrue(resultado2);

        String cadena = administrador.verHorariosAtencion();
        assertNotNull(cadena);



    }

    @Test
    @DisplayName("Reporte de citas y ocupacion de citas")
    public void ReporteDeCitasYOcupacionDeCitasTest(){


        String resultado = administrador.generacionReporte();
        assertNotNull(resultado);



    }

    @Test
    @DisplayName("Registro, modificación y eliminacion de médicos y pacientes")
    public void RegistroModificacionYEliminacionTest(){


        Medico newMedico = new Medico("Marcos", "M0010", "555-002", "Mar@hospital.com", DisponibilidadMedico.DISPONIBLE, EspecialidadMedico.GENERAL);
        boolean crear = administrador.crearMedico(newMedico);
        assertTrue(crear);

        Paciente newPaciente = new Paciente("Angel", "P005", "333-657", "Angel@correo.com");
        boolean modificar = administrador.modificarPaciente("P004", newPaciente);
        assertTrue(modificar);

        boolean eliminar = administrador.eliminarMedico("MED001");
        assertTrue(eliminar);



    }

}