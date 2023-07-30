import java.rmi.server.Skeleton;
import java.rmi.server.SkeletonMismatchException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Binarttreesb {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static class BinaryTree{
         static int idx=-1;
         public static Node buildTree(int nodes[]){
             idx++;
             if (nodes[idx]==-1){
                 return null;
             }
             Node newNode=new Node(nodes[idx]);
             newNode.left=buildTree(nodes);
             newNode.right=buildTree(nodes);
             return newNode;
         }
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);
        System.out.print(root.data+" ");
        preorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelorder(Node root){
        if (root == null){
            return;
        }

        Queue<Node> q=new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode=q.remove();
            if (currNode==null){
                System.out.println();
                if (!q.isEmpty()){
                    q.add(null);
                }else {
                    break;
                }
            }
            else {
                System.out.print(currNode.data+" ");
                if (currNode.left!=null){
                    q.add(currNode.left);
                }
                if (currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int sumch(Node root){
        if (root == null){
            return 0;
        }
        int lcsum=sumch(root.left);
        int rcsum=sumch(root.right);
        return lcsum+rcsum+root.data;
    }

    public static int height(Node root){
        if (root == null){
            return 0;
        }
        int lefthg=height(root.left);
        int righthg=height(root.right);
        return Math.max(lefthg,righthg)+1;
    }

    public static int diameteer(Node root){
        if (root == null){
            return 0;
        }

        int leftdia=diameteer(root.left);
        int rightdia=diameteer(root.right);
        int lefthe=height(root.left);
        int righthe=height(root.right);
        int selfdia=lefthe+righthe+1;
        return Math.max(selfdia,Math.max(leftdia,rightdia));
    }

    static class Info{
        Node node;
        int hgt;
        public Info(Node node,int hgt){
            this.node=node;
            this.hgt=hgt;
        }
    }

    public static void topv(Node root){

        Queue<Info> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0, max=0;
        q.add(new Info(root,0));
        q.add(null);

        while (!q.isEmpty()){
            Info curr=q.remove();
            if (curr==null){
                if (q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else {
                if (!map.containsKey(curr.hgt)){
                    map.put(curr.hgt,curr.node);
                }
                if (curr.node.left!=null){
                    q.add(new Info(curr.node.left,curr.hgt-1));
                    min=Math.min(min, curr.hgt-1);
                }
                if (curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hgt+1));
                    max=Math.max(max, curr.hgt+1);
                }
            }
        }

        for (int i = min; i <=max ; i++) {
            System.out.print(map.get(i).data+" ");
        }



    }


    public static void klevel(Node root,int level,int k){
        if (root==null){
            return;
        }
        if (level==k){
            System.out.print(root.data+" ");
            return;
        }
        klevel(root.left,level+1,k);
        klevel(root.right,level+1,k);
    }

    public static Node lca(Node root,int n1,int n2){
        if (root==null||root.data==n1||root.data==n2){
            return root;
        }
        Node leftlca=lca(root.left,n1,n2);
        Node rightlca=lca(root.right,n1,n2);

        if (leftlca==null){
            return rightlca;
        }
        if (rightlca==null){
            return leftlca;
        }

            return root;

    }
    public static int dislca(Node root,int n){
        if (root == null){
            return -1;
        }
        if (root.data==n){
            return 0;
        }

        int leftdis=dislca(root.left,n);
        int rightdis=dislca(root.right,n);

        if (leftdis==-1&&rightdis==-1){
            return -1;
        }
        else if (leftdis==-1){
            return rightdis+1;
        }
        else {
            return leftdis+1;
        }
    }

    public static int mind(Node root,int n1,int n2){
        Node lca=lca(root,n1,n2);

        int n1dis=dislca(lca,n1);
        int n2dis=dislca(lca,n2);

        return n1dis+n2dis;
    }
    public static void main(String[] args) {
//        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        BinaryTree tree=new BinaryTree();
//        Node root=tree.buildTree(nodes);
////        System.out.println(sumch(root));
////        System.out.println(height(root));
////        System.out.println(diameteer(root));
//        topv(root);

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
//        topv(root);
//        klevel(root,1,2);
        System.out.println(mind(root,4,5));
    }
}
