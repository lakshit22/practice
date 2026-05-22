package practise.DSA.Tree.BT;

import java.util.List;

public class TreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
//        TreeMainRecursive tree = new TreeMainRecursive();
        TreeNode root = null;
        root = tree.insert(root, 5);
        root = tree.insert(root, 3);
        root = tree.insert(root, 6);
        root = tree.insert(root, 2);
        root = tree.insert(root, 4);
        root = tree.insert(root, 7);

//        System.out.println(tree.maxDepth(root));
        System.out.println(tree.delete(root, 2).val);
        tree.preOrder(root)
                .forEach(System.out::print)
                ;
//        tree.inOrder(root)
//                .forEach(System.out::print)
//                ;
//        tree.postOrder(root)
//                .forEach(System.out::print)
//                ;
    }
}
