package com.zenith.hrportal.service.trade;

import com.zenith.hrportal.entities.trade.Trade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * The interface Trade service.
 */
public interface TradeService {

    /**
     * Gets page.
     *
     * @param pageable the pageable
     * @return the page
     */
    Page< Trade > getPage(Pageable pageable);

    /**
     * Gets all.
     *
     * @return the all
     */
    List< Trade> getAll();
}
