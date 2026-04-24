
import java.util.*;

class ExpNode {
    String val;
    ExpNode left,right;
    ExpNode(String v){val=v;}
}

public class ExpressionTree {

    static int eval(ExpNode root){
        if(root.left==null && root.right==null)
            return Integer.parseInt(root.val);

        int l = eval(root.left);
        int r = eval(root.right);

        switch(root.val){
            case "+": return l+r;
            case "-": return l-r;
            case "*": return l*r;
            case "/": return l/r;
        }
        return 0;
    }

    public static void main(String[] args){
        ExpNode root = new ExpNode("*");
        root.left = new ExpNode("+");
        root.right = new ExpNode("-");
        root.left.left = new ExpNode("3");
        root.left.right = new ExpNode("5");
        root.right.left = new ExpNode("8");
        root.right.right = new ExpNode("2");

        System.out.println(eval(root)); // 48
    }
}
