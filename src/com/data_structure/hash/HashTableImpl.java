package com.data_structure.hash;

import jdk.jfr.Threshold;

import java.util.ArrayList;
import java.util.Objects;

public class HashTableImpl<K, V> implements HashTable<K, V> {

    private ArrayList<HashNode<K, V>> bucketArray;
    private final int numBuckets;
    private int size;

    public HashTableImpl() {
        bucketArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        for (int count = 0; count < numBuckets; count++) {
            bucketArray.add(null);
        }
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    private int generateBucketIndex(K key) {
        int hashCode = hashCode(key);
        int index = hashCode % numBuckets;
        index = index < 0 ? index * -1 : index;
        return index;
    }

    @Override
    public int size() {
        return size;
    }

    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    @Override
    public V remove(K key) {
        int bucketIndex = generateBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        HashNode<K, V> prev = null;
        while (head != null){
            if(head.getKey().equals(key) && hashCode == head.getHashCode())
                break;
            prev = head;
            head = head.getNext();
        }

        if(head == null)
            return null;
        size--;

        if(prev != null)
            prev.getNext();
        else
            bucketArray.set(bucketIndex, head.getNext());
        return head.value;
    }

    @Override
    public V get(K key) {
        int bucketIndex = generateBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head != null){
            if(head.getKey().equals(key) && head.getHashCode() == hashCode)
                return head.value;
            head = head.getNext();
        }
        return null;
    }

    @Override
    public void add(K key, V value) {
        int bucketIndex = generateBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);
        if (searchChain(key, value, hashCode, head)) return;

        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.setNext(head);
        bucketArray.set(bucketIndex, newNode);

        double THRESHOLD = 0.7;
        if((1.0  * size) / numBuckets >= THRESHOLD){
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            size = 0;

            for (int count = 0; count < numBuckets; count++){
                bucketArray.add(null);
            }

            for(HashNode<K, V> headNode : temp){
                while (headNode != null){
                    add(head.getKey(), head.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }

    private boolean searchChain(K key, V value, int hashCode, HashNode<K, V> head) {
        while (head != null){
            if(head.getKey().equals(key) && head.getHashCode() == hashCode) {
                head.value = value;
                return true;
            }
            head = head.getNext();
        }
        return false;
    }

    public static void main(String[] args) {
        HashTable<String, Integer> map =  new HashTableImpl<>();
        map.add("this", 1);
        map.add("coder", 2);
        map.add("this", 4);
        map.add("hi", 5);

        System.out.println(map.size());
        System.out.println(map.remove("this"));
        System.out.println(map.size());
        System.out.println(map.remove("this"));
        System.out.println(map.size());
        System.out.println(map.get("hi"));

    }
}
