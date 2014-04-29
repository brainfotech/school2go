package com.brainfotech.school2go.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true, length = 16, nullable = false)
	private String name;

	@Column(length = 64, nullable = false)
	private String password;

	@ElementCollection(fetch = FetchType.EAGER)
	private Set<String> roles = new HashSet<String>();


	protected User() {

		/* Reflection instantiation */
	}


	public User(String name, String passwordHash) {

		this.name = name;
		this.password = passwordHash;
	}


	public Long getId() {

		return this.id;
	}


	public void setId(Long id) {

		this.id = id;
	}


	public String getName() {

		return this.name;
	}


	public void setName(String name) {

		this.name = name;
	}


	public Set<String> getRoles() {

		return this.roles;
	}


	public void setRoles(Set<String> roles) {

		this.roles = roles;
	}


	public void addRole(String role) {

		this.roles.add(role);
	}


	
}
