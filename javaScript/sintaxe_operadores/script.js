function numbers(num1, num2) {
  if (!num1 || !num2) return 'Error: Invalid parameter'
  const FIRST_MESSAGE = createFirstMessage(num1, num2)
  const SECOND_MESSAGE = createSecondMessage(num1, num2)

  return `${FIRST_MESSAGE} ${SECOND_MESSAGE}`
}

function createFirstMessage(num1, num2) {
  let equals = ''

  if (num1 !== num2) {
    equals = 'not '
  }

  return `The numbers ${num1} and ${num2} are ${equals} equals`
}

function createSecondMessage(num1, num2) {
  const SUM = num1 + num2
  const LESS_THAN = SUM > 10
  const BIGGER_THAN = SUM > 20

  let lessThanResult = 'less than'
  let biggerThanResult = 'less than'

  if (LESS_THAN) {
    lessThanResult = 'bigger than'
  }

  if (BIGGER_THAN) {
    biggerThanResult = 'bigger than'
  }

  return `Your result is ${SUM}, ${lessThanResult} 10 and ${biggerThanResult} 20)`
}
