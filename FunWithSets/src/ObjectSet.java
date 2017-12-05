

public class ObjectSet {

	private Object[] elements;
	private int numElements;

	public ObjectSet(int maxElements) {
		elements = new Object[maxElements];
		numElements = 0;
	}
	public ObjectSet(Object[] numbers) {
		elements = new Object[numbers.length * 2];
		for (int i=0; i<numbers.length; i++) {
			elements[i] = numbers[i];
		}
		numElements = numbers.length;

	}

	public boolean isMember(Object key) {
		for(int i=0; i<numElements; i++) {
			if (key == elements[i])
				return true;
		}
		return false;
	}

	public Object[] getElements() {
		return elements;
	}
	public int getNumElements() {
		return numElements;
	}
	public void setElements(Object[] elements) {
		this.elements = elements;
	}
	public void setNumElements(int numElements) {
		this.numElements = numElements;
	}

	public int getCardinality() {
		return numElements;
	}

//	public double getSum() {
//		double sum = 0;
//		for(int i=0; i<numElements; i++) {
//			sum = sum + elements[i];	
//		}
//		return sum;
//	}
//
//	public boolean allEven() {
//		for(int i=0; i<numElements; i++) {
//			if (elements[i] % 2 == 1) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	public ObjectSet mapSquares() {
//		double[] squares = new double[numElements];
//		for(int i=0; i<numElements; i++) {
//			squares[i] = elements[i] * elements[i];
//		}
//		return new ObjectSet(squares);
//	}

	public void add(Object newElement) {
		if (numElements >= elements.length) {
			// Make new array to increase space
			Object[] newElements = new Object[elements.length * 2];
			for (int i=0; i<numElements; i++) {
				newElements[i] = elements[i];
			}
			elements = newElements;
		}
		elements[numElements] = newElement;
		numElements++;
	}

	public ObjectSet intersection(ObjectSet s2) {
		ObjectSet result = new ObjectSet(Math.min(this.getCardinality(), s2.getCardinality()));

		for(int i=0; i<this.getCardinality(); i++) {
			if (s2.isMember(elements[i])) {
				result.add(elements[i]);
			}
		}
		return result;
	}
	
	public ObjectSet union(ObjectSet s2) {
		ObjectSet result = new ObjectSet(this.getCardinality() + s2.getCardinality());
		
		for(int i=0; i<getCardinality(); i++) {
			result.add(elements[i]);
		}
		
		for(int i=0; i<s2.getCardinality(); i++) {
			if (!result.isMember(s2.elements[i])) {
				result.add(s2.elements[i]);
			}
		}
		return result;
	}
}
