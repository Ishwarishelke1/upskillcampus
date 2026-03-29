<%@ page language="java" %>
<html>
<head>
<link rel="stylesheet" href="css/style.css">
</head>

<body>

<header>🍽️ Menu</header>

<div class="container">

<div class="card">
<h3>Pizza</h3>
<p>₹250</p>
<a href="addToCart?item=Pizza">
<button>Add to Cart</button>
</a>
</div>

<div class="card">
<h3>Burger</h3>
<p>₹150</p>
<a href="addToCart?item=Burger">
<button>Add to Cart</button>
</a>
</div>

<div class="card">
<h3>Pasta</h3>
<p>₹200</p>
<a href="addToCart?item=Pasta">
<button>Add to Cart</button>
</a>
</div>

</div>

<a href="cart.jsp">🛒 View Cart</a>

</body>
</html>