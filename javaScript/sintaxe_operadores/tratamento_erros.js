function receiveArray(arr, num) {
  try {
    if (!arr && !num) throw new ReferenceError('Envie os parâmetros corretos')
    if (typeof arr !== 'object')
      throw new TypeError('Tipo de array inválido, precisa ser um objeto')
    if (typeof num !== 'number')
      throw new TypeError('Parâmetro inválido, precisa ser um número')
    if (arr.length !== num) throw new RangeError('Tamanho de array inválido')

    return arr
  } catch (e) {
    if (e instanceof ReferenceError) {
      console.log('Erro = ReferenceError')
      console.log(e.message)
    } else if (e instanceof TypeError) {
      console.log('Erro = TypeError')
      console.log(e.message)
    } else if (e instanceof RangeError) {
      console.log('Erro = RangeError')
      console.log(e.message)
    } else {
      console.log('Erro não esperado: ' + e)
    }
  }
}

console.log(receiveArray([1, 2], 2))
