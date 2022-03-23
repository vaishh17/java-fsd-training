package com.demo.ust.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ust.service.Producer;


@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {
	
	@Autowired
	Producer producer;
	
	@PostMapping(value="/post")
	public void sendMessage(@RequestParam("msg") String msg)
	{
		producer.publishToTopic(msg);
	}

}