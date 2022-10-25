package co.com.smartworkout.model.cliente;
import co.com.smartworkout.model.persona.Persona;
import lombok.Builder;
import lombok.Data;

//@Data
//@Builder(toBuilder = true)
public class Cliente extends Persona {

    private String objetivo;
    private Integer frecuenciaEntrenamiento;

}
