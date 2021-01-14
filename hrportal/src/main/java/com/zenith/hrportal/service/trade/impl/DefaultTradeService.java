package com.zenith.hrportal.service.trade.impl;

import com.zenith.hrportal.entities.trade.Trade;
import com.zenith.hrportal.repository.TradeRepository;
import com.zenith.hrportal.service.trade.TradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The type Default trade service.
 */
@Service
public class DefaultTradeService implements TradeService {

    @Autowired
    private TradeRepository tradeRepository;

    @Override
    public Page< Trade > getPage(Pageable pageable) {
        return tradeRepository.findAll(pageable);
    }

    @Override
    public List< Trade > getAll() {
        return tradeRepository.findAll();
    }
}
