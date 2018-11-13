package spring_learn.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring_learn.entity.student;
@Repository
public interface studentrepository extends JpaRepository<student,Integer> {
}
