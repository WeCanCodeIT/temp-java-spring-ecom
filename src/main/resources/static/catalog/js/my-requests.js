const xhr = new XMLHttpRequest();
xhr.onreadystatechange = function() {
	if (xhr.readyState === 4 && xhr.status === 200) {
		const res = JSON.parse(xhr.responseText)
		const productsContainer = document.querySelector('#products-container')

		for (let product of res) {
			const productContainer = document.createElement('div')
			productContainer.innerText = product.name
			productsContainer.appendChild(productContainer)
		}
	}
}
xhr.open('GET', '/products', true)
xhr.send()