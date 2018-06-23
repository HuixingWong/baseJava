package athletic;
//手写tire字典数
public class MyTire {

    //只有26个字母
    private int SIZE = 26;
    private TireNode root;

    MyTire(){
        root = new TireNode();
    }

    private class TireNode
    {
        private int num;//有多少个单词通过这个节点
        private TireNode [] son;//所有的儿子节点
        private boolean isEnd;//是不是最后一个节点
        private char val;//节点的值

        TireNode(){

            num = 1;
            son = new TireNode[SIZE];
            isEnd = false;

        }

    }

    public void insert(String str){

        if (str == null || str.length() == 0){
            return;
        }

        TireNode node = root;
        char[] letters = str.toCharArray();
        for (int i=0,len = str.length();i<len;i++){

            int pos = letters[i] - 'a';
            if (node.son[pos] == null){
                node.son[pos] = new TireNode();
                node.son[pos].val = letters[i];
            }else {
                node.son[pos].num++;
            }
            node = node.son[pos];
        }

        node.isEnd = true;
    }

    public int countPrefix(String prefix){

        if (prefix == null || prefix.length() == 0){

            return  -1;

        }

        TireNode node = root;
        char[] letters = prefix.toCharArray();
        for (int i = 0,len = prefix.length();i<len;i++){

            int pos = letters[i] - 'a';
            if (node.son[pos] == null){
                return 0;
            }else {
                node = node.son[pos];
            }
        }

        return node.num;

    }

    public String hasPrefix(String prefix){

        if (prefix == null || prefix.length() == 0){

            return null;

        }
        TireNode node = root;
        char[] letters = prefix.toCharArray();
        for (int i=0,len = prefix.length();i<len;i++){
            int pos = letters[i] - 'a';
            if (node.son[pos] == null){
                return null;
            }else {
                node = node.son[pos];
            }

        }
        preTraverse(node,prefix);
        return null;

    }

    //便利经过这个节点的单词
    public void preTraverse(TireNode node,String prefix){

        if (!node.isEnd){
            for (TireNode child : node.son){
                if (child != null){
                    preTraverse(child,prefix+child.val);
                }
            }

            return;
        }

        System.out.println(prefix);

    }

    //在字典树中查找一个完全匹配的单词
    public boolean has(String str){

        if (str == null || str.length() == 0){
            return false;
        }
        TireNode node = root;
        char[] letters = str.toCharArray();
        for (int i=0,len = str.length();i<len;i++){
            int pos = letters[i] - 'a';
            if (node.son[pos] != null){
                node = node.son[pos];
            }else {
                return false;
            }
        }

        return node.isEnd;
    }

    //前序遍历字典树
    public void preTraverse(TireNode node){

        if (node != null){

            System.out.print(node.val +"-");
            for (TireNode child : node.son){
                preTraverse(child);
            }
        }

    }

    public TireNode getRoot() {
        return this.root;
    }


    public static void main(String[] args) {

        MyTire tree = new MyTire();
        String[] strs = {"banana", "band", "bee", "absolute", "acm",};
        String[] prefix = {"ba", "b", "band", "abc",};
        for (String str:
                strs) {
            tree.insert(str);
        }
        System.out.println(tree.has("abc"));
        tree.preTraverse(tree.getRoot());
        System.out.println();
//tree.printAllWords();
        for (String pre:prefix) {
            int num = tree.countPrefix(pre);
            System.out.println(pre + "：" + num);
        }

    }


}


