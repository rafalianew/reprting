package com.pbkk.finalproject.tcdelivery.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.pbkk.finalproject.tcdelivery.model.Transaksi;
import com.pbkk.finalproject.tcdelivery.model.User;
import com.pbkk.finalproject.tcdelivery.repository.TransaksiRepository;
import com.pbkk.finalproject.tcdelivery.repository.UserRepository;

@Service
public class TransaksiDAO {

	@Autowired
	TransaksiRepository transaksiRepository;

	public Transaksi findTransaksi(Integer id) {
		Transaksi usr=transaksiRepository.findTransaksi(id);
//		if(usr!=null)
//		{
//			return new Transaksi(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
			//return new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
//		}
		return usr;
	}

	public List<Transaksi> cekIdTransaksi(Integer id_transaksi) {
		List<Transaksi> usr=transaksiRepository.cekIdTransaksi(id_transaksi);
//		if(usr!=null)
//		{
//			return new Transaksi(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
			//return new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
//		}
		return usr;
	}

	public List<Transaksi> cekIdUser(Integer id_customer) {
		List<Transaksi> usr=transaksiRepository.cekIdUser(id_customer);
//		if(usr!=null)
//		{
//			return new Transaksi(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
			//return new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
//		}
		return usr;
	}

	public List<Transaksi> cekIdMenu(Integer id_menu) {
		List<Transaksi> usr=transaksiRepository.cekIdMenu(id_menu);
//		if(usr!=null)
//		{
//			return new Transaksi(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
			//return new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
//		}
		return usr;
	}

	public List<Transaksi> cekDate(Integer bulan, Integer tahun) {
		List<Transaksi> usr=transaksiRepository.cekDate(bulan, tahun);
//		if(usr!=null)
//		{
//			return new Transaksi(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
			//return new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
//		}
		return usr;
	}
	
	public List<Transaksi> cekDate_range(Integer bulan_awal, Integer tahun_awal,Integer bulan_akhir, Integer tahun_akhir) {
		List<Transaksi> usr=transaksiRepository.cekDate_range(bulan_awal, tahun_awal,bulan_akhir, tahun_akhir);
//		if(usr!=null)
//		{
//			return new Transaksi(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
			//return new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
//		}
		return usr;
	}

	public List<Transaksi> cekTotal_range(Integer total_awal, Integer total_akhir) {
		List<Transaksi> usr=transaksiRepository.cekTotal_range(total_awal,total_akhir);
//		if(usr!=null)
//		{
//			return new Transaksi(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
			//return new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
//		}
		return usr;
	}

	public List<Transaksi> cekPembayaran(String jenis_pembayaran) {
		List<Transaksi> usr=transaksiRepository.cekPembayaran(jenis_pembayaran);
//		if(usr!=null)
//		{
//			return new Transaksi(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
			//return new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
//		}
		return usr;
	}
	
	public List<Transaksi> cekUser() {
		List<Transaksi> usr=transaksiRepository.cekUser();
//		if(usr!=null)
//		{
//			return new Transaksi(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
			//return new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
//		}
		return usr;
	}
	
	public List<Transaksi> getAll()
	{
		return transaksiRepository.findAll();
	}
}
