
package za.ac.cput.schoolmanagement.service.name;

import org.hibernate.boot.model.source.spi.IdentifierSource;
import za.ac.cput.schoolmanagement.domain.Name;
import za.ac.cput.schoolmanagement.service.IService;

import java.util.List;

public interface INameService  extends IService<Name,String> {
   List<Name> findAll();
    /*Name create(Name name);
    void delete(Name name);
    List<Name> getAll();
    List<Name> findByFirstName(String firstName);
    List<Name> findByLastName(String lastName);*/
}
