package com.kanbanapi.exception;

public class TaskNotFoundException extends RuntimeException {

    public TaskNotFoundException(Long id) {
        super("Nao foi encontrada nenhuma tarefa com esse id: " + id);
    }
}

