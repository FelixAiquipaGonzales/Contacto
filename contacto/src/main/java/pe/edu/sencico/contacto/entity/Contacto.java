// se procedio a crear la clase Entity 
// su funcion es mapear la tabla de la base de datos lo cual usar ORM como metodologia.
package pe.edu.sencico.contacto.entity;
 //importamos las clases y librerias de java.
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // con esta anotacion mencionamos que la clase entity es es el dominio de la tabla contacto de la base de datos.
@Table(name = "contactos", schema = "pl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contacto {

	@Id 
	@Column(name = "idc")
	private Long id;
	
	@NotBlank
	@Size(max = 30)
	@Column(name = "apellidopat")
	private String apellidoPat;
	
	@NotBlank
	@Size(max = 30)
	@Column(name = "apellidomat")
	private String apellidoMat;
	
	@NotBlank
	@Size(max = 40)
	private String nombre;
	
	@NotBlank
	@Size(max = 1)
	@Pattern(regexp="[MF]", message = "M: masculino y F femenino")
	@Column(name = "sexo", length = 1)
	private String sexo;
	
	@NotBlank
	@Size(max = 11)
	@Pattern(regexp = "\\d{11}", message = "El RUC debe contener solo números y tener 11 dígitos")
	@Column(name = "ruc", length = 11, unique = true)
	private String ruc;
	
	@NotBlank
	@Size(max = 50)
	@Email(message = "El correo electrónico debe ser válido")
	@Column(name = "email", length = 50, unique = true)
	private String email;
	
	@Size(max = 18)
	@Column(name = "telefono", length = 18)
	private String telefono;
	
}
