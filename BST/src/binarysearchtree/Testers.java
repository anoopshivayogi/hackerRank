package binarysearchtree;

public class Testers {
    public static void checkIsEmpty(Tree t) throws Exception{
        // if the tree t is an instance of EmptyBST --> t.isEmpty -- true
        // if the tree t is an instance of NonEmptyBST -- t.isEmpty -- false
       if(t instanceof EmptyBST) {
           if(!t.isEmpty()) {
               throw new Exception("All is not good, the tree is an emptyBST and it is non-empty");
           } }
       else if (t instanceof NonEmptyBST) {
               if(t.isEmpty()){
                   throw new Exception("All is not good, the tree is NonEmptyBST and it is empty");
               }
           }

    }
}
