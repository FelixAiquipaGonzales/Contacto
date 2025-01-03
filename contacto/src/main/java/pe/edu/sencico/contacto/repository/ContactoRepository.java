// se procede ha hacer uso de la dependencia de JPA para usar el los metodos de JPARepository para hacer operaciones CRUD
package pe.edu.sencico.contacto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// se procede a llamar a la clase entity para darle las operciones CRUD de dicha entidad que representa a la tabla
import pe.edu.sencico.contacto.entity.Contacto;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Long>{

}
