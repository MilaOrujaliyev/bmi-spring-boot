package com.baskent.edu.tr.dbhw.service;

import com.baskent.edu.tr.dbhw.entity.BmiEntryResultView;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BmiEntryResultViewService {
    public List<BmiEntryResultView> getAllBmiEntryResults();

}
