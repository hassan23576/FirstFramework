import common.CommonAPI;
import home.GoogleSearch;
import org.testng.annotations.Test;

public class SearchTest extends CommonAPI {

    @Test
    public void testUserCanSearchKeyword() {
        driver.get("https://google.com");
        GoogleSearch gs = new GoogleSearch();
        gs.search("honda accord forum");
    }

}
