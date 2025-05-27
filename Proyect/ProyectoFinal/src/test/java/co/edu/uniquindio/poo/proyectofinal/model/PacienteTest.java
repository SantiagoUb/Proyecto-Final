package co.edu.uniquindio.poo.proyectofinal.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class PacienteTest {

        Hospital hospitalTest;
        Farmacia farmaciaTest;
        Administrador administrador;
        Paciente paciente;
        Medico medico;
        HistorialMedico historial;
        Cita cita;
        Notificacion notificacion;

        @BeforeEach
        void setUp() {
            // Crear objetos base
            farmaciaTest = new Farmacia("Farmacia Central", "Calle Salud 123");
            administrador = new Administrador("Dr. Luis Morales", "ADM001", "555-1111", "luis@hospital.com", farmaciaTest);
            medico = new Medico("Ana Ruiz", "MED003", "555-2223", "ana@hospital.com", DisponibilidadMedico.DISPONIBLE, EspecialidadMedico.DERMATOLOGIA);

            historial = new HistorialMedico("H100", "Alergia", "Antialérgico", medico);
            paciente = new Paciente("Juan Pérez", "P100", "555-0000", "juan@correo.com", historial, farmaciaTest, administrador);

            cita = new Cita("C100", LocalDate.of(2025, 7, 10), LocalTime.of(10, 0), historial, EstadoCita.CONFIRMADO);
            notificacion = new Notificacion("Tienes una cita el 10 de julio a las 10:00", paciente);

            LinkedList<Cita> listaCitas = new LinkedList<>();
            listaCitas.add(cita);
            paciente.setListaCitas(listaCitas);
        }

        @Test
        @DisplayName("Registro y actualización de datos personales del paciente")
        void registroYActualizacionDatosTest() {
            assertEquals("Juan Pérez", paciente.getNombre());

            // Actualizar datos
            paciente.setNombre("Juan Carlos Pérez");
            paciente.setEmail("juancarlos@correo.com");
            paciente.setTelefono("555-9999");

            assertEquals("Juan Carlos Pérez", paciente.getNombre());
            assertEquals("juancarlos@correo.com", paciente.getEmail());
            assertEquals("555-9999", paciente.getTelefono());
        }

        @Test
        @DisplayName("Solicitud y cancelación de citas médicas")
        void solicitudYCancelacionCitaTest() {
            // Solicitar cita
            boolean solicitada = paciente.solicitarCita("C100");
            assertTrue(solicitada);
            assertTrue(paciente.getListaCitas().contains(cita));

            // Cancelar cita
            boolean cancelada = paciente.cancelarCita("C100");
            assertTrue(cancelada);
            assertFalse(paciente.getListaCitas().contains(cita));
        }

        @Test
        @DisplayName("Consulta de historial médico")
        void consultaHistorialMedicoTest() {
            String descripcionHistorial = paciente.consultarHistorialPaciente();
            assertNotNull(descripcionHistorial);

        }
}
