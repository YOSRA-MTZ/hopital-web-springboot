package ma.mundiapolis.hopital_web.security.service;

import ma.mundiapolis.hopital_web.security.entities.AppRole;
import ma.mundiapolis.hopital_web.security.entities.AppUser;

public interface AccountService {
    AppUser addnewUser(String username, String password, String email, String confirmPassword);
    AppRole addnewRole(String role);
    void addRoleToUser(String username, String role);
    void removeRoleFromUser(String username, String role);

    AppUser loadUserByUsername(String username);
}
