package com.dev.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="transactions_checkings") @NoArgsConstructor @Data 
public class CheckingTransactions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String signal;
	private double total;
	private double transacted;
	@ManyToOne
	@JoinColumn(name = "checkingsid", referencedColumnName = "id")
	@JsonIgnore
	private Checking checkings;
	private Timestamp date;
	
	public CheckingTransactions(int id, String signal, double total, double transacted, Checking checkings,
			Timestamp date) {
		super();
		this.id = id;
		this.signal = signal;
		this.total = total;
		this.transacted = transacted;
		this.checkings = checkings;
		this.date = date;
	}
	
	
}
