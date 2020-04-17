package xyz.tuezy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name = "product")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "stt")
    private int stt;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "photo")
    private String photo;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "content")
    private String content;
	
	@Column(name = "sku")
    private String sku;
	
	@Column(name = "mpn")
    private String mpn;
	
	@Column(name = "currency")
    private String currency;
	
	@Column(name = "price")
    private double price;
	
	@Column(name = "item_condition")
    private String itemCondition;
	
	@Column(name = "status")
    private String status;
	
	@Column(name = "rating")
    private double rating;
	
	@Column(name = "review_count")
    private int reviewCount;
	
	@Column(name = "brand")
    private int brand;
	
	
	@Column(name = "account")
    private String account;
    
    @Column(name = "created")
    private String created;
    
    @Column(name = "updated")
    private String updated;
	
}
