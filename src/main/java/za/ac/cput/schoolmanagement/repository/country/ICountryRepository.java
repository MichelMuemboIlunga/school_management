package za.ac.cput.schoolmanagement.repository.country;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.schoolmanagement.domain.country.Country;

@Repository
public interface ICountryRepository extends JpaRepository<Country, String> {
}