package br.com.docker.dockerlist.repositories;

import br.com.docker.dockerlist.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
