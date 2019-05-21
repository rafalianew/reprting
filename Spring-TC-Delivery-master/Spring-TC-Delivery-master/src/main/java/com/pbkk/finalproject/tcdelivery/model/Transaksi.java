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
@Table(name="transaksi")
@EntityListeners(AuditingEntityListener.class)
public class Transaksi {

	public Transaksi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaksi(Integer id, Integer id_transaksi, Integer id_menu, Integer hari, Integer bulan, Integer tahun, Integer id_restaurant, String menu_name, Integer menu_price, Integer jmlh, Integer total, Integer id_customer, Integer id_driver, String jenis_pembayaran) {
		super();
		this.id = id;
		this.id_transaksi = id_transaksi;
		this.id_menu = id_menu;
		this.hari = hari;
		this.bulan = bulan;
		this.tahun = tahun;
		this.id_restaurant = id_restaurant;
		this.menu_name = menu_name;
		this.menu_price = menu_price;
		this.jmlh = jmlh;
		this.total = total;
		this.id_customer = id_customer;
		this.id_driver = id_driver;
		this.jenis_pembayaran = jenis_pembayaran;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="id_transaksi")
	private Integer id_transaksi;
	@Column(name="id_menu")
	private Integer id_menu;
	@Column(name="hari")
	private Integer hari;
	
	@Column(name="bulan")
	private Integer bulan;
	
	@Column(name="tahun")
	private Integer tahun;
	
	
	@Column(name="id_restaurant")
	private Integer id_restaurant;
	
	@Column(name="menu_name")
	private String menu_name;
	
	@Column(name="menu_price")
	private Integer menu_price;

	@Column(name="jmlh")
	private Integer jmlh;
	@Column(name="total")
	private Integer total;
	@Column(name="id_customer")
	private Integer id_customer;
	@Column(name="id_driver")
	private Integer id_driver;
	@Column(name="jenis_pembayaran")
	private String jenis_pembayaran;

	public Integer getNo() {
		return id;
	}

	public void setNo(Integer id) {
		this.id = id;
	}	
	
	public Integer getIdTransaksi() {
		return id_transaksi;
	}

	public void setIdTransaksi(Integer id_transaksi) {
		this.id_transaksi = id_transaksi;
	}	
	
	public Integer getIdMenu() {
		return id_menu;
	}

	public void setIdMenu(Integer id_menu) {
		this.id_menu = id_menu;
	}	
	
	public Integer getHari() {
		return hari;
	}

	public void setHari(Integer hari) {
		this.hari = hari;
	}	
	
	public Integer getBulan() {
		return bulan;
	}
	public void setBulan(Integer bulan) {
		this.bulan = bulan;
	}	
	public Integer getTahun() {
		return tahun;
	}

	public void setTahun(Integer tahun) {
		this.tahun = tahun;
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

	public Integer getMenuPrice() {
		return menu_price;
	}

	public void setMenuPrice(Integer menu_price) {
		this.menu_price = menu_price;
	}
	public Integer getJmlh() {
		return jmlh;
	}

	public void setJmlh(Integer jmlh) {
		this.jmlh = jmlh;
	}	
	
	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}	
	
	public Integer getIdCustomer() {
		return id_customer;
	}

	public void setIdCustomer(Integer id_customer) {
		this.id_customer = id_customer;
	}	
	
	public Integer getIdDriver() {
		return id_driver;
	}

	public void setIdDriver(Integer id_driver) {
		this.id_driver = id_driver;
	}	


	public String getJenisPembayaran() {
		return jenis_pembayaran;
	}

	public void setJenisPembayaran(String jenis_pembayaran) {
		this.jenis_pembayaran = jenis_pembayaran;
	}

}
