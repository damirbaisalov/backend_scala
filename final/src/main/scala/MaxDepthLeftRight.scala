object MaxDepthLeftRight {

  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
      var value: Int = _value
      var left: TreeNode = _left
      var right: TreeNode = _right
  }

  def maxDepth(root: TreeNode): Int = {

    if (root == null) 0
    else {

      //recursively check for left and right depths
      val leftDepth = maxDepth(root.left)
      val rightDepth = maxDepth(root.right)

      //take the longer path and add 1
      if (leftDepth>rightDepth)
        leftDepth+1
      else
        rightDepth+1
    }
  }
}
