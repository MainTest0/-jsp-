package catDTO;

public class CatInfoDTO {
	private String name;
	private String gender;
	private String age;
	private String favorite;
	private String hate;
	
	public CatInfoDTO(String name, String gender, String age, String favorite, String hate) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.favorite = favorite;
		this.hate = hate;
	}
	
	@Override
	public String toString() {
		return "CatInfoDTO [name=" + name + ", gender=" + gender + ", age=" + age + ", favorite=" + favorite + ", hate="
				+ hate + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getFavorite() {
		return favorite;
	}
	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	public String getHate() {
		return hate;
	}
	public void setHate(String hate) {
		this.hate = hate;
	}
	
}
