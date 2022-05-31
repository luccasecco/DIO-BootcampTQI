function changeMode() {
  changeClasses()
  changeContent()
}

function changeClasses() {
  btn.classList.toggle('dark-mode')
  title.classList.toggle('dark-mode')
  bodyColor.classList.toggle('dark-mode')
  footerColor.classList.toggle('dark-mode')
}

function changeContent() {
  const lightModeContent = 'Light Mode'
  const darkModeContent = 'Dark Mode'

  if (bodyColor.classList.contains('dark-mode')) {
    btn.innerHTML = lightModeContent
    title.innerHTML = darkModeContent + ' ON'

    return
  }

  btn.innerHTML = darkModeContent
  title.innerHTML = lightModeContent + ' ON'
}

const btn = document.getElementById('mode-selector')
const title = document.getElementById('page-title')
const bodyColor = document.getElementsByTagName('body')[0]
const footerColor = document.getElementsByTagName('footer')[0]

btn.addEventListener('click', changeMode)
