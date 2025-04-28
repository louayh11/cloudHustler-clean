package cloud.hustler.pidevbackend.repository;

import cloud.hustler.pidevbackend.entity.DeliveryDriver;
import cloud.hustler.pidevbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

  Optional<User> findByEmail(String email);
  // email exists
    boolean existsByEmail(String email);


}
