
/* The following methods count the leaves ad height of tree and depth and height 
of a given node. These can be added to BinaryTreeMap java file and used on data*/

public Integer countLeaves(){
	int count= 0;
	while(!isEmpty()){
		if (cursor.left==null) {
			count++;
		}
		if (cursor.right==null) {
			count++;
		}
	}
	return count;
}
public Integer getNodeDepth(K Key) {
	int depth= 0;
	if (containsKey(Key)) {
		K newkey= cursor.key;
		int i = key.compareTo(newkey);
		if (i==0) {
			if (cursor.parent.left!=null || cursor.parent.right!=null){
			depth++;
			}
		} else {
			depth= 0;
		}
	}
	return depth;
	if (!containsKey(Key)) {
		return null;
	}
}

public Integer getNodeHeight(K Key) {
	int heightNode= 0;
	if (containsKey(Key)) {
		K nKey= cursor.key;
		int m= key.compareTo(nKey);
		if (m=0) {
			while (!isEmpty()) {
				if (cursor.left!= null || cursor.right!= null) {
					heightNode++;
				}
			}
		} else {
			heightNode= 0;
		}
			cursor= cursor.left.right;
	}
	return heightNode;
	if (!containsKey(Key)) {
		return null;
	}
}

public Integer getTreeHeight() {
	int height= 0;
	cursor= root;
	if (!isEmpty()) {
		if(cursor.left!=null) {
			height++;
		}
	}
	return height;
	if (isEmpty()) {
		return null;
	}
}
			
			
	