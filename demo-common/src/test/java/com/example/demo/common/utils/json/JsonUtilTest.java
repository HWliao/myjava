package com.example.demo.common.utils.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * JsonUtil单元测试
 */
@Slf4j
@SpringBootTest
public class JsonUtilTest {

    @Test
    public void testDate() throws JSONException, ParseException {
        String text = "2020-07-28 12:11:10.111";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date t = sdf.parse(text);

        ForTest forTest = ForTest
            .builder()
            .date1(t)
            .date2(t)
            .build();

        String s = JsonUtil.toJsonString(forTest);

        JSONAssert.assertEquals("{\"date1\":" + t.getTime() + ",\"date2\":\"" + text + "\"}", s, false);
    }


    @Data
    @Builder
    public static class ForTest implements Serializable {
        private static final long serialVersionUID = 174668122850542211L;
        private Date date1;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS", timezone = "GMT+8")
        private Date date2;
    }

}
