package git.jogindermikael.SpringSecExa.repo;

import git.jogindermikael.SpringSecExa.model.Student;
import org.springframework.data.jpa.mapping.JpaPersistentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudetRepo extends JpaRepository<Student, Integer> {
}
