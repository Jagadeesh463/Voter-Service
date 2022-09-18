package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.entity.Voter;

public interface VoterRepository  extends JpaRepository<Voter, Integer>   {

}
