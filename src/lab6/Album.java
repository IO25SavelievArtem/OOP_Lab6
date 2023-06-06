package lab6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Album {
	private int numOfCompositions;
	private Composition[] compositions;
	private int counter = 0;
	private double albumTotalDuration = 0;
	
	
	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Album album = (Album) o;
		return numOfCompositions == album.numOfCompositions &&
				Arrays.equals(compositions, album.compositions);
	}
	
	@Override
	public int hashCode(){
		int result = Objects.hash(numOfCompositions);
		result = 31 * result + Arrays.hashCode(compositions);
		return result;
	}
	
	public Album(int numOfCompositions){
		this.numOfCompositions = numOfCompositions;
		compositions = new Composition[numOfCompositions];
	}
	
	public void addRock(String name, String artist, double duration){
		if (counter < numOfCompositions){
			compositions[counter++] = new Rock(name, artist, duration);
		} else {
			System.out.println("Розмір альбому перевищено!");
		}
	}
	
	public void addOst(String name, String artist, double duration){
		if (counter < numOfCompositions){
			compositions[counter++] = new Ost(name, artist, duration);
		} else {
			System.out.println("Розмір альбому перевищено!");
		}
	}
	
	public void addAmbient(String name, String artist, double duration){
		if (counter < numOfCompositions){
			compositions[counter++] = new Ambient(name, artist, duration);
		} else {
			System.out.println("Розмір альбому перевищено!");
		}
	}
	
	public double albumDuration(){
		for (Composition composition : compositions){
			albumTotalDuration += composition.getDuration();
		}
		return albumTotalDuration;
	}
	
	public void sortByStyle(){
		Arrays.sort(compositions, Comparator.comparing(Composition::getStyle));
	}
	
	public void findCompositionsWithDuration(double min, double max){
		for (Composition composition : compositions){
			if (composition.getDuration() >= min & composition.getDuration() <= max){
				System.out.println(composition);
			}
		}
	}
	
	@Override
	public String toString(){
		String res = "Альбом композицій містить " + counter + " композицій з загальною тривалістю: " + "\n";
		for (int i = 0; i < counter; i++){
			res += compositions[i].toString() + '\n';
		}
		return res;
	}
}