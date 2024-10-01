
public class BST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if(root==null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            // left subtree
            root.left = insert(root.left, val);
        }

        else{
            //right subtree
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root == null){
            return false;
        }
        else if(root.data > key){   //Left subtree
            return search(root.left, key);
        }
        else if(root.data == key){
            return true;
        }
        else{       // right subtree
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val){
        if(root.data > val){
            root.left = delete(root.left, val);
        }
        else if(root.data < val){
            root.right = delete(root.right, val);
        }
        else{ // root.data == val

            //case 1
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2
            if (root.left == null) {
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int values[] = {8,5,1,3,4,2,7,10,11,14,17};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();
        System.out.println(search(root, 2));
        delete(root, 3);
        inOrder(root);
        System.out.println();
    }
}
