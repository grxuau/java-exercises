import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyMap<K, V> extends AbstractMap<K, V> implements Map<K, V> {
	private int size;
	
	/*
	 * In HashMap we use HashTables, but not in this implementation, 
	 * so it's called 'nodes', instead of 'tables'
	 */
	
	private ArrayList<MyMap.Node<K, V>> nodes;
	
	public MyMap (K keyType, V valueType) {
		size = 0;
	}
	
	public MyMap() {
		
	}
	
	static class Node<K, V> implements Map.Entry<K, V> {
		final K key;
		V value;
		Node <K, V> next;
		
		Node (K key, V value) {
			this.key = key;
			this.value = value;
		}
		
		public final K getKey() {
			return key;
		}

		public final V getValue() {
			return value;
		}

		public final V setValue(V value) {
			V oldValue = this.value;
			this.value = value;
			return oldValue;
		}
		
		public final void setNext(Node<K, V> nextNode) {
			this.next = nextNode;
		}
		
		public final String toString() {
			return key + ": " + value;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	public V get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public V put(K key, V value) {
		if (nodes ==  null) {
			nodes = new ArrayList<Node <K, V>>();
		} 
		if (size == 0) {
				nodes.add(new Node<K, V>(key, value));
				size = nodes.size();
				return value;
		} else {
				Node<K,V> nodeToAdd = new Node<K, V>(key, value);
				Node<K, V> prevNode = nodes.get(size - 1);
				nodes.add(nodeToAdd);
				prevNode.setNext(nodeToAdd);
				
				size ++;
				return value;
		}	
	}

	public V remove(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub
		
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder("");
		for (Node<K, V> node : nodes) {
			stringBuilder.append(node.toString() + "\n");
		}
		return stringBuilder.toString();
	}
}