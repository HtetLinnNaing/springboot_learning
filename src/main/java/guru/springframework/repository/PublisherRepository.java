package guru.springframework.repository;

  
import org.springframework.data.repository.CrudRepository;
import guru.springframework.domain.Publisher;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}