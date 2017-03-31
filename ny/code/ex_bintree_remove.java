public void remove() {
	if (leftChild == null && rightChild == null) {
		// no children, just unlink
		if (parent.leftChild == this)
			parent.leftChild = null;
		else
			parent.rightChild = null;

	} else if (leftChild == null || rightChild == null) {

		// one child: unlink, and set parents link to this' child
		if (parent.leftChild == this) 
			parent.leftChild = this.leftChild;
		else 
			parent.rightChild = this.rightChild;

	} else {
		// two children: take the smallest element to the right and
		// replace with this.
		Node replacement = rightChild.findSmallestChild();

		// I will edit the content of this and delete the 
		// replacement node, instead of deleting this and edit the
		// pointers of the replacement node.
		this.element = replacement.getElement();
		replacement.remove();

	}
}
