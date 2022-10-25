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
public class Nutricionista extends Persona {

    private Boolean estado;
    private String sede;
    private String horario;

}
