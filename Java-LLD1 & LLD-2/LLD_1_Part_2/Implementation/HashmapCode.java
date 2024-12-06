package LLD_1_Part_2.Implementation;


import java.util.ArrayList;
import java.util.LinkedList;


public class HashmapCode {

    public static void main(String[] args) {
        HashMap<Integer, Integer> hm=new HashMap();
        hm.put(1,2);
        hm.put(6,3);
        hm.put(0,2);
        hm.put(2,2);
        hm.put(3,3);
        hm.put(4,2);

        System.out.println(hm.get(0));
        System.out.println(hm.containsKey(0));
        hm.remove(0);
        System.out.println(hm.get(0));
        System.out.println(hm.containsKey(0));
        System.out.println(hm.keySet());
    }

    
    public static class HashMap<k,v>{

        // node of link list
        private class Node{
            k key;
            v value;
            public Node(k key, v val){
                this.key=key;
                this.value=val;
            }
        }
        private int n; // node
        private int N; // total buckets
        private LinkedList<Node> [] buckets; // array of bucket/ linked list

        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<N;i++){
                this.buckets[i]=new LinkedList<>();
            }


        }

        private int hashFunction(k key){
            int bi=key.hashCode(); // hash bucket index
            // bucket index can be -ve also so make it positive
            return Math.abs(bi)%N; // to keep in 0 to N-1 range
        }

        private int searchInLinklist(k key, int bi){
            LinkedList<Node> head=buckets[bi];
            for(int i=0;i<head.size();i++){
                Node node=head.get(i);
                if(node.key==key) return i; // i will be di (data index)
            }
            // if di not found return -1
            return -1;
        }

        private void reHash(){
            // before modifying bucket we have to save our old bucket data
            LinkedList<Node>[] oldBucket=buckets;
            buckets=new LinkedList[2*N];
            // initialize empty ll for every bucket
            for(int i=0;i<2*N;i++){
                oldBucket[i]=new LinkedList<>();
            }
            for(int i=0;i< oldBucket.length;i++){
                LinkedList<Node> ll= oldBucket[i];
                // run loop on ll
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(k key, v value){
            int bi=hashFunction(key); // bucket index
            int di=searchInLinklist(key, bi); // data index | 0+ means exist
            if(di==-1){
                // key not exist
                buckets[bi].add(new Node(key, value));
            }
            // exist already just update data
            else{
                Node data=buckets[bi].get(di); // old node
                data.value=value; // update data in old node
            }

            double lambda= n*1d/N;
            // if size become larger than our LLD_1_Part_2.lambda then do rehash
            if(lambda>2.0){
                reHash();
            }
        }


        public v get(k key){
            int bi= hashFunction(key);
            LinkedList<Node> bucket=buckets[bi];
            if(bucket!=null){
                for(int i=0;i<bucket.size();i++){
                    if(bucket.get(i).key==key) return bucket.get(i).value;
                }
            }
            return null;
        }

        public boolean containsKey(k key){
            int bi= hashFunction(key);
            LinkedList<Node> bucket=buckets[bi];
            if(bucket!=null){
                for(int i=0;i<bucket.size();i++){
                    if(bucket.get(i).key==key) return true;
                }
            }
            return false;
        }

        public void remove(k key){
            int bi= hashFunction(key);
            LinkedList<Node> bucket=buckets[bi];
            if(bucket!=null){
                for(int i=0;i<bucket.size();i++){
                    if(bucket.get(i).key==key) bucket.remove(i);
                }
            }
        }

        public ArrayList<k> keySet(){
            ArrayList<k> keys=new ArrayList<>();
            for(int i=0;i<N;i++){
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    keys.add(ll.get(j).key);
                }
            }
            return keys;
        }

        public int size(){
            return this.N;
        }
    }
}