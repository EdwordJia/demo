package com.interview.demo.utils;



import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Map;

public class ParamsUtil {
    private static final char SEPARATOR = '_';

    public static Map<String, Object> getMap(HttpServletRequest request) {
        Map<String, Object> map = Maps.newHashMap();
        Enumeration<String> enumeration = request.getParameterNames();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            if (!StringUtils.equalsAny(key, "page", "rows", "sort", "order", "beginDay", "endDay", "limit")) {
                if (StringUtils.isNotEmpty(request.getParameter(key))) {
                    map.put(ParamsUtil.camel_to_underline(key), request.getParameter(key));
                }
            }
        }
        return map;
    }

    /**
     * 将驼峰命名的字符串转为下划线
     *
     * <P>example:
     * "helloWorld" cover to "hello_world"
     *
     * @param str 需要符合驼峰命名法的字符串
     * @return cover string
     */
    public static String camel_to_underline(final String str) {
        if(str == null) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isUpperCase(c)) {
                builder.append(SEPARATOR).append(Character.toLowerCase(c));
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
