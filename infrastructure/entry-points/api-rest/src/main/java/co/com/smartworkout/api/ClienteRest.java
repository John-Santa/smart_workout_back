package co.com.smartworkout.api;

import co.com.smartworkout.model.cliente.Cliente;
import co.com.smartworkout.usecase.cliente.ClienteUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "/api/cliente", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ClienteRest {

    private final ClienteUseCase clienteUseCase;


    @GetMapping("/{id}")
    public Cliente getCliente(@PathVariable String id) {
        return clienteUseCase.consultar(id);
    }

    @PostMapping
    public void crearCliente(@RequestBody Cliente cliente) {
        clienteUseCase.crear(cliente);
    }

    @PutMapping("/{id}")
    public void actualizarCliente(@PathVariable String id, @RequestBody Cliente cliente) {
        try {
            clienteUseCase.actualizar(id, cliente);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarCliente(@PathVariable String  id) {
        clienteUseCase.eliminar(id);
    }
}