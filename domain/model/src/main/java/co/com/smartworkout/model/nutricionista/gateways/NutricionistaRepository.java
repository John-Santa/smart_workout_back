package co.com.smartworkout.model.nutricionista.gateways;

import co.com.smartworkout.model.nutricionista.Nutricionista;
import co.com.smartworkout.model.nutricionista.PlanNutricional;
import co.com.smartworkout.model.nutricionista.ValoracionNutricional;
import co.com.smartworkout.model.persona.gateways.PersonaRepository;

import java.util.List;

public interface NutricionistaRepository extends PersonaRepository<Nutricionista> {

    void eliminar(String idNutricionista);
    List<Nutricionista> consultarTodos();

}
