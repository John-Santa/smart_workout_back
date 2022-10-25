package co.com.smartworkout.model.nutricionista;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder(toBuilder = true)
public class ValoracionNutricional {

    private String idPlanNutricional;
    private Date fechaCreacion;
    private double abdomen;
    private double midaxilar;
    private double muslo;
    private double pecho;
    private double subescapular;
    private double suprailiaco;
    private double triceps;
    private double brazoRelajado;
    private double brazoContraido;
    private double cintura;
    private double cadera;
    private double perimetroMuslo;
    private double pierna;
    private String diagnostico;

}
