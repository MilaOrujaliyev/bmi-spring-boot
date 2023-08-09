package com.baskent.edu.tr.dbhw.service;

import com.baskent.edu.tr.dbhw.entity.BmiEntryResultView;
import com.baskent.edu.tr.dbhw.repository.BmiEntryResultViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BmiEntryResultViewServiceImpl implements BmiEntryResultViewService {
    private final BmiEntryResultViewRepository repository;

    @Autowired
    public BmiEntryResultViewServiceImpl(BmiEntryResultViewRepository repository) {
        this.repository = repository;
    }

    public List<BmiEntryResultView> getAllBmiEntryResults() {
        return repository.findAll();
    }
}
