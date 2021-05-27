object ValidAnagram extends App{
  def isAnagram(s: String, t: String): Boolean = {

    //sort 2 strings
    val s1 = s.sorted
    val t1 = t.sorted

    //check for the same values
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
