package dl;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Contact {
	
	private int idContact;
	private String address;
	private String firstName;
	private String lastName;
	private String telephone;

	public Contact() {
	}

	@XmlElement
	public int getIdContact() {
		return this.idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	@XmlElement
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@XmlElement
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@XmlElement
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@XmlElement
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}