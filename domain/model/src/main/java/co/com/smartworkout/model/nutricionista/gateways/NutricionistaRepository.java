package co.com.smartworkout.model.nutricionista.gateways;

import co.com.smartworkout.model.nutricionista.Nutricionista;
import co.com.smartworkout.model.nutricionista.PlanNutricional;
import co.com.smartworkout.model.nutricionista.ValoracionNutricional;

import java.util.List;

public interface NutricionistaRepository {

    void crear(Nutricionista nutricionista);
    Nutricionista consultar(String idNutricionista);
    default void actualizar(String idNutricionista, Nutricionista nutricionista) {
        throw new UnsupportedOperationException();
    }
    void eliminar(String idNutricionista);
    List<Nutricionista> consultarTodos();

}
