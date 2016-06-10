package N13;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */

import util.UndirectedGraphNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
 * <p/>
 * <p/>
 * OJ's undirected graph serialization:
 * Nodes are labeled uniquely.
 * <p/>
 * We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.
 * As an example, consider the serialized graph {0,1,2#1,2#2,2}.
 * <p/>
 * The graph has a total of three nodes, and therefore contains three parts as separated by #.
 * <p/>
 * First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
 * Second node is labeled as 1. Connect node 1 to node 2.
 * Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.
 * Visually, the graph looks like the following:
 * <p/>
 * `    1
 * `   / \
 * `  /   \
 * ` 0 --- 2
 * `      / \
 * `      \_/
 */
public class N133_CloneGraph_B {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();
        return handler(node, map);
    }

    private UndirectedGraphNode handler(UndirectedGraphNode node, HashMap<Integer, UndirectedGraphNode> map) {
        UndirectedGraphNode res = new UndirectedGraphNode(node.label);
        map.put(node.label, res);
        for (UndirectedGraphNode n : node.neighbors) {
            UndirectedGraphNode nb = map.get(n.label);
            if (nb == null) {
                nb = handler(n, map);
            }
            res.neighbors.add(nb);
        }
        return res;
    }
}
