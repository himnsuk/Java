import java.util.*;

class Tree{
  int data;
  Tree left, right;

  Tree(int d){
    data = d;
    left = null;
    right = null;
  }
}


class IterativeTraversal{
  public static void preorderTraversal(Tree root){
    Tree current = root;
    Stack<Tree> st = new Stack<Tree>();
    while(true){
      while(current != null){
        System.out.print(current.data + ",");
        st.push(current);
        current = current.left;
      }

      if(st.isEmpty()){
        break;
      }

      current = st.pop();
      current = current.right;
    }
  }

  public static void inorderTraversal(Tree root){
    Tree current = root;
    Stack<Tree> st = new Stack<Tree>();
    while(true){
      while(current != null){
        st.push(current);
        current = current.left;
      }

      if(st.isEmpty()){
        break;
      }

      current = st.pop();
      System.out.print(current.data + ",");
      current = current.right;
    }
  }

  public static void postorderTraversalWith2Stack(Tree root){
    Tree current = root;
    Stack<Tree> st1 = new Stack<Tree>();
    Stack<Tree> st2 = new Stack<Tree>();
    st1.push(current);
    while(!st1.isEmpty()){
      current = st1.pop();
      st2.push(current);
      if(current.left != null)
        st1.push(current.left);
      if(current.right != null)
        st1.push(current.right);
    }

    while(!st2.isEmpty())
      System.out.print(st2.pop().data + ",");
  }

  public static void postorderTraversalWith1Stack(Tree root){
    Tree current = root;
    Stack<Tree> st = new Stack<Tree>();
    while(true){
      while(current != null){
        if(current.right != null)
          st.push(current.right);
        st.push(current);
        current = current.left;
      }
      if(st.isEmpty())
        break;
      current = st.pop();
      if(current.right != null){
        st.pop();
        st.push(current);
        current = current.right;
      }

      if(current.right == null){
        System.out.print(current.data + ",");
        current = null;
      }
    }
  }
  public static void main(String[] args){
    Tree root = new Tree(1);
    Tree first = new Tree(3);
    Tree second = new Tree(2);
    Tree third = new Tree(4);
    Tree fourth = new Tree(5);
    root.left = first;
    root.right = second;
    root.left.left = third;
    root.right.right = fourth;
    // System.out.println("Preorder Traversal");
    // preorderTraversal(root);
    // System.out.println();
    // System.out.println("Inorder Traversal");
    // inorderTraversal(root);
    // System.out.println();
    System.out.println("Postorder Traversal");
    postorderTraversalWith1Stack(root);
  }
}
