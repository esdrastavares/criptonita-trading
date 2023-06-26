package com.criptonita.trading.test.binance.utils;

import com.criptonita.trading.test.binance.model.Kline;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.text.MessageFormat;
import java.util.List;

public class BinanceLoadData {

    public static List<Kline> loadKlineFromJson(final String symbol, final String period, final String interval)
            throws IOException {

        final ObjectMapper objectMapper = new ObjectMapper();

        final String path = MessageFormat
                .format("src/test/resources/data/binance/{0}/{0}_{1}_{2}.json", symbol, period, interval);

        final String json = Files.readString(new File(path).toPath(), Charset.defaultCharset());

        return objectMapper.readValue(json, new TypeReference<>() {
        });
    }

}
