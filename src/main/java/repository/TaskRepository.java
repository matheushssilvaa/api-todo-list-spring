package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(String status);
    Optional<Task> findById(Long id);
}
