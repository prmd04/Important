package HashMap.Implement;


/**
 *
 * @author JMS
 */
import java.util.*;
public class HashMapCode {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;


            Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n; // total numbers of nodes in all buckets
        private int N; // total numbers of bucket
        private LinkedList<Node> buckets[];

        public HashMap(){
            this.N=4;
            this.buckets= new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        public int bucketIndex(K key){
            int bi=key.hashCode();
            /* when we put key in hashcode it give random value like negative
            and value which is greater than the N.. so in case we have to do
            two operation..
            1.take abs value this way we ignore the minus one
            2.if we take modulo with N then the output is in the range 0-N-1
            */
            return Math.abs(bi)%N;
        }

        public int dataIndex(K key,int bi){
            LinkedList<Node>ll=buckets[bi];//making linklist from previous one

            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }
        public void reHash(){
            LinkedList<Node> oldbuckets[]=buckets;// copy all the old data in old buckets

            LinkedList<Node>buckets[]=new LinkedList[N*2];// create new buckets which size is double than previous
            // we have to initialiize every buckets is linkelist<>;
            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            }

            // now we have to copy all the data in new buckets
            // first we create loop for buckets
            for(int i=0;i<N*2;i++){
                LinkedList<Node>ll=oldbuckets[i];// we create the linked list ll for linked list prasent in oldbuckets[i]
                for(int j=0;j<ll.size();j++){
                    Node node =ll.get(j);
                    put(node.key,node.value);
                }
            }

        }
        public void put(K key,V value){
            int bi=bucketIndex(key);
            int di=dataIndex(key,bi);

            // now we have two cases either value is already prasent or not
            // if the value is not praset
            if(di<0){
                buckets[bi].add(new Node(key,value));// we add new one
                n++;
            }
            else{
                Node node=buckets[bi].get(di);
                node.value=value; // we upadate previous one
            }

            double lamda=N/n;
            if(lamda>16){
                reHash();
            }
        }
        public boolean containsKey(K key){
            int bi=bucketIndex(key);

            LinkedList<Node> ll=buckets[bi];

            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return true;
                }
            }
            return false;
        }

        public List<String> keySet(){
            List<String>list=new ArrayList<>();

            for(int i=0;i<N;i++){
                LinkedList<Node>ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    list.add((String)ll.get(j).key);
                }
            }
            return list;
        }

        public V remove(K key){
            int bi=bucketIndex(key);
            int di=dataIndex(key,bi);

            if(di<0){
                return null;
            }
            else{
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;

            }
        }
        public V get(K key){
            int bi=bucketIndex(key);
            int di=dataIndex(key,bi);

            if(di<0){
                return null;
            }
            else{
                Node node=buckets[bi].get(di);
                return node.value;
            }
        }
        public int size(){
            return n;
        }
        public boolean isEmpty(){
            if(n==0) return true;
            return false;
        }

    }
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 120);
        map.put("China", 150);
        map.put("USA", 50);
        map.put("Shrilanka", 30);
        map.put("Nepal",20);

        System.out.println(map.get("USA"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.remove("Shrilanka"));
        System.out.println(map.keySet());


    }
}
