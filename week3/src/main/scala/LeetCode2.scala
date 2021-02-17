object LeetCode2 extends App {

  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def getDecimalValue(head: ListNode): Int = {
    var iterator = head
    var powerVal = 0
    var result = 0

    while (iterator != null) {
      iterator = iterator.next
      powerVal = powerVal + 1
    }

    iterator = head
    powerVal = powerVal - 1

    while (iterator != null) {
      result = result + Math.pow(2 , powerVal).toInt * iterator.x
      powerVal = powerVal - 1
      iterator = iterator.next
    }

    result
  }

  def test(): Unit = {
    val binaryNum = new ListNode()
    val res = getDecimalValue(binaryNum)
    print(res)
  }

  test()
}
