package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.domain.entities.Country;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
