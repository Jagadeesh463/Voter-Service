package com.mindtree.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.entity.Voter;
import com.mindtree.repository.VoterRepository;
@Service
public class VoterServiceimpl implements VoterService {
	
	@Autowired
	private VoterRepository voterRepo;
	
	@Override
	public List<Voter> fetchAllVoters() {
		return voterRepo.findAll();
	}

	@Override
	public Voter addVoter(Voter voter) {
		return voterRepo.save(voter);
	}
	
}
