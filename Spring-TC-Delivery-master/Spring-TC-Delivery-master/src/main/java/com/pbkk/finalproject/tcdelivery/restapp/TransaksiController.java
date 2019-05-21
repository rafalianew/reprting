package com.pbkk.finalproject.tcdelivery.restapp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pbkk.finalproject.tcdelivery.aop.AdminTokenRequired;
import com.pbkk.finalproject.tcdelivery.aop.UserTokenRequired;
import com.pbkk.finalproject.tcdelivery.dao.TokenDAO;
import com.pbkk.finalproject.tcdelivery.dao.TransaksiDAO;
import com.pbkk.finalproject.tcdelivery.dao.UserDAO;
import com.pbkk.finalproject.tcdelivery.model.ReturnUser;
import com.pbkk.finalproject.tcdelivery.model.Transaksi;
import com.pbkk.finalproject.tcdelivery.model.User;
import com.pbkk.finalproject.tcdelivery.service.SecurityService;
import com.pbkk.finalproject.tcdelivery.service.TransaksiService;
import com.pbkk.finalproject.tcdelivery.service.UserService;
import com.pbkk.finalproject.tcdelivery.util.Util;

@RestController
@RequestMapping("/transaksi")
public class TransaksiController {

	@Autowired
	TransaksiDAO transaksiDAO;
	
	@Autowired
	TokenDAO tokenDAO;
	
	@Autowired
	SecurityService securityService;
	
	@Autowired
	TransaksiService transaksiService;
	
	@ResponseBody
	@UserTokenRequired
	@RequestMapping("/{id}")
	public Transaksi findTransaksi(@PathVariable("id") Integer id) {
		Transaksi usr = transaksiDAO.findTransaksi(id);
		
		if(usr != null) {
			Transaksi returnUser = new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
			
			return returnUser;
		}
		else {
			Transaksi returnUser = null;
			return returnUser;
		}
	}
	
	@ResponseBody
	@UserTokenRequired
	@RequestMapping("/all")
	public List<Transaksi> getAllTransaksi() {
		List<Transaksi> get=transaksiDAO.getAll();
		
		List<Transaksi> returnTransaksi = new ArrayList<Transaksi>();
		for(Transaksi usr : get){
			returnTransaksi.add(new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran()));
		}
		
		return returnTransaksi;
	}


	@ResponseBody
	@UserTokenRequired
	@RequestMapping(value = "/transaksi", method = RequestMethod.GET)
	public List<Transaksi> idTransaksi(
				@RequestParam(value = "id_transaksi") Integer id_transaksi
//				@RequestParam(value = "name") String name,
//				@RequestParam(value = "email") String email,
//				@RequestParam(value = "password") String password,
//				@RequestParam(value = "phone_number") String phoneNumber
			) 
	{
//		transaksiDAO.cekIdTransaksi(id_transaksi);
		List<Transaksi> get=transaksiDAO.cekIdTransaksi(id_transaksi);
		
		List<Transaksi> returnTransaksi = new ArrayList<Transaksi>();
		for(Transaksi usr : get){
			returnTransaksi.add(new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran()));
		}
		
		return returnTransaksi;
	}

	@ResponseBody
	@UserTokenRequired
	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public List<Transaksi> idUser(
				@RequestParam(value = "id_customer") Integer id_customer
//				@RequestParam(value = "name") String name,
//				@RequestParam(value = "email") String email,
//				@RequestParam(value = "password") String password,
//				@RequestParam(value = "phone_number") String phoneNumber
			) 
	{
//		transaksiDAO.cekIdTransaksi(id_transaksi);
		List<Transaksi> get=transaksiDAO.cekIdUser(id_customer);
		
		List<Transaksi> returnTransaksi = new ArrayList<Transaksi>();
		for(Transaksi usr : get){
			returnTransaksi.add(new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran()));
		}
		
		return returnTransaksi;
	}

	@ResponseBody
	@UserTokenRequired
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public List<Transaksi> idMenu(
				@RequestParam(value = "id_menu") Integer id_menu
//				@RequestParam(value = "name") String name,
//				@RequestParam(value = "email") String email,
//				@RequestParam(value = "password") String password,
//				@RequestParam(value = "phone_number") String phoneNumber
			) 
	{
//		transaksiDAO.cekIdTransaksi(id_transaksi);
		List<Transaksi> get=transaksiDAO.cekIdMenu(id_menu);
		
		List<Transaksi> returnTransaksi = new ArrayList<Transaksi>();
		for(Transaksi usr : get){
			returnTransaksi.add(new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran()));
		}
		
		return returnTransaksi;
	}

	@ResponseBody
	@UserTokenRequired
	@RequestMapping(value = "/date", method = RequestMethod.GET)
	public List<Transaksi> Date(
				@RequestParam(value = "bulan") Integer bulan,
				@RequestParam(value = "tahun") Integer tahun
//				@RequestParam(value = "email") String email,
//				@RequestParam(value = "password") String password,
//				@RequestParam(value = "phone_number") String phoneNumber
			) 
	{
//		transaksiDAO.cekIdTransaksi(id_transaksi);
		List<Transaksi> get=transaksiDAO.cekDate(bulan,tahun);
		
		List<Transaksi> returnTransaksi = new ArrayList<Transaksi>();
		for(Transaksi usr : get){
			returnTransaksi.add(new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran()));
		}
		
		return returnTransaksi;
	}

	@ResponseBody
	@UserTokenRequired
	@RequestMapping(value = "/date_range", method = RequestMethod.GET)
	public List<Transaksi> Date_range(
				@RequestParam(value = "bulan_awal") Integer bulan_awal,
				@RequestParam(value = "tahun_awal") Integer tahun_awal,
				@RequestParam(value = "bulan_akhir") Integer bulan_akhir,
				@RequestParam(value = "tahun_akhir") Integer tahun_akhir
//				@RequestParam(value = "phone_number") String phoneNumber
			) 
	{
//		transaksiDAO.cekIdTransaksi(id_transaksi);
		List<Transaksi> get=transaksiDAO.cekDate_range(bulan_awal,tahun_awal,bulan_akhir,tahun_akhir);
		
		List<Transaksi> returnTransaksi = new ArrayList<Transaksi>();
		for(Transaksi usr : get){
			returnTransaksi.add(new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran()));
		}
		
		return returnTransaksi;
	}

	@ResponseBody
	@UserTokenRequired
	@RequestMapping(value = "/total", method = RequestMethod.GET)
	public List<Transaksi> Total_range(
				@RequestParam(value = "total_awal") Integer total_awal,
				@RequestParam(value = "total_akhir") Integer total_akhir
			) 
	{
//		transaksiDAO.cekIdTransaksi(id_transaksi);
		List<Transaksi> get=transaksiDAO.cekTotal_range(total_awal,total_akhir);
		
		List<Transaksi> returnTransaksi = new ArrayList<Transaksi>();
		for(Transaksi usr : get){
			returnTransaksi.add(new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran()));
		}
		
		return returnTransaksi;
	}

	@ResponseBody
	@UserTokenRequired
	@RequestMapping(value = "/pembayaran", method = RequestMethod.GET)
	public List<Transaksi> Pembayaran(
				@RequestParam(value = "jenis_pembayaran") String jenis_pembayaran
			) 
	{
//		transaksiDAO.cekIdTransaksi(id_transaksi);
		List<Transaksi> get=transaksiDAO.cekPembayaran(jenis_pembayaran);
		
		List<Transaksi> returnTransaksi = new ArrayList<Transaksi>();
		for(Transaksi usr : get){
			returnTransaksi.add(new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran()));
		}
		
		return returnTransaksi;
	}

	@ResponseBody
	@UserTokenRequired
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<Transaksi> Usertrans(
			//	@RequestHeader(value = "token") String token
			) 
	{
//		transaksiDAO.cekIdTransaksi(id_transaksi);
		List<Transaksi> get=transaksiDAO.cekUser();
		
		List<Transaksi> returnTransaksi = new ArrayList<Transaksi>();
		for(Transaksi usr : get){
			returnTransaksi.add(new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran()));
		}
		
		return returnTransaksi;
	}
}