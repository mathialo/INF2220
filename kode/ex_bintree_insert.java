public void insert(T otherElement) {
	int comparison = element.compareTo(otherElement);

	if (comparison > 0) {
		// This element is bigger than the one we're
		// inserting => left subtree
		if (leftChild == null) {

			// nothing there, insert
			leftChild = new Node(otherElement);
			return;
		} else {

			// occupied, move down
			leftChild.insert(otherElement);
		}

	} else if (comparison < 0) {
		// The element we're inserting is bigger than
		// this one => right subtree
		if (rightChild == null) {

			// nothing there, insert
			rightChild = new Node(otherElement);
			return;
		} else {

			// occupied, mode down
			rightChild.insert(otherElement);
		}
	} else {
		// The two elements are the same. Since this is a tree
		// for searching, we'll just forget about it
		return;
	}
}