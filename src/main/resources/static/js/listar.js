fetch("http://localhost:8080/produtos")
  .then(response => response.json())
  .then(listaProdutos => {
    const container = document.getElementById("container");

    listaProdutos.forEach(produto => {
      const card = document.createElement('div');
      
      card.className = 'card';
      card.innerHTML = `
      <h3>Nome: ${produto.nomeProduto}</h3>
      <p>Preço: ${produto.preco} </p>
      <p>ID: ${produto.id} </p>
      `;
      container.appendChild(card)
    });
  });
