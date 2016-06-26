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
  // public static void preorderTraversal(Tree root){
  //   if(root == null)
  //     return;
  //   preorderTraversal(root.left);
  //   System.out.print(root.data + ",");
  //   preorderTraversal(root.right);
  // }

  public static void inorderTraversal(Tree root){
    if(root == null)
      return;
    System.out.print(root.data + ",");
    inorderTraversal(root.left);
    inorderTraversal(root.right);
  }

  // public static void postorderTraversal(Tree root){
  //   if(root == null)
  //     return;
  //   postorderTraversal(root.left);
  //   postorderTraversal(root.right);
  //   System.out.print(root.data + ",");
  // }

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
    System.out.println("Preorder Traversal");
    preorderTraversal(root);
    System.out.println();
    System.out.println("Inorder Traversal");
    inorderTraversal(root);
    System.out.println();
    System.out.println("Postorder Traversal");
    postorderTraversal(root);
  }
}
