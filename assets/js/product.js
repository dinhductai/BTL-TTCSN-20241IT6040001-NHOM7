document.addEventListener('DOMContentLoaded', function() {
  fetch('https://dummyjson.com/products')
    .then(response => response.json())
    .then(data => {
      const productList = document.getElementById('product-list');
      if (!productList) {
        console.error('Product list element not found');
        return;
      }

      data.products.forEach(product => {
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
// Lấy chi tiết sản phẩm từ URL (dùng cho trang product-details.html)
const urlParams = new URLSearchParams(window.location.search);
const productId = urlParams.get('id');

if (productId) {
  fetch(`https://dummyjson.com/products/${productId}`) // Bỏ dấu `/` ở đầu URL
    .then(response => response.json())
    .then(product => {
      document.getElementById('product-name').innerText = product.title; // Đổi `name` thành `title`
      document.getElementById('product-image').src = product.thumbnail; // Sửa `image` thành `thumbnail`
      document.getElementById('product-description').innerText = product.description;
      document.getElementById('product-price').innerText = `Giá: ${product.price}`;
    });
}
