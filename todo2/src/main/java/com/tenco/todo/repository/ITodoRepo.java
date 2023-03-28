package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;

public interface ITodoRepo {
	
	ArrayList<TodoDTO> select();
	int insert(int id, String title, String description);
	int update(int id, String name);
	int delete(int id);

}
