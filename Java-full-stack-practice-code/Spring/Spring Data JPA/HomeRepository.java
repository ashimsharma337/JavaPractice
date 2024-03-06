package com.example.homebuyer.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homebuyer.beans.Home;

@Repository                             // needs two parameter object and data-type-primary key
public interface HomeRepository extends JpaRepository<Home, Integer> {

}
