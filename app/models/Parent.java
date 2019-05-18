package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.avaje.ebean.Model;

@Entity
@Table(name = "parent")
public class Parent extends Model {
	
	private static Finder<String, Parent> FINDER = new Finder<String, Parent>(Parent.class);

	@Id
	public String id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="child_id")
	public String childId;
	
	public static Parent findByPK(String id) {
		return FINDER.byId(id);
	}
}
