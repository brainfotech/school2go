package com.brainfotech.school2go.util;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by thameema on 4/27/14.
 */

@Component
public class CustomJsonDateSerializer extends JsonSerializer<DateTime> {

    private @Value("${application.default.timezone}") String systemTimeZone;

    @Override
    public void serialize(DateTime dateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        final DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:sss'Z'");
        df.setTimeZone(TimeZone.getTimeZone(systemTimeZone));
        String formattedDate = df.format(dateTime);
        jsonGenerator.writeString(formattedDate);
    }
}
