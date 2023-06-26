package com.criptonita.trading.test.binance.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder()
@JsonFormat(shape = JsonFormat.Shape.ARRAY)
public class Kline {

    private Long openTime;

    private String open;

    private String high;

    private String low;

    private String close;

    private String volume;

    private Long closeTime;

    private String quoteAssetVolume;

    private Long numberOfTrades;

    private String takerBuyBaseAssetVolume;

    private String takerBuyQuoteAssetVolume;

    private String unusedField;

}
