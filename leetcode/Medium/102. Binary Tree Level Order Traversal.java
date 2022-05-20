class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        
        if(root==null) return answer;
        
        q.offer(root);
        while(!q.isEmpty()){
            int num = q.size();
            List<Integer> list = new ArrayList<Integer>();
            
            for(int i=0; i<num; i++){
                if(q.peek().left!=null)     
                    q.offer(q.peek().left);
                if(q.peek().right!=null)
                    q.offer(q.peek().right);
                list.add(q.poll().val);
            }
            answer.add(list);
        }
        return answer;
    }
}