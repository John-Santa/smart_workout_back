package co.com.smartworkout.model.persona;

import lombok.Data;

import java.util.Date;

@Data
public class Persona {

    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private Character genero;
    private String email;
    private Date fechaNacimiento;
    private Double peso;
    private Double estatura;
    private String tipoDocumento;
    private String numeroDocumento;


}
