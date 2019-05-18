package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.Model;

@Entity
@Table(name = "child")
public class Child extends Model {
	
	private static Finder<String, Child> FINDER = new Finder<String, Child>(Child.class);

	@Id
	public String id;
	
	@Column(name="name")
	public String name;
	
	public static Child findByPK(String id) {
		return FINDER.byId(id);
	}
}
