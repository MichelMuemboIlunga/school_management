package za.ac.cput.schoolmanagement.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.lookup.Name;

@Repository
public interface INameRepository extends JpaRepository<Name,String> {

}
