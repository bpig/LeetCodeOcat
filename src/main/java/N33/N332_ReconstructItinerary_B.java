package N33;

import java.util.*;

/**
 * Created: shuai.li
 * Date: 2016/4/20.
 */
public class N332_ReconstructItinerary_B {
    public List<String> findItinerary(String[][] tickets) {
        List<String> ans = new ArrayList<>();
        if (tickets == null || tickets.length == 0) {
            return ans;
        }
        Map<String, PriorityQueue<String>> ticketsMap = new HashMap<>();
        for (int i = 0; i < tickets.length; i++) {
            String key = tickets[i][0];
            String value = tickets[i][1];
            if (!ticketsMap.containsKey(key)) {
                ticketsMap.put(key, new PriorityQueue<>());
            }
            ticketsMap.get(key).add(value);
        }

        String curr = "JFK";
        Stack<String> drawBack = new Stack<>();
        for (int i = 0; i < tickets.length; i++) {
            while (!ticketsMap.containsKey(curr) || ticketsMap.get(curr).isEmpty()) {
                drawBack.push(curr);
                curr = ans.remove(ans.size() - 1);
            }
            ans.add(curr);
            curr = ticketsMap.get(curr).poll();
        }
        ans.add(curr);
        while (!drawBack.isEmpty()) {
            ans.add(drawBack.pop());
        }
        return ans;
    }

    public List<String> findItinerary_normal(String[][] tickets) {
        List<String> ans = new ArrayList();
        if (tickets == null || tickets.length == 0) {
            return ans;
        }

        Map<String, ArrayList<String>> graph = new HashMap();
        for (int i = 0; i < tickets.length; i++) {
            String key = tickets[i][0];
            String value = tickets[i][1];
            if (!graph.containsKey(key)) {
                graph.put(key, new ArrayList());
            }
            ArrayList<String> adj = graph.get(key);
            adj.add(value);
        }
        graph.values().forEach(Collections::sort);
        backTracing(ans, "JFK", graph);

        return ans;
    }

    public void backTracing(List<String> ans, String current, Map<String, ArrayList<String>> graph) {
        while (graph.containsKey(current) && !graph.get(current).isEmpty()) {
            String s = graph.get(current).remove(0);
            backTracing(ans, s, graph);
        }
        ans.add(0, current);
    }
}
