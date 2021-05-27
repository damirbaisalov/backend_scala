object MaxDepthTree extends App {

   class Node(var _value: Int) {
       var value: Int = _value
       var children: List[Node] = List()
   }

  def maxDepth(root: Node): Int = {

    if (root == null)
      0
    else {
      var maxDepthCnt = 0
      for (it <- root.children){
        maxDepthCnt = Math.max(maxDepthCnt, maxDepth(it))
      }

      maxDepthCnt+1
    }
  }
}
