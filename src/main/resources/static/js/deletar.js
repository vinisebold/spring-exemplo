document.getElementById("formulario").addEventListener("submit", function (e) {
  e.preventDefault();

  const id = parseInt(document.getElementById("id").value);

  fetch(`http://localhost:8080/produtos/${id}`, {
    method: "DELETE",
  });

  document.getElementById("formulario").reset();
});
