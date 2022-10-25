package co.com.smartworkout.model.persona;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
//@Builder(toBuilder = true)
public abstract class Persona {

    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private Character genero;
    private String email;
    private Date fechaNacimiento;
    private Double peso;
    private Double estatura;

}
