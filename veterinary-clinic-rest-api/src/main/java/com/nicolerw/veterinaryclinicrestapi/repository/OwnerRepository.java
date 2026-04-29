package com.nicolerw.veterinaryclinicrestapi.repository;

import com.nicolerw.veterinaryclinicrestapi.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
