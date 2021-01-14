package com.zenith.hrportal.rest;

import com.zenith.hrportal.dto.trade.TradeWsDTO;
import com.zenith.hrportal.entities.trade.Trade;
import com.zenith.hrportal.service.trade.TradeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * The type Trade controller.
 */
@RestController
@RequestMapping(value = "/api")
public class TradeController {

    @Autowired
    private TradeService tradeService;

    @Autowired
    private ModelMapper modelMapper;

    /**
     * Gets all.
     *
     * @return the all
     */
    @RequestMapping(value = "/professions",method = RequestMethod.GET)
    @ResponseBody
    public List< TradeWsDTO > getAll() {
        List< Trade > trades = tradeService.getAll();
        return trades.stream().map(trade -> this.convertToDto(trade)).collect(Collectors.toList());
    }

    private TradeWsDTO convertToDto(Trade trade) {
        TradeWsDTO dto = modelMapper.map(trade, TradeWsDTO.class);
        dto.setCode(trade.getTraddeIdentity().getCode());
        dto.setPmlId(trade.getTraddeIdentity().getPmlId());
        dto.setCompCode(trade.getTraddeIdentity().getCompCode());
        return dto;
    }

}
