
public class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;
    public BST(){}

    @Override
    public boolean search(E e){
        TreeNode<E> current = root;

        while (current != null){

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
    public boolean insert(E e){
        if(root == null){
            root = createNewNode(e);
        }else{
            TreeNode<E> parent = null;
            TreeNode<E> current = root;

            while (current != null){
                if(e.compareTo(current.element) > 0){
                    parent = current;
                    current = current.right;
                }else if(e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }else{
                    return false;
                }

                if(e.compareTo(parent.element) < 0)
                    parent.left = createNewNode(e);
                else
                    parent.right = createNewNode(e);
            }

            size++;
            return true;
        }
    }
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
    }

    public static class TreeNode <E extends Comparable<E>>{
        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;

        public TreeNode(E e){
            element = e;
        }
    }
}
