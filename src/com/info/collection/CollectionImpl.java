package com.info.collection;

import com.info.iterator.Iterator;

public class CollectionImpl implements Collection {
    String inputArr[] = {"Chicken Sausage","Cheese and Corn ","Cheese n Tomato","Margherita"};
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new Itr();
	}

	private class Itr implements Iterator{
        int index=0;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(index<inputArr.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()) {
				return inputArr[index++];
			}
			return null;
		}
		
	}
}
