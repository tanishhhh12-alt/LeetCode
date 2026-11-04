
class Solution {

    int po;
    HashMap<Integer,Integer> mp = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        po = postorder.length-1;

        for(int i =0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }

        return solve(inorder,postorder,0,inorder.length-1);
    }

    private TreeNode solve(int[] inorder,int[] postorder,int left,int right){
        if(left>right){
            return null;
        }
        int rv = postorder[po--];
        TreeNode root = new TreeNode(rv);

        int i = mp.get(rv);

        root.right = solve(inorder,postorder,i +1,right);

        root.left = solve(inorder,postorder,left,i-1);

        return root;
    }
}