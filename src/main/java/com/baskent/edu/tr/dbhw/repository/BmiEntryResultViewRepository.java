package com.baskent.edu.tr.dbhw.repository;

import com.baskent.edu.tr.dbhw.entity.BmiEntryResultView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BmiEntryResultViewRepository extends JpaRepository<BmiEntryResultView, Long> {
        // Additional methods can be defined here if needed
}
