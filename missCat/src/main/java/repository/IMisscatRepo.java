package repository;

import java.util.ArrayList;

import catDTO.CatInfoDTO;

public interface IMisscatRepo {

	ArrayList<CatInfoDTO> select();

	int insert(String name, String gender, String age, String favorite, String hate);

	int update(String correctionName, String name, String gender, String age, String favorite, String hate);

	int delete(String name);

}
