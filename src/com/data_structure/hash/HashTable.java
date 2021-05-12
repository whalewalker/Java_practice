package com.data_structure.hash;

public interface HashTable<K, V>{
    boolean isEmpty();
    int size();
    V remove(K key);
    V get(K key);
    void add(K key, V value);

}
