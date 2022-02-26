public class App {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(60);
        tree.insert(55);
        tree.insert(101);
        tree.insert(45);
        tree.insert(57);
        tree.insert(67);
        tree.insert(107);
        tree.insert(59);
        tree.insert(101);
        tree.insert(108);
        tree.insert(188);
        tree.inorder();
       // System.out.println(tree.search(1001));
    }
}
