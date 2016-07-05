public void dfs(int num) {
	if (this.visited) return;
	
	this.lowNum = num;
	num++;
	
	for (Node child : this.children) {
		child.dfs(num);
	}
	
	this.highNum = num;
	num++;
	
	this.visited = true;
}
