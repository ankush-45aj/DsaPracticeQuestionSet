
//     static int size = 0;
//     static int sum = 0;
//     public static class Node {
//         int val;
//         Node right;
//         Node left;
//         public Node(int val) {
//             this.val = val;
//         }
//     }
//     public static void display(Node root) {
//         if (root == null)
//             return;
//         System.out.print(root.val + " -> ");
//         size++;
//         if (root.left != null)
//             System.out.print(root.left.val + " ");
//         if (root.right != null) {
//             System.out.print(root.right.val);
//         }
//         System.out.println();
//         display(root.left);
//         display(root.right);
//     }
//     public static int size(Node root) {
//         if (root == null)
//             return 0;
//         return 1 + size(root.left) + size(root.right);
//     }
//     public static int sum(Node root) {
//         if (root == null)
//             return 0;
//         return root.val + sum(root.left) + sum(root.right);
//     }
//     public static void main(String[] args) {
//         Node root = new Node(2);
//         Node a = new Node(4);
//         Node b = new Node(10);
//         root.left = a;
//         root.right = b;
//         Node c = new Node(6);
//         Node d = new Node(5);
//         a.left = c;
//         a.right = d;
//         display(root);
//         System.out.println(size);
//         System.out.println(size(root));
//         System.out.println(sum(root));
//     }
// }
// public class tree {
//     public static class Node {
//         int val;
//         Node left;
//         Node right;
//         Node(int val) {
//             this.val = val;
//         }
//     }
//     static int count = 0;
//     public static void preorder(Node root) {
//         if (root == null)
//             return;
//         System.out.print(root.val + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }
//     public static void postorder(Node root) {
//         if (root == null) {
//             return;
//         }
//         postorder(root.left);
//         postorder(root.right);
//         System.out.print(root.val + " ");
//     }
//     public static void display(Node root) {
//         if (root == null)
//             return;
//         count++;
//         System.out.print(root.val + " ->");
//         if (root.left != null)
//             System.out.print(root.left.val + " ->");
//         if (root.right != null)
//             System.out.print(root.right.val + " ->");
//         System.out.println();
//         display(root.left);
//         display(root.right);
//     }
//     public static void main(String[] args) {
//         Node root = new Node(5);
//         Node a = new Node(3);
//         Node b = new Node(6);
//         root.left = a;
//         root.right = b;
//         Node c = new Node(1);
//         Node d = new Node(2);
//         a.left = c;
//         a.right = d;
//         Node e = new Node(4);
//         Node f = new Node(7);
//         b.left = e;
//         b.right = f;
//         Node g = new Node(10);
//         Node h = new Node(6);
//         f.right = g;
//         f.left = h;
//         // display(root);
//         System.out.println(count);
//         preorder(root);
//         System.out.println();
//         postorder(root);
//     }
// }
public class tree {

    public static class Node {

        int val;
        Node left = null;
        Node right = null;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node root) {
        if (root == null) {
            return;

        } else {
            System.out.print(root.val + "-->");
            if (root.left != null) {
                System.out.print(root.left.val + ",");
            }
            if (root.right != null) {
                System.out.println(root.right.val);
            }
            display(root.left);
            display(root.right);
            System.out.println();
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);

    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);

        postorder(root.right);
        System.out.println(root.val);

    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);

    }

    static int sum = 0;

    public static int sumOfRoot(Node root) {
        if (root == null) {
            return 0;
        }

        sum += root.val;
        sumOfRoot(root.left);
        sumOfRoot(root.right);
        // return 1 + sumOfRoot(root.left) + sumOfRoot(root.right);
        return sum;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        Node g = new Node(8);
        Node h = new Node(10);
        f.right = g;
        f.left = h;
        // display(root);
        preorder(root);
        System.out.println(" ");
        // postorder(root);
        // inorder(root);
        System.out.println(size(root));
        System.out.println(sumOfRoot(root));

    }
}
