package co.com.smartworkout.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "persona")
public class PersonaEntity {

    @Id
    private String id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String telefono;
    @Column
    private Character genero;
    @Column
    private String email;
    @Column
    private Date fechaNacimiento;
    @Column
    private Double peso;
    @Column
    private Double estatura;
}
