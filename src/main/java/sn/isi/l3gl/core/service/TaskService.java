package sn.isi.l3gl.core.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.isi.l3gl.core.entity.Task;
import sn.isi.l3gl.core.enums.TaskStatus;
import sn.isi.l3gl.core.repository.TaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    // Version 0.0.1-SNAPSHOT
    public Task createTask(Task task) {
        task.setStatus(TaskStatus.TODO);
        return taskRepository.save(task);
    }



}