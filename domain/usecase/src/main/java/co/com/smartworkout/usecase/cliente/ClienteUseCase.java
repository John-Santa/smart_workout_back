package co.com.smartworkout.usecase.cliente;

import co.com.smartworkout.model.cliente.Cliente;
import co.com.smartworkout.model.cliente.gateways.ClienteRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClienteUseCase {

    private final ClienteRepository clienteRepository;

    public void crear(Cliente cliente) {
        clienteRepository.crear(cliente);
    }

    public  Cliente consultar(String idCliente) {
        return clienteRepository.consultar(idCliente);
    }

    public void actualizar(String  id, Cliente cliente) {
        clienteRepository.actualizar(id, cliente);
    }

    public void eliminar(String  idCliente) {
        clienteRepository.eliminar(idCliente);
    }

}
