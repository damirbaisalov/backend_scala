object IncreasingOrderSearchTree extends App {

  class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
       var value: Int = _value
       var left: TreeNode = _left
       var right: TreeNode = _right
  }

  var current = new TreeNode
  def increasingBST(root: TreeNode): TreeNode = {

    var result = new TreeNode(0)
    current = result
    inorder(root)

    result.right
  }


  def inorder(node: TreeNode): Unit = {
    //condition to out from recursion
    if (node==null) return
    inorder(node.left)
    node.left = null
    current.right = node
    current = node
    inorder(node.right)
  }
}
