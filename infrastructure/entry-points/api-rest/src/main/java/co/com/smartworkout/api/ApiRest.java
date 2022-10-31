package co.com.smartworkout.api;

import co.com.smartworkout.model.nutricionista.Nutricionista;
import co.com.smartworkout.usecase.nutricionista.NutricionistaUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value = "/api/nutricionista", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final NutricionistaUseCase nutricionistaUseCase;


    @GetMapping("/{id}")
    public Nutricionista getNutricionista(@PathVariable String id) {
        return nutricionistaUseCase.consultar(id);
    }

    @PostMapping
    public void crearNutricionista(@RequestBody Nutricionista nutricionista) {
        nutricionistaUseCase.crear(nutricionista);
    }

    @PutMapping("/{id}")
    public void actualizarNutricionista(@PathVariable String id, @RequestBody Nutricionista nutricionista) {
        try {
            nutricionistaUseCase.actualizar(id, nutricionista);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarNutricionista(@PathVariable String  id) {
        nutricionistaUseCase.eliminar(id);
    }

    @GetMapping(path = "/hello")
    public String commandName() {
        return "Hello World";
    }
}