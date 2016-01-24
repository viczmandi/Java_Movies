package common;

import java.util.HashMap;
import java.util.List;

public class Tools {
	
	public static String toXMLTag(String myTag, String myValue){
		
		return "\n<" + myTag + ">" + myValue + "</" + myTag + ">";
		
	}
	
	public static String[] getMovieTitles(List<Movie> list){
		
		String [] titles = new String[list.size()];
		for (int i = 0; i < titles.length; i++) {
			
			titles[i]=list.get(i).getTitle();
			
		}
		return titles;
	}
	
	
	public static HashMap<Person, Integer> countMoviesPerPerson(List<Movie> movies)
	{
	    HashMap<Person, Integer> countMap = new HashMap<Person, Integer>();
	    for (Movie movie : movies)
	    {
	        for (Person person : movie.getCast())
	        {
	            if (!countMap.containsKey(person))
	            {
	                countMap.put(person, new Integer(0));
	            }
	            countMap.put(person, countMap.get(person) + 1);
	        }
	    }
	    return countMap;
	}
}
