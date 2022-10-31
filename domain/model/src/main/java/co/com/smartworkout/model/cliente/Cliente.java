package co.com.smartworkout.model.cliente;

import co.com.smartworkout.model.persona.Persona;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends Persona {

    private String objetivo;
    private Integer frecuenciaEntrenamiento;

}
