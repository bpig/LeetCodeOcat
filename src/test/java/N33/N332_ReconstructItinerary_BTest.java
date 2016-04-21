package N33;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/4/20
 */
public class N332_ReconstructItinerary_BTest {
    N332_ReconstructItinerary_B nb = new N332_ReconstructItinerary_B();

    @Test
    public void findItinerary() throws Exception {
        String[][] tickets = new String[][]{
                {"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"}, {"ATL", "JFK"}, {"ATL", "SFO"}};
        List<String> expect = Arrays.asList("JFK", "ATL", "JFK", "SFO", "ATL", "SFO");
        List<String> ans = nb.findItinerary(tickets);
        assertEquals(expect, ans);

        tickets = new String[][]{{"JFK", "KUL"}, {"JFK", "NRT"}, {"NRT", "JFK"}};
        expect = Arrays.asList("JFK", "NRT", "JFK", "KUL");
        ans = nb.findItinerary(tickets);
        assertEquals(expect, ans);

        tickets = new String[][]{
                {"EZE", "TIA"}, {"EZE", "HBA"}, {"AXA", "TIA"}, {"JFK", "AXA"},
                {"ANU", "JFK"}, {"ADL", "ANU"}, {"TIA", "AUA"}, {"ANU", "AUA"},
                {"ADL", "EZE"}, {"ADL", "EZE"}, {"EZE", "ADL"}, {"AXA", "EZE"},
                {"AUA", "AXA"}, {"JFK", "AXA"}, {"AXA", "AUA"}, {"AUA", "ADL"},
                {"ANU", "EZE"}, {"TIA", "ADL"}, {"EZE", "ANU"}, {"AUA", "ANU"}
        };
        expect = Arrays.asList("JFK", "AXA", "AUA", "ADL", "ANU", "AUA", "ANU", "EZE",
                "ADL", "EZE", "ANU", "JFK", "AXA", "EZE", "TIA", "AUA", "AXA", "TIA", "ADL", "EZE", "HBA");
        ans = nb.findItinerary(tickets);
        assertEquals(expect, ans);
    }
}