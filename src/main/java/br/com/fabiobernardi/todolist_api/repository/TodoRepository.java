package br.com.fabiobernardi.todolist_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabiobernardi.todolist_api.entity.Todo;


public interface TodoRepository extends JpaRepository<Todo, Long> {
    
}
