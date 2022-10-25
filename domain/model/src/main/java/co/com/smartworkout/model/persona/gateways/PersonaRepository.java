package co.com.smartworkout.model.persona.gateways;

import co.com.smartworkout.model.persona.Persona;

public interface PersonaRepository {

    Persona getPersona(String id);
    Persona updatePersona(Persona persona);
    Persona createPersona(Persona persona);

}
