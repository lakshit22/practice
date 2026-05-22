package practise.DSA.Tree.BT;

import java.util.*;

public class BinaryTree {
    public TreeNode insert(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if(root == null) {
            return newNode;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if(curr.left == null) {
                curr.left = newNode;
                return root;
            } else {
                queue.offer(curr.left);
            }
            if(curr.right == null) {
                curr.right = newNode;
                return root;
            }else {
                queue.offer(curr.right);
            }
        }
        return root;
    }

    public List<Integer> preOrder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            ans.add(node.val);

            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
        return ans;
    }

    public List<Integer> inOrder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            ans.add(curr.val);

            curr = curr.right;
        }
        return ans;
    }

    public List<Integer> postOrder(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()) {
            TreeNode node = s1.pop();
            s2.push(node);

            if (node.left != null) s1.push(node.left);
            if (node.right != null) s1.push(node.right);
        }
        while (!s2.isEmpty()) {
            ans.add(s2.pop().val);
        }
        return ans;
    }

    public TreeNode delete(TreeNode node, int key) {
        if(node == null) {
            return null;
        }

        if(node.left == null && node.right == null) {
            return node.val == key ? null : node;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(node);

        TreeNode target = null;
        TreeNode curr = null;
        TreeNode last = null;

        while(!q.isEmpty()) {
            curr = q.poll();
            if(curr.val == key) target = curr;

            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);

            last = curr;
        }

        if(target != null) {
            int x = last.val;
            deleteDeepest(node,last);
            target.val = x;
        }
        return node;
    }

    private void deleteDeepest(TreeNode root, TreeNode del) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr.left != null) {
                if (curr.left == del) {
                    curr.left = null;
                    return;
                }
                q.offer(curr.left);
            }

            if (curr.right != null) {
                if (curr.right == del) {
                    curr.right = null;
                    return;
                }
                q.offer(curr.right);
            }
        }
    }


}
