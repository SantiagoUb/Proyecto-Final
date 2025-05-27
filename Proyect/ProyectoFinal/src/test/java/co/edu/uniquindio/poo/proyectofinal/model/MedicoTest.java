package co.edu.uniquindio.poo.proyectofinal.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    Medico medico;
    Farmacia farmaciaTest;
    Administrador administrador;
    HistorialMedico historial1;
    HistorialMedico historial2;
    Paciente paciente1;
    Paciente paciente2;
    Horario horario;

    @BeforeEach
    void setUp() {

        // Farmacia
        farmaciaTest = new Farmacia("Farmacia Central", "Calle Salud 123");

        // Administrador
        administrador = new Administrador("Dr. Luis Morales", "ADM001", "555-1111", "luis@hospital.com", new Farmacia("Farmacia Central", "Calle Salud 123"));

        // Historiales
        historial1 = new HistorialMedico("H001", "Hipertensión", "Medicamento X", medico);
        historial2 = new HistorialMedico("H002", "Asma", "Inhalador Y", medico);

        // Pacientes
        paciente1 = new Paciente("Andrea Torres", "P001", "555-3331", "andrea@correo.com", historial1,farmaciaTest,administrador);
        paciente2 = new Paciente("Pedro Márquez", "P002", "555-3332", "pedro@correo.com", historial2,farmaciaTest,administrador);

        // Horario
        horario = new Horario("Lunes", "08:00", "14:00", TipoHorario.ATENCION, administrador);

        // Medico
        medico = new Medico("María Pérez", "MED001", "555-2221", "maria@hospital.com", DisponibilidadMedico.DISPONIBLE, EspecialidadMedico.CARDIOLOGIA);
        medico.setAdministrador(administrador);
        medico.setHorario(horario);

        // Asignar pacientes al médico
        medico.getListPacientes().add(paciente1);
        medico.getListPacientes().add(paciente2);

        // Asignar historial al administrador
        administrador.getListHistorialMedicos().add(historial1);
        administrador.getListHistorialMedicos().add(historial2);
    }

    @Test
    @DisplayName("Consultar historial médico de un paciente asignado al médico")
    public void consultarHistorialMedicoTest() {
        HistorialMedico resultado = medico.ConsultahistorialMedico("P001");
        assertNotNull(resultado);
        assertEquals("H001", resultado.getIdHistorial());
    }

    @Test
    @DisplayName("Verificar especialidad y disponibilidad del médico")
    public void atributosDelMedicoTest() {
        assertEquals(EspecialidadMedico.CARDIOLOGIA, medico.getEspecialidad());
        assertEquals(DisponibilidadMedico.DISPONIBLE, medico.getDisponiblidadMedico());
    }

    @Test
    @DisplayName("Asignación y recuperación del horario del médico")
    public void horarioMedicoTest() {
        Horario horarioAsignado = medico.getHorario();
        assertNotNull(horarioAsignado);
        assertEquals("Lunes", horarioAsignado.getDia());
    }

    @Test
    @DisplayName("Verificación de lista de pacientes asignados al médico")
    public void listaPacientesDelMedicoTest() {
        assertEquals(2, medico.getListPacientes().size());
        assertTrue(medico.getListPacientes().contains(paciente1));
    }
}
