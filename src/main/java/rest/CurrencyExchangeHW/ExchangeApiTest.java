package rest.CurrencyExchangeHW;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class ExchangeApiTest {
    @Test
    public void TestEUR() throws JsonProcessingException {
        String url="https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=EUR&json";
        String exchangeEUR = ExchangeApiGet.getCurrencyExchange(url);
        CurrencyExchangeObject myObject = new ObjectMapper().readValue(exchangeEUR, CurrencyExchangeObject.class);
        System.out.println("Rate EUR: "+myObject.rate);
    }
    @Test
    public void TestUSD() throws JsonProcessingException {
        String url="https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=USD&json";
        String exchangeEUR = ExchangeApiGet.getCurrencyExchange(url);
        CurrencyExchangeObject myObject = new ObjectMapper().readValue(exchangeEUR, CurrencyExchangeObject.class);
        System.out.println("Rate USD: "+myObject.rate);
    }
    @Test
    public void TestRUB() throws JsonProcessingException {
        String url="https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=RUB&json";
        String exchangeEUR = ExchangeApiGet.getCurrencyExchange(url);
        CurrencyExchangeObject myObject = new ObjectMapper().readValue(exchangeEUR, CurrencyExchangeObject.class);
        System.out.println("Rate RUB: "+myObject.rate);
    }
}


