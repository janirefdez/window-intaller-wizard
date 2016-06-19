package dl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement
public class ContactList {

	
	private List<Contact> contacts;
	
	@XmlElement
	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
	public void addContact(Contact a)
	{
		if(contacts==null)
		{
			contacts = new ArrayList<Contact>();
		}
		contacts.add(a);
	}
}
