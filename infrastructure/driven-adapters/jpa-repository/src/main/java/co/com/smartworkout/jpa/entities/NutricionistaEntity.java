package co.com.smartworkout.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "nutricionista")
public class NutricionistaEntity {

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
    @Column
    private Boolean estado;
    @Column
    private String sede;
    @Column
    private String horario;

}
