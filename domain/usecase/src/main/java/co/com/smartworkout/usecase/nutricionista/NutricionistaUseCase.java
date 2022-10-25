package co.com.smartworkout.usecase.nutricionista;

import co.com.smartworkout.model.nutricionista.Nutricionista;
import co.com.smartworkout.model.nutricionista.gateways.NutricionistaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class NutricionistaUseCase {

    private final NutricionistaRepository nutricionistaRepository;

    public void crear(Nutricionista nutricionista) {
        nutricionistaRepository.crear(nutricionista);
    }

    public  Nutricionista consultar(String idNutricionista) {
        return nutricionistaRepository.consultar(idNutricionista);
    }

    public void actualizar(String id, Nutricionista nutricionista) {
        nutricionistaRepository.actualizar(id, nutricionista);
    }

    public void eliminar(String idNutricionista) {
        nutricionistaRepository.eliminar(idNutricionista);
    }

    public List<Nutricionista> consultarTodos() {
        return nutricionistaRepository.consultarTodos();
    }

}
