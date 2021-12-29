import java.util.*;
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public LinkedList<TreeNode> generatetrees(int start,int end){
        LinkedList<TreeNode> all_trees=new LinkedList<TreeNode>();
        if(start>end){
            all_trees.add(null);
            return all_trees;
        }
        for(int i=start;i<=end;i++){
            LinkedList<TreeNode> left_tree=generatetrees(start,i-1);
            LinkedList<TreeNode> rigth_tree=generatetrees(i+1, end);
            for(TreeNode left:left_tree ){
                for(TreeNode right:rigth_tree){
                    TreeNode current_tree=new TreeNode(i);
                    current_tree.left=left;
                    current_tree.right=right;
                    all_trees.add(current_tree);
                }
            }
        }
        return all_trees;
    }

    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new LinkedList<TreeNode>();
        }
        return generatetrees(1,n);
    }
}