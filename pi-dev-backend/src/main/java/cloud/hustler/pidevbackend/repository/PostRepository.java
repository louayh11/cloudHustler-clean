package cloud.hustler.pidevbackend.repository;

import cloud.hustler.pidevbackend.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface PostRepository extends JpaRepository<Post, UUID> {
}
