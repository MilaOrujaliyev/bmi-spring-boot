package com.baskent.edu.tr.dbhw.service;

import com.baskent.edu.tr.dbhw.entity.BmiEntryResult;

import java.util.List;

public interface BmiEntryResultService {
    BmiEntryResult saveBmiEntryResult(BmiEntryResult bmiEntryResult);
    BmiEntryResult getBmiEntryResultById(Long id);
    List<BmiEntryResult> getAllBmiEntryResults();
    void deleteBmiEntryResult(Long id);
}
