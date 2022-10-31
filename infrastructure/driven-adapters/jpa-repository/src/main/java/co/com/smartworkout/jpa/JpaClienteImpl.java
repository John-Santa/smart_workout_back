package co.com.smartworkout.jpa;

import co.com.smartworkout.model.cliente.Cliente;
import co.com.smartworkout.model.cliente.gateways.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class JpaClienteImpl implements ClienteRepository {

    private JPAClienteRepositoryAdapter jpaClienteRepositoryAdapter;


    @Override
    public void eliminar(String idCliente) {
        jpaClienteRepositoryAdapter.deleteById(idCliente);
    }

    @Override
    public void actualizarPeso(String idCliente, double peso) {

    }

    @Override
    public double consultarPeso(String idCliente) {
        return 0;
    }

    @Override
    public void crear(Cliente persona) {
        jpaClienteRepositoryAdapter.save(persona);
    }

    @Override
    public Cliente consultar(String id) {
        Cliente cliente = jpaClienteRepositoryAdapter.findById(id);
        cliente.setId(id);
        return cliente;
    }

    @Override
    public void actualizar(String id, Cliente persona) {
        Cliente clienteConsultado = jpaClienteRepositoryAdapter.findById(id);

        if (clienteConsultado == null) {
            throw new RuntimeException("No existe el cliente");
        } else {

            clienteConsultado.setNombre(persona.getNombre());
            clienteConsultado.setApellido(persona.getApellido());
            clienteConsultado.setEmail(persona.getEmail());
            clienteConsultado.setTelefono(persona.getTelefono());
            clienteConsultado.setGenero(persona.getGenero());
            clienteConsultado.setFechaNacimiento(persona.getFechaNacimiento());
            clienteConsultado.setPeso(persona.getPeso());
            clienteConsultado.setEstatura(persona.getEstatura());
            clienteConsultado.setTipoDocumento(persona.getTipoDocumento());
            clienteConsultado.setNumeroDocumento(persona.getNumeroDocumento());
            clienteConsultado.setObjetivo(persona.getObjetivo());
            clienteConsultado.setFrecuenciaEntrenamiento(persona.getFrecuenciaEntrenamiento());

            jpaClienteRepositoryAdapter.save(clienteConsultado);
        }

    }
}
