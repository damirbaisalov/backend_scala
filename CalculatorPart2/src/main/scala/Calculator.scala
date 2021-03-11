class Calculator() {

  def readSymbols(userInput: String): String ={
    var result = ""
    var currentResult = ""
    var operation = ' '
    var index = 0

    while (index < userInput.length) {
      if (userInput.isEmpty) {
        return result
      } else {
        if (userInput(index).isDigit || userInput(index)=='.') {
          currentResult+=userInput(index)
          index+=1

          if (userInput(index)=='.') {
            currentResult+=userInput(index)
            index+=1
          }

          while (userInput(index).isDigit) {
            currentResult+=userInput(index)
            index+=1
          }
          if (!result.isEmpty)
            result = calculate(result.toDouble, operation, currentResult.toDouble)
          else
            result = currentResult
          currentResult = ""
        }
        if (checkOperation(userInput(index)))
          operation = userInput(index)
      }
      index+=1
    }

    result
  }

  def calculate(num1: Double, operation: Char, num2: Double): String = {
    try {
      operation match {
        case '+' => (num1+num2).toString
        case '-' => (num1-num2).toString
        case '*' => (num1*num2).toString
        case '/' => (num1/num2).toString
        case ':' => (num1/num2).toString
      }
    } catch {
      case e: Exception => e.toString
    }
  }

  def checkOperation(operation: Char): Boolean = {
    if (operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation==':')
      true
    else
      false
  }
}