package za.ac.cput.schoolmanagement.repository.address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.Address;
import za.ac.cput.schoolmanagement.domain.Name;

@Repository
public interface IRepository extends JpaRepository<Name, String> {
}
