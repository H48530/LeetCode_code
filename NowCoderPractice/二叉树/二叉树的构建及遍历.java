//https://www.nowcoder.com/practice/4b91205483694f449f94c179883c1fef?
import java.util.*;

class TreeNode{
    public char val;
    public TreeNode left;
    public TreeNode right;
    
    public TreeNode(char val){
        this.val = val;
    }
}

public class Main{
    private static int i = 0;
    
    public static TreeNode creatTree(String str){
        TreeNode root = null;
        if(str.charAt(i) != '#'){
            root = new TreeNode(str.charAt(i));
            i++;
            root.left = creatTree(str);
            root.right = creatTree(str);
        }else{
            i++;
        }
        return root;
    }
    
    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        TreeNode root = creatTree(str);
        
       inorder(root);
    }
}