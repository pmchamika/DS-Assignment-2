package com.IT17056212.DialogPayment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IT17056212.DialogPayment.model.roads;
import com.IT17056212.DialogPayment.repositories.PaymentRepository;

@Service
public class PaymentImpl implements PaymentService {

	@Autowired
	PaymentRepository paymentRepository;
	


	//add payment
	@Override
	public void saveOrUpdateExpense(roads r) {
		paymentRepository.save(r);
	}

	//find by road
	@Override
	public List<roads> findByroad(String road) {
		
		return paymentRepository.findByroad(road);
	}

	
	
	

}
