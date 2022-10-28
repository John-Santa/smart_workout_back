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
@Table(name = "nutricionista")
@SecondaryTable(name = "persona", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_persona", referencedColumnName = "id_nutricionista"))
public class NutricionistaEntity {

    @Id
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "id_nutricionista")
    private String idNutricionista;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "sede")
    private String sede;
    @Column(name = "horario")
    private String horario;

    @Column(table = "persona")
    private String nombre;
    @Column(table = "persona")
    private String apellido;
    @Column(table = "persona")
    private String telefono;
    @Column(table = "persona")
    private Character genero;
    @Column(table = "persona")
    private String email;
    @Column(table = "persona", name = "fecha_nacimiento")
    private Date fechaNacimiento;
    @Column(table = "persona")
    private Double peso;
    @Column(table = "persona")
    private Double estatura;
    @Column(table = "persona", name = "tipo_documento")
    private String tipoDocumento;
    @Column(table = "persona", name = "numero_documento")
    private String numeroDocumento;



}
