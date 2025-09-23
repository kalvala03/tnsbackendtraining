package com.kprit.tnsproj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kprit.tnsproj.entity.Admin;
import com.kprit.tnsproj.repository.AdmRepo;

@Service
public class AdmService {
	
	@Autowired
	public AdmRepo ar;
	
	//Insert
	public Admin addAdm(Admin ad) {
		return ar.save(ad);
	}
	
	//Retrive
	public List<Admin> getAdm(){
		return ar.findAll();
	}
	
	//Delete
	public void deleteAdm(long aid) {
		ar.deleteById(aid);
	}
	
	//Update
	public Admin updateAdm(Admin ad) {
		Long aid=ad.getAid();
		Admin ad1=ar.findById(aid).get();
		ad1.setName(ad.getName());
		ad1.setPassword(ad.getPassword());
		return ar.save(ad1);
	}
}
