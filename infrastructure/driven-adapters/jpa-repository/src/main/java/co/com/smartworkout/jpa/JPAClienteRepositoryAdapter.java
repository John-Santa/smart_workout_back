package co.com.smartworkout.jpa;

import co.com.smartworkout.jpa.entities.ClienteEntity;
import co.com.smartworkout.jpa.helper.AdapterOperations;
import co.com.smartworkout.model.cliente.Cliente;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JPAClienteRepositoryAdapter extends AdapterOperations<
        Cliente,
        ClienteEntity,
        String,
        JPAClienteRepository>
// implements ModelRepository from domain
{

    public JPAClienteRepositoryAdapter(JPAClienteRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Cliente.class/* change for domain model */));
    }
}
