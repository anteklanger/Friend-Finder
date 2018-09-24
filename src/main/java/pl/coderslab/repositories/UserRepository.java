package pl.coderslab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findFirstByNick(String userName);

}
