package com.mindwise.backend.repository;

import com.mindwise.backend.model.Admin;
import com.mindwise.backend.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
