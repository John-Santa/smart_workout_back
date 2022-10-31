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
@SecondaryTable(name = "cliente", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_cliente", referencedColumnName = "id"))
public class ClienteEntity {


    @Column(table = "cliente")
    private String objetivo;
    @Column(name = "frecuencia_entrenamiento", table = "cliente")
    private String frecuenciaEntrenamiento;

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
}
