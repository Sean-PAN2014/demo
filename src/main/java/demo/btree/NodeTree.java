package demo.btree;

public class NodeTree {
	int data; //根节点数据  
	NodeTree left; //左子树  
	NodeTree right; //右子树  

	public NodeTree() {
	}

	public NodeTree(int data) { //实例化二叉树  
		this.data = data;
		left = null;
		right = null;
	}

	public NodeTree search(int data) {
		if (data == this.data) {
			// do nothing
			return this;
		} else if (data > this.data) { //如果插入的节点大于跟节点  
			if (this.right == null) { //如果右子树为空，就插入，如果不为空就再创建一个节点                                                           
				return null;
			} else {
				return this.right.search(data);
			}
		} else { //如果插入的节点小于根节点  
			if (this.left == null) { //如果左子树为空，就插入，如果不为空就再创建一个节点
				return null;
			} else {
				return this.left.search(data);
			}
		}
	}

	public void insert(int data) {
		if (data == this.data) {
			// do nothing
		} else if (data > this.data) { //如果插入的节点大于跟节点  
			if (this.right == null) { //如果右子树为空，就插入，如果不为空就再创建一个节点                                                           
				this.right = new NodeTree(data); //就把插入的节点放在右边  
			} else {
				this.right.insert(data);
			}
		} else { //如果插入的节点小于根节点  
			if (this.left == null) { //如果左子树为空，就插入，如果不为空就再创建一个节点             
				this.left = new NodeTree(data); //就把插入的节点放在左边边  
			} else {
				this.left.insert(data);
			}
		}
	}

	public NodeTree delete(int data) {
		return this.delete(data, null, false);
	}

	public NodeTree delete(int data, NodeTree parent, boolean isRightChild) {
		if (data == this.data) {
			// do delete
			if (this.left == null && this.right == null) {
				settingChild(parent, null, isRightChild);
			} else if (this.left == null) {
				settingChild(parent, this.right, isRightChild);
			} else if (this.right == null) {
				settingChild(parent, this.left, isRightChild);
			} else {
				NodeTree replacementParent = this.left.searchBiggestParent();
				if (replacementParent == null) {
					this.data = this.left.data;
					this.left = this.left.left;
				} else {
					this.data = replacementParent.right.data;
					replacementParent.right = replacementParent.right.left;
				}
			}
			return this;
		} else if (data > this.data) { //如果插入的节点大于跟节点  
			if (this.right == null) { //如果右子树为空，就插入，如果不为空就再创建一个节点                                                           
				return null;
			} else {
				return this.right.delete(data, this, true);
			}
		} else { //如果插入的节点小于根节点  
			if (this.left == null) { //如果左子树为空，就插入，如果不为空就再创建一个节点
				return null;
			} else {
				return this.left.delete(data, this, false);
			}
		}
	}

	static void settingChild(NodeTree parent, NodeTree child, boolean isRightChild) {
		if (parent != null) {
			parent.setChild(child, isRightChild);
		}
	}

	void setChild(NodeTree child, boolean isRightChild) {
		if (isRightChild) {
			this.right = child;
		} else {
			this.left = child;
		}
	}

	NodeTree searchBiggestParent() {
		NodeTree nodeTree = this;
		if (nodeTree.right == null) {
			return null;
		}
		while (true) {
			if (nodeTree.right.right == null) {
				return nodeTree;
			} else {
				nodeTree = nodeTree.right;
			}
		}
	}

	@Override
	public String toString() {
		return String.format("NodeTree [data=%s, left=%s, right=%s]", data, left, right);
	}

}