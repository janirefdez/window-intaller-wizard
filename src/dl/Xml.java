package dl;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Xml 
{	
	public static ContactList load()
	{		
		ContactList il = null;
		File file1 = new 
		File("/home/janire/workspace/Iaeste_Poland/contacts.xml");
		JAXBContext jb;
		
		try
		{
		    jb = JAXBContext.newInstance(ContactList.class);
			Unmarshaller rd = jb.createUnmarshaller();					
			il = (ContactList) rd.unmarshal(file1);
		
		}
		catch (Exception e)
		{
			
			System.out.println("Error ocurred when loading");
			il= new ContactList();
		}	
		
		return il;
	}
	public static void save(ContactList c)
	{
		File archivo = new File("/home/janire/workspace/Iaeste_Poland/contacts.xml");
		
		try
		{
			JAXBContext jb = JAXBContext.newInstance(ContactList.class);
			Marshaller wr = jb.createMarshaller();
			
			wr.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			wr.marshal(c, archivo);
		}
		catch (Exception e)
		{
			
			System.out.println("Error ocurred when saving");
		}	
	}
}