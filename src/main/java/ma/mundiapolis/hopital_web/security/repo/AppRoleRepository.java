package ma.mundiapolis.hopital_web.security.repo;

import ma.mundiapolis.hopital_web.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, String> {
}
