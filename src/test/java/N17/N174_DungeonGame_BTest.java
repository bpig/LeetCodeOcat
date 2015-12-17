package N17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-15
 */
public class N174_DungeonGame_BTest {
    N174_DungeonGame_B nb = new N174_DungeonGame_B();

    @Test
    public void testCalculateMinimumHP() throws Exception {
        int[][] dungeon;
        dungeon = new int[][]{
                {-3, 5}
        };
        assertEquals(4, nb.calculateMinimumHP(dungeon));

        dungeon = new int[][]{
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}
        };
        assertEquals(7, nb.calculateMinimumHP(dungeon));

        dungeon = new int[][]{
                {100}
        };
        assertEquals(1, nb.calculateMinimumHP(dungeon));

        dungeon = new int[][]{
                {1, -3, 3},
                {0, -2, 0},
                {-3, -3, -3}
        };
        assertEquals(3, nb.calculateMinimumHP(dungeon));
    }
}