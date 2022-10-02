package rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import rest.Weather.WeatherObject;

public class RestApiTest {
    String url="https://goweather.herokuapp.com/weather/";
 //   String url1="https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=EUR&json";
    String city="kyiv";
    @Test
    public void Test(){
        String s=RestApiGet.getWeather(url+city);
        System.out.println("Response code:"+RestApiGet.getResponseCode());
        JSONObject jsonObject=new JSONObject(s);
        System.out.println(jsonObject.get("temperature"));
        JSONArray array = new JSONArray(jsonObject.getJSONArray("forecast"));
        for(int i =0;i<array.length();i++){
            JSONObject microjson = (JSONObject) array.get(i);
            int day= i+1;
            System.out.println("DAY " + day);
            System.out.println(microjson.get("wind"));

        }
    }
    @Test
public void Test2()throws JsonProcessingException {
        String s=RestApiGet.getWeather(url+"newyork");
        WeatherObject myObject=new ObjectMapper().readValue(s,WeatherObject.class);
        System.out.println(myObject.description);

}




}
