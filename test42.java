//�������ݹ�ʵ��ǰ�к���ı���
public class TreeTraversal {
    // preorder traversalǰ��
    public static void preorder(TreeNode root) {
        if (root == null) {
            // ����㲻���� -> ��һ�ÿ���
            // ���ڿ�����ǰ�������ʲô������
            return;
        }

        System.out.printf("%c ", root.val);
        preorder(root.left);    // root.left �����������ĺ���
        preorder(root.right);
    }

    // inorder traversal����
    public static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.printf("%c ", root.val);
        inorder(root.right);
    }

    // postorder traversal����
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
        System.out.print("ǰ��: ");
        preorder(root);
        System.out.println();
        System.out.print("����: ");
        inorder(root);
        System.out.println();

        System.out.print("����: ");
        postorder(root);
        System.out.println();
    }
}
