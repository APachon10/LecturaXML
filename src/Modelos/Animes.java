package Modelos;

public class Animes {
	//Atributos
	private long id;
	private String name;
	private int num_chapters;
	
	//Constructores
	public Animes(long id, String name, int num_chapters) {
		super();
		this.id = id;
		this.name = name;
		this.num_chapters = num_chapters;
	}
	//Getters && Setters
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getNum_chapters() {
		return num_chapters;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNum_chapters(int num_chapters) {
		this.num_chapters = num_chapters;
	}
	
	// To String
	@Override
	public String toString() {
		return "Animes [id=" + id + ", name=" + name + ", num_chapters=" + num_chapters + "]";
	}
}
