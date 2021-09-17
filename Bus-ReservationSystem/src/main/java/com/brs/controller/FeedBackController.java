package com.brs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brs.entity.FeedBack;
import com.brs.exceptions.FeedBackNotFoundException;
import com.brs.service.IFeedBackService;

@RestController
@RequestMapping("rest/api")
public class FeedBackController {
	@Autowired
	IFeedBackService feedbackService;
	
	@PostMapping("/feedbacks")
	public ResponseEntity<FeedBack> addFeedBack(@RequestBody FeedBack feedback){
		FeedBack newVal = feedbackService.addFeedBack(feedback);
		return new ResponseEntity<FeedBack>(newVal,HttpStatus.OK);
		
	}
	
	@PutMapping("/feedbacks/update")
	public ResponseEntity<FeedBack> updateFeedBack(@RequestBody FeedBack feedback){
		FeedBack newVal = feedbackService.updateFeedBack(feedback);
		return new ResponseEntity<FeedBack>(newVal,HttpStatus.OK);
		
	}
	
	@GetMapping("/feedbacks/{date}")
	public ResponseEntity<FeedBack> viewFeedBack(@PathVariable("id") int feedbackId) throws FeedBackNotFoundException{
		return new ResponseEntity<FeedBack>(feedbackService.viewFeedBack(feedbackId),HttpStatus.OK);
		
	}
	
	@GetMapping("/feedbacks")
	public ResponseEntity<List<FeedBack>> viewAllFeedBack(){
		List<FeedBack> firstFeedBack = feedbackService.viewAllFeedBack();
		return new ResponseEntity<List<FeedBack>>(firstFeedBack,HttpStatus.OK);
	}
	

}