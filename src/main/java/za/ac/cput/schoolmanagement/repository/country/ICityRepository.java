package za.ac.cput.schoolmanagement.repository.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.country.City;

@Repository
public interface ICityRepository extends JpaRepository<City, String> {
}