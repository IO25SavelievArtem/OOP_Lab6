package lab6;

public class Rock extends Composition {
	public Rock(String name, String artist, double duration){
		super(name, artist, duration);
		this.setStyle("Рок");
	}
	
	@Override
	public String toString(){
		return "Назва: " + this.getName() + " |"
				+ " Виконавець: " + this.getArtist() + " |"
				+ " Жанр: " + this.getStyle() + " |"
				+ " Тривалість: " + this.getDuration();
	}
}
