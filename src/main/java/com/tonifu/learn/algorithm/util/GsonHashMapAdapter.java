package com.tonifu.learn.algorithm.util;

import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author fuj
 * @Date 3/14/23 9:41 AM
 * @PackageName:com.tonifu.learn.algorithm.util
 * @ClassName: GsonHashMapAdapter
 * @Description: TODO
 * @Version 1.0
 */
public class GsonHashMapAdapter implements JsonDeserializer<HashMap<String,Object>> {
    @Override
    public HashMap<String,Object> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if(type!=null&&type.getTypeName().contains("HashMap")){
            HashMap<String,Object> map=new HashMap<>();
            JsonObject jsonObject=jsonElement.getAsJsonObject();
            Set<Map.Entry<String,JsonElement>> entrySet=jsonObject.entrySet();
            if(null!=entrySet){
                for(Map.Entry<String,JsonElement> entry:entrySet){
                    map.put(entry.getKey(),entry.getValue());
                }
            }
            return map;

        }
        return null;
    }
}
