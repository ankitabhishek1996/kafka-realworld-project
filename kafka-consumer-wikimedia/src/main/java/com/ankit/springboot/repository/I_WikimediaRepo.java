package com.ankit.springboot.repository;

import com.ankit.springboot.entity.WikimediaDataRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface I_WikimediaRepo extends JpaRepository<WikimediaDataRepository,Long> {
}
