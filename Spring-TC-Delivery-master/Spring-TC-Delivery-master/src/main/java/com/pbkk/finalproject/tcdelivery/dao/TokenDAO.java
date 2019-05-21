package com.pbkk.finalproject.tcdelivery.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pbkk.finalproject.tcdelivery.model.Token;
import com.pbkk.finalproject.tcdelivery.repository.TokenRepository;

@Service
public class TokenDAO {
	
	@Autowired
	TokenRepository tokenRepository;
	
	public Token save(Token token)
	{
		return tokenRepository.save(token);
	}
	
	public Token getByStringToken(String stringToken)
	{
		Token getToken=tokenRepository.findByStringToken(stringToken);
		if(getToken!=null)
		{
			return getToken;
		}
		return null;
	}

	public void delete(String stringToken)
	{
		Token deleteToken=tokenRepository.findByStringToken(stringToken);
		if(deleteToken!=null)
		{
			tokenRepository.delete(deleteToken);
		}
	}
}
