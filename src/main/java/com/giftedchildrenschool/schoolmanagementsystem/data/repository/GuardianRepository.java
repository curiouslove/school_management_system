package com.giftedchildrenschool.schoolmanagementsystem.data.repository;

import com.giftedchildrenschool.schoolmanagementsystem.data.model.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuardianRepository extends JpaRepository<Guardian, Long> {

}
