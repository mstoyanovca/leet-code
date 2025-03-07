package leetcode75.binary_tree_dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeTest {
    private final MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();

    @Test
    void example1() {
        TreeNode tree = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertEquals(3, maximumDepthOfBinaryTree.maxDepth(tree));
    }

    @Test
    void example2() {
        TreeNode tree = new TreeNode(1, null, new TreeNode(2));

        assertEquals(2, maximumDepthOfBinaryTree.maxDepth(tree));
    }
}
