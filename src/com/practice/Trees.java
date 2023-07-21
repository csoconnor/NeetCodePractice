package com.practice;

public class Trees {

    // Invert Binary Tree
//    public TreeNode invertTree(TreeNode root) {
//        if(root == null){
//            return null;
//        }
//
//        TreeNode left = invertTree(root.left);
//        TreeNode right = invertTree(root.right);
//
//        root.left = right;
//        root.right = left;
//
//        return root;
//    }

    // Maximum Depth of Binary Tree
//    public int maxDepth(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
//
//    }

    // Diameter of Binary Tree
//    int result = -1;
//
//    public int diameterOfBinaryTree(TreeNode root) {
//        dfs(root);
//        return result;
//    }
//
//    private int dfs(TreeNode current){
//        if(current == null){
//            return -1;
//        }
//        int left = 1 + dfs(current.left);
//        int right = 1 + dfs(current.right);
//        result = Math.max(result, (left + right));
//        return Math.max(left, right);
//    }


    // same tree
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        return dfs(p, q);
//    }
//
//    public boolean dfs(TreeNode p, TreeNode q){
//        if(p == null && q == null){
//            return true;
//        }
//
//        if(p == null || q == null){
//            return false;
//        }
//
//        if(p.val != q.val){
//            return false;
//        }
//
//        boolean left = dfs(p.left, q.left);
//        boolean right = dfs(p.right, q.right);
//
//        return left && right;
//    }

//    private List<Integer> ans = new ArrayList();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        traverse(root);
//        return ans;
//    }
//
//    private void traverse(TreeNode node){
//        if(node == null){
//            return;
//        }
//
//        traverse(node.left);
//        ans.add(node.val);
//        traverse(node.right);
//    }

    // is balanced
//    public boolean isBalanced(TreeNode root) {
//        if(root == null){
//            return true;
//        }
//        if(Height(root) == -1){
//            return false;
//        }
//        return true;
//
//    }
//
//    public int Height(TreeNode root){
//        if(root == null){
//            return 0;
//        }
//
//        int leftHeight = Height(root.left);
//        int rightHeight = Height(root.right);
//
//        if(leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1){
//            return -1;
//        }
//
//        return Math.max(leftHeight, rightHeight) + 1;
//    }

//    public int minDepth(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//        int left = minDepth(root.left);
//        int right = minDepth(root.right);
//
//        if(left == 0 && right !=0){
//            return right + 1;
//        } else if(left != 0 && right == 0){
//            return left + 1;
//        } else {
//            return Math.min(left, right) + 1;
//        }
//    }
}
