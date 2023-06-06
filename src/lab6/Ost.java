package lab6;

public class Ost extends Composition {
	public Ost(String name, String artist, double duration){
		super(name, artist, duration);
		this.setStyle("Саундтрек");
	}
	
	@Override
	public String toString(){
		return "Назва: " + this.getName() + " |"
				+ " Виконавець: " + this.getArtist() + " |"
				+ " Жанр: " + this.getStyle() + " |"
				+ " Тривалість: " + this.getDuration();
	}
}
