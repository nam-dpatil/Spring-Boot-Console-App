package com.ty.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="users")
public class User {
	
	@Id
	@Column(name="user_id")
	private Integer id;
	@Column(name="user_name")
	private String name;
	@Column(name="user_email")
	private String email;
	@Column(name="user_mobileNum")
	private Long mobileNum;
	

}
