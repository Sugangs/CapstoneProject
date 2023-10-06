package com.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.dao.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer>{

	public Seller findBySellermailid(String sellermailid);

}
