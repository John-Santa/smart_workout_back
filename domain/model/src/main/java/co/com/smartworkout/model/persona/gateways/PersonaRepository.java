package co.com.smartworkout.model.persona.gateways;

import co.com.smartworkout.model.persona.Persona;

public interface PersonaRepository <T extends Persona> {

    void crear(T persona);
    T consultar(String id);
    default void actualizar(String id, T persona) {
        throw new UnsupportedOperationException();
    }

}
