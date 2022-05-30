function calculator() {
  const operation = Number(
    prompt(
      'Escolha uma operação:\n 1 - Soma (+)\n 2 - Subtração (-) \n 3 - Multiplicação (*)\n 4 - Divisão real (/)\n 5 - Divisão inteira (%)\n 6 - Potenciação (**)'
    )
  )

  if (!operation || operation >= 7) {
    alert('Erro - operação inválida')
    calculator()
  } else {
    let n1 = Number(prompt('Insira o primeiro valor: '))
    let n2 = Number(prompt('Insira o segundo valor: '))
    let result

    if (!n1 || !n2) {
      alert('Erro - valores inválidos')
      calculator()
    } else {
      function sum() {
        result = n1 + n2
        alert(`${n1} + ${n2} = ${result}`)
        newOperation()
      }

      function sub() {
        result = n1 - n2
        alert(`${n1} - ${n2} = ${result}`)
        newOperation()
      }

      function mult() {
        result = n1 * n2
        alert(`${n1} * ${n2} = ${result}`)
        newOperation()
      }

      function divReal() {
        result = n1 / n2
        alert(`${n1} / ${n2} = ${result}`)
        newOperation()
      }

      function divInt() {
        result = n1 % n2
        alert(`O resto da divisão ${n1} e ${n2} é igual a ${result}`)
        newOperation()
      }

      function pot() {
        result = n1 ** n2
        alert(`${n1} elevado a ${n2}ª é igual a ${result}`)
        newOperation()
      }

      function newOperation() {
        let option = prompt(
          'Deseja realizar outra operação?\n 1 - Sim\n 2 - Não'
        )

        if (option == 1) {
          calculator()
        } else if (option == 2) {
          alert('Até mais')
        } else {
          alert('Digite uma opção válida')
          newOperation()
        }
      }

      // if (operation == 1) {
      //   sum()
      // } else if (operation == 2) {
      //   sub()
      // } else if (operation == 3) {
      //   mult()
      // } else if (operation == 4) {
      //   divReal()
      // } else if (operation == 5) {
      //   divInt()
      // } else if (operation == 6) {
      //   pot()
      // }

      switch (operation) {
        case 1:
          sum()
          break
        case 2:
          sub()
          break
        case 3:
          mult()
          break
        case 4:
          divReal()
          break
        case 5:
          divInt()
          break
        case 6:
          pot()
          break
      }
    }
  }
}

calculator()
