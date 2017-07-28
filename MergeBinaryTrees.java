import java.util.Hashtable;

public class MergeBinaryTrees {

    /**
     * Definition for a binary tree node.
     **/
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {


        long startTime = System.nanoTime();
        TreeNode result = mergeTrees(new TreeNode(2), new TreeNode(4));

        System.out.println("Ci ho messo: " + (System.nanoTime() - startTime));
        System.out.print("l'albero mergiato è " + result.val + " left1: " + result.left + " right1: " + result.right);
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return resolve(t1, t2);
    }

    private static TreeNode resolve(TreeNode tmpT1, TreeNode tmpT2) {
        if (tmpT1 != null || tmpT2 != null) {

            tmpT1 = tmpT1 == null ? new TreeNode(0) : tmpT1;
            tmpT2 = tmpT2 == null ? new TreeNode(0) : tmpT2;

            TreeNode result = new TreeNode(tmpT1.val + tmpT2.val);
            result.left = resolve(tmpT1.left, tmpT2.left);
            result.right = resolve(tmpT1.right, tmpT2.right);

            return result;
        } else {
            return null;
        }
    }
}