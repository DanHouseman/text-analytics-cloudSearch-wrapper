package cloudSearch.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.util.json.JSONArray;
import com.amazonaws.util.json.JSONException;


/**
 * Created by dan.houseman on 9/14/16.
 */

public class Hit {
    public String id;
    public Map<String, String> fields = new HashMap<String, String>();

    public Integer getIntegerField(String field) {
        Integer result = null;
        if(fields.containsKey(field)) {
            result = Integer.parseInt(fields.get(field));
        }
        return result;
    }

    public Long getLongField(String field) {
        Long result = null;
        if(fields.containsKey(field)) {
            result = Long.parseLong(fields.get(field));
        }
        return result;
    }

    public Double getDoubleField(String field) {
        Double result = null;
        if(fields.containsKey(field)) {
            result = Double.parseDouble(fields.get(field));
        }
        return result;
    }

    public String getField(String field) {
        return fields.get(field);
    }

    public List<String> getListField(String field) throws JSONException {
        List<String> result = null;

        if(fields.containsKey(field)) {

            String value = fields.get(field);
            JSONArray array = new JSONArray(value);

            if(array.length() > 0) {
                result = new ArrayList<String>();

                for(int i = 0; i < array.length(); i++) {
                    result.add(array.getString(i));
                }
            }
        }

        return result;
    }
}