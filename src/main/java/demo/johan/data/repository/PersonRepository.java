package demo.johan.data.repository;

import demo.johan.data.model.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by User on 16/9/2016.
 */
@RepositoryRestResource(path = "people")
public interface PersonRepository  extends PagingAndSortingRepository<Person,Long>{
    List<Person> findByLastName(@Param("lastName") String lastName);
    List<Person> findByFirstName(@Param("firstName") String firstName);
}
