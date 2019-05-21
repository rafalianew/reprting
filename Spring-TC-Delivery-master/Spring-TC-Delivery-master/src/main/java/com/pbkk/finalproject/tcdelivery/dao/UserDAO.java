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
public class UserDAO {
	
	@Autowired
	UserRepository userRepository;
//	
//	@Autowired
//	TransaksiRepository transaksiRepository;
//	
	
	public User save(User usr) {
		return userRepository.save(usr);
	}
	
	public List<User> findAll()
	{
		return userRepository.findAll();
	}
	
	
	
	
	public User findById(Integer id)
	{
		User usr=userRepository.findByIduser(id);
		if(usr!=null && usr.getStatus()==1)
		{
			return new User(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
		}
		return null;
	}
	
	public List<User> findCustomer(Integer id)
	{
		List <User> customers=new ArrayList<User>(); 
		if(id!=null)
		{
			User usr=userRepository.findByIduser(id);
			if(usr!=null && usr.getRole()==1 && usr.getStatus()==1)
			{
				customers.add(new User(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber()));
			}
		}
		else
		{
			List<User> getCustomers=userRepository.findCustomer();
			if(getCustomers!=null)
			{
				for(User usr:getCustomers)
				{
					customers.add(new User(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber()));
				}
			}
		}
		return customers;
	}
	
	public List<User> findDriver(Integer id)
	{
		List <User> drivers=new ArrayList<User>(); 
		if(id!=null)
		{
			User usr=userRepository.findByIduser(id);
			if(usr!=null && usr.getRole()==4 && usr.getStatus()==1)
			{
				drivers.add(new User(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber()));
			}
		}
		else
		{
			List<User> getDrivers=userRepository.findDriver();
			if(getDrivers!=null)
			{
				for(User usr:getDrivers)
				{
					drivers.add(new User(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber()));
				}
			}
		}
		return drivers;
	}
	
	public List<User> findRestaurant(Integer id)
	{
		List <User> restaurants=new ArrayList<User>(); 
		if(id!=null)
		{
			User usr=userRepository.findByIduser(id);
			if(usr!=null && usr.getRole()==2 && usr.getStatus()==1)
			{
				restaurants.add(new User(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber()));
			}
		}
		else
		{
			List<User> getCustomers=userRepository.findRestaurant();
			if(getCustomers!=null)
			{
				for(User usr:getCustomers)
				{
					restaurants.add(new User(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber()));
				}
			}
		}
		return restaurants;
	}
	
	public User login2(String email,String password)
	{
		User user=userRepository.findByEmailandPassword(email, DigestUtils.sha256Hex(password));
		String pass;
		pass = DigestUtils.sha256Hex(password);
		System.out.println(pass);
		if(user==null)
		{
			throw new IllegalArgumentException("Email or Password is Not Match");
		}
		return user;
	}
	
	public User login(Integer userId,String password)
	{
		User user=userRepository.findByUserIdandPassword(userId, DigestUtils.sha256Hex(password));
		return user;
	}
	
	public boolean checkUsername(String userName)
	{
		User checkUser=userRepository.findByUsername(userName);
		if(checkUser == null)
		{
			return true;
		}
		else if(checkUser.getStatus() == 0)
		{
			return false;
		}
		return false;
	}
	
	public boolean checkEmail(String email)
	{
		User checkUser=userRepository.findByEmail(email);
		if(checkUser == null)
		{
			return true;
		}
		else if(checkUser.getStatus() == 0)
		{
			return false;
		}
		return false;
	}
	
	public void deleteUser(Integer userId)
	{
		User usr=userRepository.findByIduser(userId);
		if(usr!=null)
		{
			usr.setStatus(0);
			userRepository.save(usr);
		}
	}
	
	public void updatePasswordUser(Integer userId,String password)
	{
		User usr=userRepository.findByIduser(userId);
		if(usr!=null)
		{
			usr.setPassword(password);
			userRepository.save(usr);
		}
	}
	
	public void updateUser(Integer userId, String name, String userName, String email, String phoneNumber)
	{
		User usr=userRepository.findByIduser(userId);
		if(usr!=null)
		{
			if(!StringUtils.isEmpty(name)) {
				usr.setName(name);
			}
			if(!StringUtils.isEmpty(userName)) {
				usr.setUserName(userName);
			}
			if(!StringUtils.isEmpty(email)) {
				usr.setEmail(email);
			}
			if(!StringUtils.isEmpty(phoneNumber)) {
				usr.setPhoneNumber(phoneNumber);
			}
			
			userRepository.save(usr);
		}
	}
//
//	public Transaksi findTransaksi(Integer id) {
//		Transaksi usr=transaksiRepository.findTransaksi(id);
//	if(usr!=null)
//	{
////		return new Transaksi(usr.getId(),usr.getName(),usr.getUserName(),usr.getRole(),usr.getStatus(),usr.getEmail(),usr.getPhoneNumber());
//		return new Transaksi(usr.getNo(), usr.getIdTransaksi(), usr.getIdMenu(), usr.getHari(), usr.getBulan(), usr.getTahun(), usr.getIdRestaurant(), usr.getMenuName(), usr.getMenuPrice(), usr.getJmlh(), usr.getTotal(), usr.getIdCustomer(), usr.getIdDriver(), usr.getJenisPembayaran());
//	}
//	return usr;
//	}
}
