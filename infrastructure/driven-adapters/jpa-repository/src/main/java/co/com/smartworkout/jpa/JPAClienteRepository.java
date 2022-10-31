package co.com.smartworkout.jpa;

import co.com.smartworkout.jpa.entities.ClienteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPAClienteRepository extends
        CrudRepository<ClienteEntity, String>,
        QueryByExampleExecutor<ClienteEntity> {
}
