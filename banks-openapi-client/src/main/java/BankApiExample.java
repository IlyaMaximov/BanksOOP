import io.swagger.client.ApiException;
import io.swagger.client.api.BankApi;
import io.swagger.client.model.ResponseWrapperBank;

public class BankApiExample {
    public static void main(String[] args) {
        BankApi bankApi = new BankApi();

        try {
            ResponseWrapperBank response = bankApi.createBank(0.5, 0.5, 1000L);
            System.out.println(response);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
