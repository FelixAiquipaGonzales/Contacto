package pe.edu.sencico.contacto.converter;
//se procede a invocar las clases entity y contactoVO
import pe.edu.sencico.contacto.entity.Contacto;
import pe.edu.sencico.contacto.vo.ContactoVO;
//se creo una interfaz para 
public interface Converter {
    //definimos los metodos converToVo y ConvertToEntity.
	ContactoVO convertToVo(Contacto contacto);
    
    Contacto convertToEntity(ContactoVO contactoVO);
}
