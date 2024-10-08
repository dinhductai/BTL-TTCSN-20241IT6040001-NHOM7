document.addEventListener('DOMContentLoaded', function() {
  fetch('https://dummyjson.com/products/search?q=Laptop')
    .then(response => response.json())
    .then(data => {
      const productList = document.getElementById('featured-products');
      // Lọc ra các sản phẩm thuộc category 'laptops'
      const laptops = data.products.filter(product => product.category === 'laptops');
      
      laptops.forEach(product => { // Truy cập vào danh sách laptop đã lọc
        const productElement = document.createElement('div');
        productElement.innerHTML = `
          <a href="product-details.html?id=${product.id}">
            <img src="${product.thumbnail}" alt="${product.title}">
            <h3>${product.title}</h3>
            <p>${product.price}</p>
          </a>
        `;
        productList.appendChild(productElement);
      });
    })
    .catch(error => console.error('Error fetching products:', error));
});
