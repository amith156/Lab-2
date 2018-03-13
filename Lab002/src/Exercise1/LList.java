package Exercise1;

class ListCell<T> {
	T data;
	ListCell<T> next;

	public ListCell(T x, ListCell<T> c) {
		data = x;
		next = c;
	}
}

class ListException extends RuntimeException {
	public ListException(String s) {
		super(s);
	}
}

public class LList<T> {
	private ListCell<T> front;

	public LList() {
		front = null;
	}

	public void addToFront(T x) {
		front = new ListCell<T>(x, front);
	}

	public void addToBack(T x) {
		if (front == null)
			front = new ListCell<T>(x, front);
		else {
			ListCell<T> c = front;
			while (c.next != null)
				c = c.next;
			c.next = new ListCell<T>(x, null);
		}
	}

	public T elementAt(int n) {
		ListCell<T> c = front;
		for (int i = 0; i < n; i++) {
			if (c == null)
				throw new ListException("no element at position " + n);
			c = c.next;
		}
		if (c == null)
			throw new ListException("no element at position " + n);
		return c.data;
	}

	public int length() 
	{
		ListCell<T> c = front;
		int result = 0;
		while (c != null) 
		{
			result++;
			c = c.next;
		}
		return result;
	}
	
	public int find(T x)
	{
		ListCell<T> item_list;
		int pos=0;
		boolean found_status= false;
		for( item_list = front; item_list!=null; item_list=item_list.next)
		{
			pos++;
			if(item_list.data==x)
			{
				found_status = true;
				break;
			}
			
		}
		if(found_status)
		{
			return pos-1;
		}
		else
			return pos-1;
	}
	
	
	
	public String toString() {
		StringBuffer sb = new StringBuffer("<");
		ListCell<T> c = front;
		while (c != null) {
			sb.append(c.data+",");
			c = c.next;
		}
		return (sb + ">");
	}
}
