package xyz.amazingxu.whattoeat.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unchecked")
public class WebUtils {

    public static WebResults success(Object dat){
        return success(0,dat);
    }

    public static WebResults success(int code, Object dat){
        WebResults result = new WebResults();
        result.setCode(code);
        result.setMessage("OK");
        result.setData(dat);
        return result;
    }

    public static WebResults success(){
        return success(null);
    }

    public static WebResults error(int code, String msg){
        WebResults result = new WebResults();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }

    public static WebResults error(Exception ex){
        WebResults result = new WebResults();
        result.setCode(ex.hashCode());
        result.setMessage(ex.getMessage());
        return result;
    }

    public static String getString(WebResults webResults) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(webResults);
    }
}
