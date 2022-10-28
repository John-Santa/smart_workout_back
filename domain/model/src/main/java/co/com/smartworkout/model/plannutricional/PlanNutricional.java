package co.com.smartworkout.model.plannutricional;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class PlanNutricional {

    private String idPlanNutricional;
    private String idCliente;
    private String idNutricionista;
    private String objetivoNutricional;
    private Double kiloCaloriasDiarias;
    private String recomendaciones;
    private ValoracionNutricional valoracionNutricional;

}
