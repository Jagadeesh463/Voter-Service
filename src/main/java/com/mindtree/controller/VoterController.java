package com.mindtree.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.Voter;
import com.mindtree.service.VoterService;
@RestController 
@RequestMapping("/voter")
@CrossOrigin
public class VoterController {

	@Autowired
	VoterService voterService;
	
	@GetMapping("/getAllVoters")
	public ResponseEntity<?> getAllVoters()
	{ 
		
		List<Voter> voterList = voterService.fetchAllVoters();
				
		return new ResponseEntity<List<Voter>>(voterList,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> addVoter(@RequestBody Voter voter){
		Voter savedVoter = voterService.addVoter(voter);
		
		return new ResponseEntity<Voter>(savedVoter,HttpStatus.CREATED);
	}
}
