package co.com.smartworkout.model.cliente.gateways;

import co.com.smartworkout.model.cliente.Cliente;
import co.com.smartworkout.model.persona.gateways.PersonaRepository;

public interface ClienteRepository extends PersonaRepository<Cliente> {
    void eliminar(String  idCliente);
    void actualizarPeso(String  idCliente, double peso);
    double consultarPeso(String  idCliente);
    //DistribucionComidad consultarDistribucionComida(String  idCliente);
}
