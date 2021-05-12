package com.data_structure.hash;

public class HashNode<K, V>{
    K key;
    V value;
    private final int hashCode;
    private HashNode<K, V> next;

    public HashNode(K key, V value, int hashCode){
        this.hashCode = hashCode;
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public int getHashCode() {
        return hashCode;
    }

    public HashNode<K, V> getNext() {
        return next;
    }

    public void setNext(HashNode<K, V> next) {
        this.next = next;
    }
}
