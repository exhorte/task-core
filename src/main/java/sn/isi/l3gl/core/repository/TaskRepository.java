package sn.isi.l3gl.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.l3gl.core.entity.Task;
import sn.isi.l3gl.core.enums.TaskStatus;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    long countByStatus(TaskStatus status);
}