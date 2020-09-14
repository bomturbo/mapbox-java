package com.mapbox.api.directions.v5.utils;

import com.mapbox.core.TestUtils;
import java.time.LocalDateTime;
import java.time.Month;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormatUtilsTest extends TestUtils {

  @Test
  public void formatDateTimeToIso8601() {
    LocalDateTime ldt1 = LocalDateTime.parse("2018-10-23T17:19:33");
    LocalDateTime ldt2 = LocalDateTime.of(2013, Month.APRIL, 3, 14, 32);
    LocalDateTime ldt3 = LocalDateTime.of(2016, Month.MAY, 1, 8, 45, 44);
    LocalDateTime ldt4 = LocalDateTime.of(2020, Month.DECEMBER, 16, 10, 9, 31, 111);

    assertEquals("2018-10-23T17:19", FormatUtils.formatDateTimeToIso8601(ldt1));
    assertEquals("2013-04-03T14:32", FormatUtils.formatDateTimeToIso8601(ldt2));
    assertEquals("2016-05-01T08:45", FormatUtils.formatDateTimeToIso8601(ldt3));
    assertEquals("2020-12-16T10:09", FormatUtils.formatDateTimeToIso8601(ldt4));
  }
}
