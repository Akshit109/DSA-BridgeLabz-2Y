
class BSTOperations {

    static class Node {
        int val;
        Node left,right;
        Node(int v){val=v;}
    }

    static Node insert(Node root,int val){
        if(root==null) return new Node(val);
        if(val<root.val) root.left=insert(root.left,val);
        else root.right=insert(root.right,val);
        return root;
    }

    static boolean search(Node root,int key){
        if(root==null) return false;
        if(root.val==key) return true;
        return key<root.val ? search(root.left,key) : search(root.right,key);
    }

    static Node delete(Node root,int key){
        if(root==null) return null;

        if(key<root.val) root.left=delete(root.left,key);
        else if(key>root.val) root.right=delete(root.right,key);
        else{
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;

            Node succ = min(root.right);
            root.val = succ.val;
            root.right = delete(root.right,succ.val);
        }
        return root;
    }

    static Node min(Node root){
        while(root.left!=null) root=root.left;
        return root;
    }

    static void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String[] args){
        int arr[] = {50,30,70,20,40,60,80};
        Node root=null;

        for(int x:arr) root=insert(root,x);

        inorder(root); System.out.println();
        System.out.println(search(root,40));

        root=delete(root,30);
        inorder(root);
    }
}
