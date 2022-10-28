package co.com.smartworkout.jpa;

import co.com.smartworkout.jpa.entities.NutricionistaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPANutricionistaRepository
        extends CrudRepository<NutricionistaEntity, String >,
                QueryByExampleExecutor<NutricionistaEntity> {

}
