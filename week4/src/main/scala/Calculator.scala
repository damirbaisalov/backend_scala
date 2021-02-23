class Calculator(userInput: String) {

  def readSymbols(): String ={
    var result = ""
    var temp = ""
    var operation = ' '
    var index = 0

    while (index < userInput.length) {
      if (userInput.isEmpty) {
        return result
      } else {
        if (userInput(index).isDigit) {
          while (userInput(index).isDigit) {
            temp+=userInput(index)
            index+=1
          }
          if (result.isEmpty) {
            result = temp
          }
          else
            result = calculate(result.toInt, operation, temp.toInt)
          temp = ""
        }
        if (userInput(index)=='+' || userInput(index)=='-' || userInput(index)=='*' || userInput(index)=="/")
          operation = userInput(index)
      }
      index+=1
    }

    result
  }

  def calculate(num1: Int, operation: Char, num2: Int): String = {
   try {
     operation match {
      case '+' => (num1+num2).toString
      case '-' => (num1-num2).toString
      case '*' => (num1*num2).toString
      case '/' => (num1/num2).toString
    }
   } catch {
     case e: Exception => e.toString
   }
  }

}
