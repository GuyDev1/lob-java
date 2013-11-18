import com.lob.Lob;
import com.lob.exception.LobException;
import com.lob.model.Service;
import com.lob.model.ServiceCollection;

public class ServiceTests {

    public static void main(String[] args) {
        Lob.apiKey = "test_0dc8d51e0acffcb1880e0f19c79b2f5b0cc:";
        try {
            ServiceCollection ac = Service.all(Lob.apiKey);
            System.out.println(ac);
                        
        } catch (LobException e) {
        	System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (Exception e) {
        	System.out.println(e.getMessage());
            e.printStackTrace();
        }       
    }
}