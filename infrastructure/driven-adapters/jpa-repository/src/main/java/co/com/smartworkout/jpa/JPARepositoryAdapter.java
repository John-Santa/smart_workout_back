package co.com.smartworkout.jpa;

import co.com.smartworkout.jpa.entities.NutricionistaEntity;
import co.com.smartworkout.jpa.helper.AdapterOperations;
import co.com.smartworkout.model.nutricionista.Nutricionista;
import co.com.smartworkout.model.nutricionista.PlanNutricional;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<
        Nutricionista,
        NutricionistaEntity,
        String,
        JPARepository>
// implements ModelRepository from domain
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Nutricionista.class/* change for domain model */));
    }
}
