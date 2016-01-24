package common;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MovieManager {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setFirstName("Tim");
		person1.setLastName("Robbins");
		person1.setGender(Gender.MALE);
		person1.setHasOscar(true);
		person1.setHasGoldenGlobe(true);
		
		Person person2 = new Person();
		person2.setFirstName("Morgan");
		person2.setLastName("Freeman");
		person2.setGender(Gender.MALE);
		person2.setHasOscar(true);
		person2.setHasGoldenGlobe(true);
		
		ArrayList<Person> persons1 = new ArrayList<Person>();
		persons1.add(person1);
		persons1.add(person2);
		
		Movie movie1 = new Movie();
		movie1.setTitle("The Shawshank Redemption");
		movie1.setGenre(Genre.DRAMA);
		movie1.setDuration(142);
		movie1.setRate(9.3);
		movie1.setCast(persons1);
		
		//////////////////////////////////////////////////////////
		
		Person person3 = new Person();
		person3.setFirstName("Christian");
		person3.setLastName("Bale");
		person3.setGender(Gender.MALE);
		person3.setHasOscar(true);
		person3.setHasGoldenGlobe(true);

		Person person4 = new Person();
		person4.setFirstName("Heath");
		person4.setLastName("Ledger");
		person4.setGender(Gender.MALE);
		person4.setHasOscar(true);
		person4.setHasGoldenGlobe(true);
		
		ArrayList<Person> persons2 = new ArrayList<Person>();
		persons2.add(person3);
		persons2.add(person4);
		persons2.add(person2);
		
		Movie movie2 = new Movie();
		movie2.setTitle("The Dark Knight");
		movie2.setGenre(Genre.ACTION);
		movie2.setDuration(152);
		movie2.setRate(9.0);
		movie2.setCast(persons2);
		
		//////////////////////////////////////////////////////////
		
		ArrayList<Movie> movies1 = new ArrayList<Movie>();
		movies1.add(movie1);
		movies1.add(movie2);
		
		//////////////////////////////////////////////////////////
		
		//System.out.println(person1.toXMLString());
		//System.out.println(Arrays.toString(Tools.getMovieTitles(movies1)));
		//System.out.println(Tools.countMoviesPerPerson(movies1));
		
		//////////////////////////////////////////////////////////
		
		final String FILENAME = "movies_output.xml";
		PrintWriter writer = null;
		
		try {
			FileWriter fw = new FileWriter(FILENAME, true);
			writer = new PrintWriter(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}

		writer.println(movie1.toXMLString() + person1.toXMLString());
		
		writer.close();
		
	}

}
