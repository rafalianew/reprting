package com.pbkk.finalproject.tcdelivery.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="menu")
@EntityListeners(AuditingEntityListener.class)
public class Menu {

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(Integer id_menu, Integer id_restaurant, String menu_name, String menu_price) {
		super();
		this.id_menu = id_menu;
		this.id_restaurant = id_restaurant;
		this.menu_name = menu_name;
		this.menu_price = menu_price;
		}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id_menu;
	
	@Column(name="id_restaurant")
	private Integer id_restaurant;
	
	@Column(name="menu_name")
	private String menu_name;
	
	@Column(name="menu_price")
	private String menu_price;

	public Integer getIdMenu() {
		return id_menu;
	}

	public void setIdMenu(Integer id_menu) {
		this.id_menu = id_menu;
	}	
	
	public Integer getIdRestaurant() {
		return id_restaurant;
	}

	public void setIdRestaurant(Integer id_restaurant) {
		this.id_restaurant = id_restaurant;
	}

	public String getMenuName() {
		return menu_name;
	}

	public void setMenuName(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getMenuPrice() {
		return menu_price;
	}

	public void setMenuPrice(String menu_price) {
		this.menu_price = menu_price;
	}


}
