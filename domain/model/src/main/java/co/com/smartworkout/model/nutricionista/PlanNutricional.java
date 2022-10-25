package co.com.smartworkout.model.nutricionista;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class PlanNutricional {

    private String id;
    private String idCliente;
    private String idNutricionista;
    private String objetivoNutricional;
    private Double kiloCaloriasDiarias;
    private String recomendaciones;

}
