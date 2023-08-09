package com.baskent.edu.tr.dbhw.service;

import com.baskent.edu.tr.dbhw.entity.BmiEntryResult;
import com.baskent.edu.tr.dbhw.repository.BmiEntryResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BmiEntryResultServiceImpl implements BmiEntryResultService {
    private BmiEntryResultRepository bmiEntryResultRepository;

    @Autowired
    public BmiEntryResultServiceImpl(BmiEntryResultRepository bmiEntryResultRepository) {
        this.bmiEntryResultRepository = bmiEntryResultRepository;
    }

    @Override
    public BmiEntryResult saveBmiEntryResult(BmiEntryResult bmiEntryResult) {
        return bmiEntryResultRepository.save(bmiEntryResult);
    }

    @Override
    public BmiEntryResult getBmiEntryResultById(Long id) {
        return bmiEntryResultRepository.findById(id).orElse(null);
    }

    @Override
    public List<BmiEntryResult> getAllBmiEntryResults() {
        return bmiEntryResultRepository.findAll();
    }

    @Override
    public void deleteBmiEntryResult(Long id) {
        bmiEntryResultRepository.deleteById(id);
    }
}
