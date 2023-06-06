package lab6;
public class Lab6 {
	public static void main(){;
		Album album = new Album(3);
		
		album.addRock("Breaking The Habit", "Linkin Park", 3.3);
		album.addOst("Awaken", "Taku Iwasaki", 3.35);
		album.addAmbient("Back of the Room Hang", "Jingle Punks", 1.65);
		
		System.out.println("\t\t\t  Альбом");
		System.out.print(album);
		System.out.println("Загальна тривалість альбому: " + album.albumDuration() + "\n");
		
		System.out.println("\t\t\tСортування");
		album.sortByStyle();
		System.out.println(album);
		
		System.out.println("\t\tВідповідність заданій довжині трека");
		double from = 2;
		double to = 3.5;
		System.out.println("Від: " + from + " === до: " + to);
		album.findCompositionsWithDuration(from, to);
	}
}