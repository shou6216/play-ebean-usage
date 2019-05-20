package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name="child_id")
	public Child child;
	
	public static Parent findByPK(String id) {
		// @OnetToOneは必要(ないとjoinされない)
		// @JoinColumnでjoinするIDを指定する(なくてもデフォルトの名前で行ける気がする
		// fetchが必要 joinする変数名
		// Child側に設定は不要
		// 更新してもChild側に影響なことを確認
		return FINDER.fetch("child").where().eq("id", id).findUnique();
	}

	public static List<Parent> findByChildName(String childName) {
		return FINDER.fetch("child").where().like("child.name", "%" + childName + "%").findList();
	}
}
