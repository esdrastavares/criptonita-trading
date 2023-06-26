package com.criptonita.trading.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CandleStick {

    public static final String MINUTE = "minute";

    public static final String HOUR = "hour";

    public static final String DAY = "day";

    public static final String WEEK = "week";

    public static final String MONTH = "month";

    public static final String INTERVAL_ONE_MINUTE = "1m";

    public static final String INTERVAL_THREE_MINUTES = "3m";

    public static final String INTERVAL_FIVE_MINUTES = "5m";

    public static final String INTERVAL_FIFTEEN_MINUTES = "15m";

    public static final String INTERVAL_THIRTY_MINUTES = "30m";

    public static final String INTERVAL_ONE_HOUR = "1h";

    public static final String INTERVAL_TWO_HOURS = "2h";

    public static final String INTERVAL_FOUR_HOURS = "4h";

    public static final String INTERVAL_SIX_HOURS = "6h";

    public static final String INTERVAL_EIGHT_HOURS = "8h";

    public static final String INTERVAL_TWELVE_HOURS= "12h";

    public static final String INTERVAL_ONE_DAY = "1d";

    public static final String INTERVAL_THREE_DAY = "3d";

    public static final String INTERVAL_ONE_WEEK = "1w";

    public static final String INTERVAL_ONE_MONTH = "1M";

    private BigDecimal open;

    private BigDecimal high;

    private BigDecimal low;

    private BigDecimal close;

    private BigDecimal volume;

    private Long numberOfTrades;

    private LocalDateTime openTime;

    private LocalDateTime closeTime;

}
