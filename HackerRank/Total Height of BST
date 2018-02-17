 public static class BST {
        private Node root;
        private HashMap<Node, Integer> savedHeights;
        
        public BST(Node startNode){
            root = startNode; 
            savedHeights = new HashMap<Node, Integer>();
        }
        
        public int traverse(Node root){
            if(root == null){
                return 0;
            }
            int height = 0; 
            if(savedHeights.containsKey(root)){
                height = savedHeights.get(root);
            } else{
                height = nodeHeight(root,0);
                savedHeights.put(root, height);
            }
            return height + traverse(root.left) + traverse(root.right);
        }
        
        public int nodeHeight(Node nodeRoot, int height){
            if(!nodeRoot.hasChild()){
                return height;    
            }
            if(nodeRoot.right == null){
                return nodeHeight(nodeRoot.left, height + 1);
            }
            if(nodeRoot.left == null){
                return nodeHeight(nodeRoot.right, height + 1);
            }
            return Math.max(nodeHeight(nodeRoot.right, height + 1), nodeHeight(nodeRoot.left, height + 1)); 
            
        }
        
        public void insert(Node toInsert, Node root){
            if(toInsert.val > root.val){
                if(root.right == null){
                    root.right = toInsert;
                } else {
                    insert(toInsert, root.right);  
                } 
            }
            if(toInsert.val < root.val){
                if(root.left == null){
                    root.left = toInsert;  
                } else {
                    insert(toInsert, root.left);
                }   
            }
        }
    }
    
    
    public static class Node {
        private Node right;
        private Node left;
        private int val; 
        
        public Node(int v){
            val = v;
        }
        
        public boolean hasChild(){
            return((right != null) || (left != null));
        }
        
        public void addBranch(Node node){
            if(node.val > val){
                right = node;
            } else if(node.val < val){
                left = node;
            }
        }
    }
