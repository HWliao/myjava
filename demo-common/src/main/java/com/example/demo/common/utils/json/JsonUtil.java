package com.example.demo.common.utils.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;

/**
 * 轻度包装ObjectMapper,方便使用
 *
 * @author HWliao
 */
public class JsonUtil {
    private JsonUtil() {
    }

    private static final ObjectMapper MAPPER;

    static {
        /*
        这里的配置作为通用的json序列化/反序列化配置,改动时请保证通用性和兼容性
        如果有特殊的序列化需要,可以针对性配置ObjectMapper
        有些个性化的需求可以通过Jackson的注解来完成
         */
        MAPPER = new ObjectMapper();

        MAPPER.configure(MapperFeature.DEFAULT_VIEW_INCLUSION, false);
        // 反序列化
        // 未知属性跳过
        MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        // 序列化
        //在序列化时忽略值为 null 的属性
        MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        // 关于日期/时间 这里并没有统一设置为固定格式, 保持默认的时间戳
    }

    /**
     * 对象转化为json自负床
     *
     * @param t   目标对象
     * @param <T> 对象类型
     * @return 字符串
     */
    public static <T> String toJsonString(T t) {
        if (t == null) {
            return "";
        }
        try {
            return MAPPER.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            throw new JsonProcessException(e);
        }
    }

    /**
     * 字符串转化为对象
     *
     * @param text  字符串
     * @param clazz 对象类型
     * @param <T>   类型
     * @return 结果
     */
    public static <T> T toObject(String text, Class<T> clazz) {
        text = StringUtils.defaultString(text);
        try {
            return MAPPER.readValue(text, clazz);
        } catch (JsonProcessingException e) {
            throw new JsonProcessException(e);
        }
    }

    /**
     * 解析字符串为JsonNode
     *
     * @param text 字符串
     * @return JsonNode
     */
    public static JsonNode toJsonNode(String text) {
        text = StringUtils.defaultString(text);
        try {
            return MAPPER.readTree(text);
        } catch (JsonProcessingException e) {
            throw new JsonProcessException(e);
        }
    }

    /**
     * 复制一个内部的ObjectMapper, 方便外部自定义
     */
    public static ObjectMapper objectMapper() {
        return MAPPER.copy();
    }
}
