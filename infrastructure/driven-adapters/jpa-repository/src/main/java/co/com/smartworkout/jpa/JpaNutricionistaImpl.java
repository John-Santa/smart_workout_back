package co.com.smartworkout.jpa;

import co.com.smartworkout.model.nutricionista.Nutricionista;
import co.com.smartworkout.model.nutricionista.gateways.NutricionistaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JpaNutricionistaImpl implements NutricionistaRepository {

    private JPANutricionistaRepositoryAdapter jpaNutricionistaRepositoryAdapter;


    @Override
    public void crear(Nutricionista nutricionista) {
        jpaNutricionistaRepositoryAdapter.save(nutricionista);
    }

    @Override
    public Nutricionista consultar(String  idNutricionista) {
        Nutricionista nutricionista = jpaNutricionistaRepositoryAdapter.findById(idNutricionista);
        nutricionista.setId(idNutricionista);
        return nutricionista;
    }

    @Override
    public void actualizar(String  id, Nutricionista nutricionista) {
        Nutricionista nutricionistaConsultado = jpaNutricionistaRepositoryAdapter.findById(id);

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
        nutricionistaConsultado.setTipoDocumento(nutricionista.getTipoDocumento());
        nutricionistaConsultado.setNumeroDocumento(nutricionista.getNumeroDocumento());

        jpaNutricionistaRepositoryAdapter.save(nutricionistaConsultado);

    }

    @Override
    public void eliminar(String idNutricionista) {
        jpaNutricionistaRepositoryAdapter.deleteById(idNutricionista);
    }

//    @Override
//    public List<Nutricionista> consultarTodos() {
//        return jpaNutricionistaRepositoryAdapter.findAll();
//    }
}
