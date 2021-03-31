//二叉树递归实现前中后序的遍历
公共 类 TreeTraversal {
    // preorder traversal前序
    public static void preorder(TreeNode root) {
        if (root == null) {
            // 根结点不存在 -> 是一棵空树
            // 对于空树的前序遍历，什么都不做
            return;
        }

        System.out.printf("%c ", root.val);
        preorder(root.left);    // root.left 承载左子树的含义
        preorder(root.right);
    }

    // inorder traversal中序
    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.printf("%c ", root.val);
        inorder(root.right);
    }

    // postorder traversal后序
    public static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.printf("%c ", root.val);
    }
    public static void main(String[] args) {
        TreeNode root = BuildTree.buildTree1();
        System.out.print("前序: ");
        preorder(root);
        System.out.println();
        System.out.print("中序: ");
        inorder(root);
        System.out.println();

        System.out.print("后序: ");
        postorder(root);
        System.out.println();
    }
}
