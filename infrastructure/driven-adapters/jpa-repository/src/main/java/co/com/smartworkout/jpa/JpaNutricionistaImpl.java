package co.com.smartworkout.jpa;

import co.com.smartworkout.model.nutricionista.Nutricionista;
import co.com.smartworkout.model.nutricionista.PlanNutricional;
import co.com.smartworkout.model.nutricionista.ValoracionNutricional;
import co.com.smartworkout.model.nutricionista.gateways.NutricionistaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@AllArgsConstructor
public class JpaNutricionistaImpl implements NutricionistaRepository {

    private JPARepositoryAdapter jpaRepositoryAdapter;


    @Override
    public void crear(Nutricionista nutricionista) {
        String id = UUID.randomUUID().toString();
        nutricionista.setId(id);
        jpaRepositoryAdapter.save(nutricionista);
    }

    @Override
    public Nutricionista consultar(String idNutricionista) {
        return jpaRepositoryAdapter.findById(idNutricionista);
    }

    @Override
    public void actualizar(String id, Nutricionista nutricionista) {
        Nutricionista nutricionistaConsultado = jpaRepositoryAdapter.findById(id);

        if (nutricionistaConsultado == null) {
            throw new RuntimeException("No existe el nutricionista");
        }

        nutricionistaConsultado.setNombre(nutricionista.getNombre());
        nutricionistaConsultado.setApellido(nutricionista.getApellido());
        nutricionistaConsultado.setEmail(nutricionista.getEmail());
        nutricionistaConsultado.setTelefono(nutricionista.getTelefono());
        nutricionistaConsultado.setGenero(nutricionista.getGenero());
        nutricionistaConsultado.setFechaNacimiento(nutricionista.getFechaNacimiento());
        nutricionistaConsultado.setPeso(nutricionista.getPeso());
        nutricionistaConsultado.setEstatura(nutricionista.getEstatura());
        nutricionistaConsultado.setEstado(nutricionista.getEstado());
        nutricionistaConsultado.setSede(nutricionista.getSede());
        nutricionistaConsultado.setHorario(nutricionista.getHorario());

        jpaRepositoryAdapter.save(nutricionistaConsultado);

    }

    @Override
    public void eliminar(String idNutricionista) {
        jpaRepositoryAdapter.deleteById(idNutricionista);
    }

    @Override
    public List<Nutricionista> consultarTodos() {
        return jpaRepositoryAdapter.findAll();
    }
}
