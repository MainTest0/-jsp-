package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.TodoDTO;

public interface ICategoryRepo {
	
	ArrayList<TodoDTO> select();
	int insert(String name);
	int update(int id, String name);
	int delete(int id);

}
