package ma.mundiapolis.hopital_web.security.repo;

import ma.mundiapolis.hopital_web.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    AppUser findByUsername(String username);
}
