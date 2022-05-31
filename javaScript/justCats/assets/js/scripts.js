const BASE_URL = 'https://thatcopy.pw/catapi/rest/'

const getCats = async () => {
  const data = await fetch(BASE_URL)
    .then(res => res.json())
    .catch(err => console.error(err))

  return data.webpurl
}

const loadImg = async () => {
  const catImg = document.getElementById('cat')
  catImg.src = await getCats()
}

const catBtn = document.getElementById('change-cat')
catBtn.addEventListener('click', loadImg)

loadImg()
