package com.baskent.edu.tr.dbhw.repository;

import com.baskent.edu.tr.dbhw.entity.BmiEntryResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BmiEntryResultRepository extends JpaRepository<BmiEntryResult, Long> {
    // Ek özel sorgular veya işlemler burada tanımlanabilir
}
