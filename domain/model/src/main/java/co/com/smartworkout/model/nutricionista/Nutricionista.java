package co.com.smartworkout.model.nutricionista;
import co.com.smartworkout.model.persona.Persona;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Nutricionista {

    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private Character genero;
    private String email;
    private Date fechaNacimiento;
    private Double peso;
    private Double estatura;
    private Boolean estado;
    private String sede;
    private String horario;

}
