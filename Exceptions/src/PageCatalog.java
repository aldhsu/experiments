import java.net.*;

public class PageCatalog {
	public static void main(String[] args) {
		HomePage[] catalog = new HomePage[5];
		
		try {
			catalog[0] = new HomePage("Mark Evanier","http://www.newsfrome.com","comic books");
			catalog[0] = new HomePage("Todd Smith","http://sharkbitten.com","music");
			catalog[2] = new HomePage("Rogers Cadenhead","http://workbench.cadenhead.org", "programming");
			catalog[3] = new HomePage("Juan Cole","http://www.juancole.com", "politics");
			catalog[4] = new HomePage("Rafe Colburn","www.rc3.org");
			for (HomePage page:catalog) {
				System.out.println(page.owner + ": " +
						page.address + " - " +
						page.category);
			}
		}catch (MalformedURLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}