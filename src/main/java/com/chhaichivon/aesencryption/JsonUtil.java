package com.chhaichivon.aesencryption;

import java.lang.reflect.Type;
//import org.json.JSONObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/**
 * @author: Chhai Chivon on 9/23/2019
 * Digital Channel System Officer
 */

public class JsonUtil {

    private static Gson gson = new GsonBuilder().setDateFormat( "yyyy-MM-dd HH:mm:ss" ).create();
/*
    public static JSONObject toJson( Object obj ){
        JSONObject result = null;
        try {
            result = new JSONObject( gson.toJson( obj ) );
        }catch( Exception ex ) {
            ex.printStackTrace();
        }
        return result;
    }*/

    public static <T> T fromJson( String jsonString, Class<T> classOfT ){
        T result = null;
        try {
            result = gson.fromJson( jsonString, classOfT );
        }catch( Exception ex ) {
            ex.printStackTrace();
        }
        return result;
    }

    public static <T> T fromJson( String jsonString, Type t ){
        T result = null;
        try {

            result = gson.fromJson( jsonString, t );

        }catch( Exception ex ) {
            ex.printStackTrace();
        }
        return result;
    }
}
