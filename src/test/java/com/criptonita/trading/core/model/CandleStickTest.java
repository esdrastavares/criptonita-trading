package com.criptonita.trading.core.model;

import com.criptonita.trading.test.binance.model.Kline;
import com.criptonita.trading.test.binance.utils.BinanceLoadData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

class CandleStickTest {

    @Test
    void testBinanceLoadKlineFromJson() throws IOException {

        final List<Kline> klines = BinanceLoadData
                .loadKlineFromJson("BTCUSDT", CandleStick.DAY, CandleStick.INTERVAL_ONE_DAY);

        System.out.println(klines.get(0));

    }

}
