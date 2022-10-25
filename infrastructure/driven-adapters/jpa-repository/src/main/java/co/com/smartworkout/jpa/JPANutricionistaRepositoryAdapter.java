package co.com.smartworkout.jpa;

import co.com.smartworkout.jpa.entities.NutricionistaEntity;
import co.com.smartworkout.jpa.entities.PersonaEntity;
import co.com.smartworkout.jpa.helper.AdapterOperations;
import co.com.smartworkout.model.nutricionista.Nutricionista;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JPANutricionistaRepositoryAdapter extends AdapterOperations<
        Nutricionista,
        NutricionistaEntity,
        String,
        JPANutricionistaRepository>
// implements ModelRepository from domain
{

    public JPANutricionistaRepositoryAdapter(JPANutricionistaRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Nutricionista.class/* change for domain model */));
    }
}
