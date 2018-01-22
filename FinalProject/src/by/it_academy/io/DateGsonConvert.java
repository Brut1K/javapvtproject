package by.it_academy.io;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateGsonConvert implements JsonDeserializer<Date>{

        private final String[] FORMATS = new String[]{
            "dd-MM-yyyy HH:mm",
            "dd-MM-yyyy"
        };

    @Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        for(String format:FORMATS   ){
            try{
                SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.getDefault());
                sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
                return sdf.parse(json.getAsString());
            } catch(Exception e){

            }
        }

        return null;
    }
}
