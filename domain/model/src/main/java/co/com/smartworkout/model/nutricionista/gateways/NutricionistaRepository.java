package co.com.smartworkout.model.nutricionista.gateways;

import co.com.smartworkout.model.nutricionista.Nutricionista;
import co.com.smartworkout.model.persona.gateways.PersonaRepository;

public interface NutricionistaRepository extends PersonaRepository<Nutricionista> {

    void eliminar(String  idNutricionista);
}
