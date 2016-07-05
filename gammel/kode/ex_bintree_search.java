public Node find(T otherElement) {
	int comparison = element.compareTo(otherElement);

	if (comparison == 0) {
		return this;

	} else if (comparison < 0) {

		// This element is smaller than the one we're searching for, go left
		
		if (leftChild == null) {
			// the element doesn't exist
			return null;

		} else {
			return leftChild.find(otherElement);
		}

	} else {
	
		// This element is bigger than the one we're searching for, go right
		
		if (rightChild == null) {
			// the element doesn't exist
			return null;

		} else {
			return rightChild.find(otherElement);
		}
	}
}
