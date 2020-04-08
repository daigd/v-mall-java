package com.v.project.common.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author : DaiGD
 * @createtime :  2020年04月08日 16:02
 * @description :
 */
public enum LocalDateTimeUtils
{
    ;

    public static Date toDate(LocalDateTime localDateTime)
    {
        ZoneId zone = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zone).toInstant();
        java.util.Date date = Date.from(instant);
        return date;
    }
}
