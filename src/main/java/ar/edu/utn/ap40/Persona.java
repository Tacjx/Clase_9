package ar.edu.utn.ap40;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Persona {
	@Getter
	@Setter
	private String nombre;
	private String apellido;
	private LocalDate fechanacimiento;

}
