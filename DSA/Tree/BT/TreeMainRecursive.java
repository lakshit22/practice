package practise.DSA.Tree.BT;

import java.util.List;

public class TreeMainRecursive {
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
    public void preOrder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(TreeNode root){
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public void postOrder(TreeNode root){
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }

    public int maxDepth(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int leftSize = maxDepth(node.left);
        int rightSize = maxDepth(node.right);

        return Math.max(leftSize, rightSize) + 1;
    }

    public void getLeafNodes(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }

        if(root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }
        getLeafNodes(root.left, list);
        getLeafNodes(root.right, list);
    }
}
