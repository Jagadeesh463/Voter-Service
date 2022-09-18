package com.mindtree.service;
import java.util.List;

import com.mindtree.entity.Voter;

	public interface VoterService {
		
		
		public List<Voter> fetchAllVoters();

		public Voter addVoter(Voter votr);

	}



