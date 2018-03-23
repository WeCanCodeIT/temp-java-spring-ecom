const productAddButton = document.querySelector('.add-product button'),
	productAddInput = document.querySelector('.add-product input'),
	productsList = document.querySelector('.products-list ul')
const xhr = new XMLHttpRequest()
xhr.onreadystatechange = function() {
	if (xhr.readyState === 4 && xhr.status === 200) {
		const res = xhr.responseText
		productsList.innerHTML = res
	}
}

productAddButton.addEventListener('click', function() {
	postProducts(productAddInput.value)
})

function getProducts() {
	xhr.open('GET', '/api/products', true)
	xhr.send()
}
function postProducts(productName) {
	xhr.open('POST', '/products/' + productName, true)
	xhr.send()
}
