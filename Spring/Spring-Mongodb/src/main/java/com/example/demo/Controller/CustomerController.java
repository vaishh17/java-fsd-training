package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.CustomerRepository;
import com.example.demo.model.Customer;

@RestController
public class CustomerController {
	
	
	@Autowired
	private CustomerRepository repository;
	
	@PostMapping("/addCustomer")
	public String saveCustomer(@RequestBody Customer customer) {
		repository.save(customer);
		return "Customer Added";
	}
	
	@GetMapping("/list")
	public List<Customer> getCustomers(){
		return repository.findAll();
	}
	
	@GetMapping("/findAllCustomers/{id}")
	public Optional<Customer> getCustomer(@PathVariable int id){
		return repository.findById(id);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable int id) {
		repository.deleteById(id);
		return "Customer Deleted !";
	}
}
