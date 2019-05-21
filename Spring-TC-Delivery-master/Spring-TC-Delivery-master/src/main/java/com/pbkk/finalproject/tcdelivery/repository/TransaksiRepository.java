package com.pbkk.finalproject.tcdelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.query.Headers;
import org.springframework.stereotype.Repository;

import com.pbkk.finalproject.tcdelivery.model.Transaksi;
import com.pbkk.finalproject.tcdelivery.model.User;

@Repository
public interface TransaksiRepository extends JpaRepository<Transaksi, Integer>{

	@Query("select u from Transaksi u where u.id=:id")
	Transaksi findTransaksi(@Param("id") Integer id);
	//Transaksi findTransaksi(Integer id);

	@Query("select u from Transaksi u where u.id_transaksi=:id_transaksi")
	List<Transaksi> cekIdTransaksi(@Param("id_transaksi") Integer id_transaksi);

	@Query("select u from Transaksi u where u.id_customer=:id_customer")
	List<Transaksi> cekIdUser(@Param("id_customer") Integer id_customer);

	@Query("select u from Transaksi u where u.id_menu=:id_menu")
	List<Transaksi> cekIdMenu(@Param("id_menu") Integer id_menu);

	@Query("select u from Transaksi u where u.bulan=:bulan and u.tahun=:tahun")
	List<Transaksi> cekDate(
			@Param("bulan") Integer bulan,
			@Param("tahun") Integer tahun);

	@Query("select u from Transaksi u where u.bulan between :bulan_awal and :bulan_akhir and u.tahun between :tahun_awal and :tahun_akhir")
	List<Transaksi> cekDate_range(
			@Param("bulan_awal") Integer bulan_awal,
			@Param("tahun_awal") Integer tahun_awal,
			@Param("bulan_akhir") Integer bulan_akhir,
			@Param("tahun_akhir") Integer tahun_akhir);

	@Query("select u from Transaksi u where u.total between :total_awal and :total_akhir")
	List<Transaksi> cekTotal_range(
			@Param("total_awal") Integer total_awal,
			@Param("total_akhir") Integer total_akhir
			);
	
	@Query("select u from Transaksi u where u.jenis_pembayaran=:jenis_pembayaran")
	List<Transaksi> cekPembayaran(
			@Param("jenis_pembayaran") String jenis_pembayaran
			);
	
	@Query("select u from Transaksi u")
	List<Transaksi> cekUser(
		//	@Param("token") String token
			);
	
}
