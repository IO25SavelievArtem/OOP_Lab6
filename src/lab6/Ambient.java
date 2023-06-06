package lab6;

public class Ambient extends Composition {
	public Ambient(String name, String artist, double duration){
		super(name, artist, duration);
		this.setStyle("Амбієнт");
	}
	
	@Override
	public String toString(){
		return "Назва: " + this.getName() + " |"
				+ " Виконавець: " + this.getArtist() + " |"
				+ " Жанр: " + this.getStyle() + " |"
				+ " Тривалість: " + this.getDuration();
	}
}
