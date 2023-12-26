import java.util.ArrayList;
import java.util.Iterator;

public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size;

    public BST(){}
    public BST(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }
    @Override
    public boolean search(E e) {

        TreeNode<E> current = root;

        while(current != null){

            if(e.compareTo(current.element) > 0){
                current = current.right;
            }else if(e.compareTo(current.element) < 0){
                current = current.left;
            }else{
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean insert(E e) {
        if(root == null){
            root = createNewNode(e);
        }else{

            TreeNode<E> parent = null;
            TreeNode<E> current = root;

            while(current != null){

                if(e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }else if(e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                }else{
                    return false;
                }


            }

            if(e.compareTo(parent.element) < 0){
                parent.left = createNewNode(e);
            }else
                parent.right = createNewNode(e);
        }

        size++;
        return true;
    }



    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }

    @Override
    public void inorder(){
        inorder(root);
    }

    protected void inorder(TreeNode<E> root){
        if(root == null) return;

        inorder(root.left);
        System.out.println(root.element+" ");
        inorder(root.right);
    }

    @Override
    public void postorder(){
        postorder(root);
    }

    protected void postorder(TreeNode<E> root){
        if(root == null) return;

        System.out.println(root.element+" ");
        inorder(root.left);
        inorder(root.right);
    }


    @Override
    public void preorder(){
        preorder(root);
    }

    protected void preorder(TreeNode<E> root){
        if(root == null) return;
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.element+" ");
    }

    @Override
    public int getSize(){
        return size;
    }
    public TreeNode<E> getRoot(){
        return root;
    }

    public ArrayList<TreeNode<E>> path(E e){
        ArrayList<TreeNode<E>> list = new ArrayList<>();

        TreeNode<E> current = root;

        while(current != null){
            list.add(current);

            if(e.compareTo(current.element) < 0)
                current = current.left;
            else if(e.compareTo(current.element) > 0)
                current = current.right;
            else break;
        }

        return list;
    }

    @Override
    public boolean delete(E e) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (root == null);
    }
    @Override
    public Iterator<E> iterator() {
        //return new InorderIterator();
        return null;
    }

    /*private class InorderIterator implements Iterator<E>{
        private ArrayList<E> list = new ArrayList<>();
        private int current = 0;

        public InorderIterator(){}

        private void inorder(){
            inorder(root);
        }
    }*/
}
