import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thehit.domain.Song;
import com.thehit.domain.SongWriterImpl;
import com.thehit.interfaces.Songwriter;
public class App {
	private static ApplicationContext context;		
	public static void main (String args[])
	{		
		context=new ClassPathXmlApplicationContext("configuration.xml");                
					
		@SuppressWarnings("unused")
		Songwriter simpleBeanExample=(Songwriter)context.getBean("ourFirstBean");	              
		
		SongWriterImpl songwriter=(SongWriterImpl)context.getBean("mary");
		
		System.out.println("The songwriters firstname is: "+ songwriter.getFirstname() + ": The songwriters lastname is: "+ songwriter.getLastname() + " The songwriters age is: " + 
		songwriter.getAge() + " The songwriters song name is: " + 
		songwriter.getSong().getName() +" The songwriters song lyrics are: " +
        songwriter.getSong().getLyrics());   
		
		Song setterDISong = (Song)context.getBean("setterBeanSong");		
		System.out.println("Song name is: "+ setterDISong.getName());
		System.out.println("Song lyrics are: "+setterDISong.getLyrics());
		
		SongWriterImpl setterDISongwriter =(SongWriterImpl)context.getBean("setterSongwriter");
		System.out.println("Songwriter firstname is: "+ setterDISongwriter.getFirstname());
		System.out.println("Songwriter second name is: "+setterDISongwriter.getLastname());
		System.out.println("Songwriter age is: "+setterDISongwriter.getAge());
		System.out.println("Songwriter song details are: Song name: "+setterDISongwriter.getSong().getName()+
		        		" Song lyrics are: "+setterDISongwriter.getSong().getLyrics());                       
	}
}