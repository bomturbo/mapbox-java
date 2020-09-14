package com.mapbox.api.directions.v5;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.utils.FormatUtils;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Date adapter to serialize/deserialize specific ISO 8601 date format.
 */
public class LocalDateTimeAdapter extends TypeAdapter<LocalDateTime> {

  @Override
  public void write(JsonWriter out, LocalDateTime value) throws IOException {
    out.value(FormatUtils.formatDateTimeToIso8601(value));
  }

  @Override
  public LocalDateTime read(JsonReader in) throws IOException {
    return LocalDateTime.parse(
      in.nextString(),
      DateTimeFormatter.ofPattern(FormatUtils.ISO_8601_PATTERN)
    );
  }
}
