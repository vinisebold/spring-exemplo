document.getElementById('formulario').addEventListener('submit', function(e){
  e.preventDefault();

  const produto = {
    id: parseInt(document.getElementById('id').value),
  }

  fetch('http://localhost:8080/produtos', {
      method: 'DELETE',
      headers: {'Content-Type' : 'application/json'},
      body: JSON.stringify(produto)
  })
})