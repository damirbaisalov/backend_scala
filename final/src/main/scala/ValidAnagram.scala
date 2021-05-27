object ValidAnagram extends App{
  def isAnagram(s: String, t: String): Boolean = {

    val s1 = s.sorted
    val t1 = t.sorted

    if (s1.equals(t1))
      true
    else
      false
  }

  def testCase(): Unit = {
    val s = "anagram"
    val t = "nagaram"

    val result = isAnagram(s,t)

    print(result)
  }

  testCase()
}
