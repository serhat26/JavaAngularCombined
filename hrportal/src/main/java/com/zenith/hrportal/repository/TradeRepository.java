package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.trade.Trade;
import com.zenith.hrportal.entities.trade.TradeIdentity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The interface Trade repository.
 */
public interface TradeRepository extends JpaRepository< Trade, TradeIdentity > {

    /**
     * Find by tradde identity trade.
     *
     * @param tradeIdentity the trade identity
     * @return the trade
     */
    Trade findByTraddeIdentity(TradeIdentity tradeIdentity);
}
