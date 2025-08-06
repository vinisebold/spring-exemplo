document.getElementById('formulario').addEventListener('submit', function(e){
  e.preventDefault();

  const produto = {
    id: parseInt(document.getElementById('id').value),
    nomeProduto: document.getElementById('nome').value,
    preco: parseFloat(document.getElementById('preco').value)
  }

  fetch('http://localhost:8080/produtos', {
      method: 'PUT',
      headers: {'Content-Type' : 'application/json'},
      body: JSON.stringify(produto)
  })
})