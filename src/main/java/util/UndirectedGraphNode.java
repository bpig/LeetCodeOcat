package util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shuai.li on 6/6/16.
 */
public class UndirectedGraphNode {
    public int label;
    public List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<>();
    }
};

