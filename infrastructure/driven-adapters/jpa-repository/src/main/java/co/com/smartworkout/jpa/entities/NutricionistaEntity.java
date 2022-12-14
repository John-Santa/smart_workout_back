package co.com.smartworkout.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "persona")
@SecondaryTable(name = "nutricionista", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_nutricionista", referencedColumnName = "id"))
public class NutricionistaEntity {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "id")
    private String id;
    private String nombre;
    private String apellido;
    private String telefono;
    private Character genero;
    private String email;
    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;
    private Double peso;
    private Double estatura;
    @Column(name = "tipo_documento")
    private String tipoDocumento;
    @Column(name = "numero_documento")
    private String numeroDocumento;


    @Column(table = "nutricionista")
    private Boolean estado;
    @Column(table = "nutricionista")
    private String sede;
    @Column(table = "nutricionista")
    private String horario;
}
