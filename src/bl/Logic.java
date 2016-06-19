package bl;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import dl.Contact;
import dl.ContactList;
import dl.Xml;

@Path("/logic")
public class Logic {

	@POST
	@Path("/post")
	@Consumes("application/xml")
	public void addArticle(Contact contact)
	{
		
		ContactList c = Xml.load();
		c.addContact(contact);
		Xml.save(c);
		
		

	}
}
