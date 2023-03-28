package com.tenco.todo.repository;

import java.util.ArrayList;

import com.tenco.todo.dto.CategoryDTO;

public interface ITodoRepo {

	ArrayList<CategoryDTO> select();

	void insert();

	void update();

	int delete(int id);

}
