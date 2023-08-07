package com.ss.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ss.model.LoginModel;
import com.ss.repo.LoginRepo;

@Service
public class LoginService {


	@Autowired
	private LoginRepo loginRepo;

	@Transactional(readOnly = true)
	public List<LoginModel> findAll() {
		return this.loginRepo.findAll();
	}

	@Transactional
	public String save(LoginModel lm) {
		try {
			List<LoginModel> user = loginRepo.findByEmailAndPassword(lm.getEmail(), lm.getPassword());
			if (user == null || user.isEmpty()) {
				System.out.println("user not found saving it----"+lm);
				loginRepo.save(lm);
				System.out.println("user saved successfully----"+ lm);
				return "login";
			}
			
			System.out.println("user found and redirecting to other page----"+ lm);
			return "dashboard";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "login";


	}

}
