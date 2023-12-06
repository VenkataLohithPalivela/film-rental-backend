package com.filmrental.entity;

import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rental {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "rental_id")
	private int rentalId;

	@Column(name = "rental_date")
	private Timestamp rentalDate;

//    @ManyToOne
//    @JoinColumn(name = "inventory_id")
//	private Inventory inventory;
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id")
//	private Customer customer;

	@Column(name = "return_date", nullable = false)
	private Timestamp returnDate;

//    @ManyToOne
//    @JoinColumn(name = "staff_id")
//	private Staff staff;
//    
//    @OneToMany(mappedBy = "rental")
//    private List<Payment> payments;

	@Column(name = "last_update")
	private Timestamp lastUpdate;
}
