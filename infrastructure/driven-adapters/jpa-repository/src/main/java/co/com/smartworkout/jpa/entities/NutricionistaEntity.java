package co.com.smartworkout.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "id")
@Table(name = "nutricionista")
public class NutricionistaEntity extends PersonaEntity {

    @Column
    private Boolean estado;
    @Column
    private String sede;
    @Column
    private String horario;

}
