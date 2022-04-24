import io.swagger.client.ApiException;
import io.swagger.client.api.BankApi;

public class BanksApiExample {
    public static void main(String[] args) {
        BankApi bankApi = new BankApi();

        try {
            bankApi.createBank(0.5, 0.5, 1000L);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
            e.printStackTrace();
        }
    }
}
