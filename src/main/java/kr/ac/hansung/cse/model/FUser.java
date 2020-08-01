package kr.ac.hansung.cse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class FUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7416085012069871833L;

	@Id
	@Column(name = "user_id")
	private String id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "instagram_id")
	private String instagramId;

	public FUser(String id, String name, String instagramId) {
		this.id = id;
		this.name = name;
		this.instagramId = instagramId;
	}

}