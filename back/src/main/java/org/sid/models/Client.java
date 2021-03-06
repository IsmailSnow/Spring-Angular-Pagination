package org.sid.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Client implements Serializable{

	/**
	 * Serial UID
	 */
	private static final long serialVersionUID = 5455731108189617771L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code ;
	private String nom ;
	private String prenom;
	private String CIN;
	private String address ;
	
}
