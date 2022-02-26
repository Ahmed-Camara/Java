import java.util.ArrayList;
import java.util.Iterator;

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


            }

            if(e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right = createNewNode(e);
        }
        size++;
        return true;
    }
    @Override
    public void inorder(){
        inorder(root);
    }
    protected void inorder(TreeNode<E> root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.element+" ");
        inorder(root.right);
    }
    @Override
    public void postorder(){
        postorder(root);
    }
    protected void postorder(TreeNode<E> root){
        if(root == null) return;
        System.out.print(root.element+" ");
        postorder(root.left);
        postorder(root.right);
    }

    @Override
    public void preorder(){
        preorder(root);
    }

    protected void preorder(TreeNode<E> root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element+" ");
    }
    protected TreeNode<E> createNewNode(E e){
        return new TreeNode<>(e);
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

        while (current != null){
            list.add(current);
            if(e.compareTo(current.element) < 0)
                current = current.left;
            else if(e.compareTo(current.element) > 0)
                current = current.right;
            else
                break;
        }

        return list;
    }

    @Override
    public boolean delete(E e){
        if(search(e) == false){
            return false;
        }

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
                break;
            }

            if(current == null)
                return false;

            if(current.left == null){
                if(parent == null){
                    root = current.right;
                }else{
                    if(e.compareTo(parent.element) < 0){
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else{

                TreeNode<E> parentOfRighmost = current;
                TreeNode<E> rightMost = current.left;

                while (rightMost.right != null){
                    parentOfRighmost = rightMost;
                    rightMost = rightMost.right;
                }

                current.element = rightMost.element;

                if(parentOfRighmost.right == rightMost)
                    parentOfRighmost.right = rightMost.right;
                else
                    parentOfRighmost.left = rightMost.left;
            }
        }
        size--;
        return true;
    }

    @Override
    public Iterator<E> iterator(){
        return null;
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
