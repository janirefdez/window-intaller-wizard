package pl;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;

import dl.Contact;


@ManagedBean
@SessionScoped
public class ContactMB {

	private Contact contact;
	private String name;
	
	public ContactMB()
	{
		contact = new Contact();
	}
	
	public void addContactList()
	{
		ClientBuilder.newClient()
				.target("http://localhost:8080/Iaeste_Poland/rest/logic/post")
				.request("application/xml")
				.post(Entity.entity(contact, "application/xml"))
				.getStatus();
	}
	
	//getters and setters
	public Contact getContact() {
	
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
