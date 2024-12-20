package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "STOCKINFO_TAB")
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class StockInfo {
	@Id
	@Column(name = "STOCK_ID")
	@SequenceGenerator(name = "gen1", sequenceName = "STOCK_SEQ",initialValue = 1000, allocationSize = 1)
	@GeneratedValue(generator = "gen1" ,strategy = GenerationType.SEQUENCE)
	private Integer stockId;
	@Column(name = "STOCK_NAME",length = 20)
	@NonNull
	private String stockName;
	@Column(name = "EXCHANGE_NAME",length = 20)
	@NonNull
	private String exchangeName;
	
	@Column(name = "STOCK_TYPE",length = 20)
	@NonNull
	private String stockType;
	
	@Column(name="COMPANY", length = 20)
	@NonNull
	private String companyName;
	@Column(name = "PRICE")
	@NonNull
	private Double price;
	@Column(name = "AVAILABLE_UNITS")
	@NonNull
	private Double availableUnits;
	

}
