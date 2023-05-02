package unidad6.ejercicios.ejercicio01_Hospital;

import java.time.LocalDate;

public class Principal {
    
    public static void main(String[] args) {
        Doctores doctor = new Doctores("Rosa", "Rodriguez Serra", 942343434, "78787878E", "Cardiologo", 2500.0f, 7878);
        Enfermeros enfermero = new Enfermeros("Juan", "Perez Olmo", 666332255, "67676767E", "Maternidad", 1200, 3);
        System.out.println(doctor.getNomina(5));
        System.out.println(enfermero.getNomina(3));
        Pacientes paciente = new Pacientes("Andres", "Callejo", 99999999, "12345678F", LocalDate.now());
        doctor.mostrarCitas();
        enfermero.mostrarCitas();
        paciente.mostrarCitas();
    }

}
