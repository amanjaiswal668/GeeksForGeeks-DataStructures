package com.amanjaiswal.gfgdsacourse.linkedlist;

import java.util.HashMap;

class LRUNode {
    int key;
    int value;
    LRUNode prev;
    LRUNode next;

    public LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class LRUCache {

    private HashMap<Integer, LRUNode> map;
    private int capacity;
    private int count;
    private LRUNode head, tail;

    // NOTE :- Linked List is to be used is a Doubly Linked List.

    // Create the LRUCache -> Least Recently Used Cache.

    public void LRUCacheCreation(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new LRUNode(0, 0);
        tail = new LRUNode(0, 0);
        head.next = tail;
        tail.prev = head;
        head.prev = null;
        tail.next = null;
        count = 0;
    }

    // Create the linkedList and insert the cache value in the linkedlist.

    public void InsertCache(LRUNode node) {
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        node.next = node;

    }

    // Create the hashMap and insert the value of the cache and the key(Reference of
    // the value from linked list) of it.

    // Search for the value in the hashMap using the key and return the value.

    public int search(int key) {
        if (map.get(key) != null) {
            LRUNode node = map.get(key);
            int result = node.value;
            deleteNode(node);
            addNodeToHead(node);
            return result;
        }
        return -1;
    }

    // If the value exists in the Hashmap, find the value in the linked list and
    // bring it to the front.

    public void addNodeToHead(LRUNode node) {

        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    // Delete the node if no space available in the linked list.

    public void deleteNode(LRUNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Insert to Node.

    public void set(int key, int value) {
        System.out.println("Going to set the (key, " +
                "value) : (" + key + ", " + value + ")");
        if (map.get(key) != null) {
            LRUNode node = map.get(key);
            node.value = value;
            deleteNode(node);
            addNodeToHead(node);
        } else {
            LRUNode node = new LRUNode(key, value);
            map.put(key, node);
            if (count < capacity) {
                count++;
                addNodeToHead(node);
            } else {
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
                addNodeToHead(node);
            }
        }
    }
    // Main

    public static void main(String[] args) {

        LRUCache cache = new LRUCache();
        cache.LRUCacheCreation(2);

        cache.set(1, 10);
        cache.set(2, 20);
        System.out.println("Value for the key: 1 is " + cache.search(1)); // returns 10

        cache.set(3, 30);
        System.out.println("Value for the key: 2 is " +
                cache.search(2));
        cache.set(4, 40);
        System.out.println("Value for the key: 1 is " +
                cache.search(1)); // returns -1 (not found)
        System.out.println("Value for the key: 3 is " +
                cache.search(3)); // returns 30
        System.out.println("Value for the key: 4 is " +
                cache.search(4)); // return 40
    }

}
