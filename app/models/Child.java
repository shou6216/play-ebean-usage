package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.avaje.ebean.Model;

@Entity
@Table(name = "child")
public class Child extends Model {
	
	@SuppressWarnings("unused")
	private static Finder<String, Child> FINDER = new Finder<String, Child>(Child.class);

	@Id
	public String id;
	
	@Column(name="name")
	public String name;

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
