<%@ page import="java.util.*" %>
<html>
<body>

<h2>🛒 Your Cart</h2>

<%
List<String> cart = (List<String>) session.getAttribute("cart");

int total = 0;

if(cart == null || cart.size() == 0) {
%>
<p>Cart is empty</p>
<%
} else {
    for(String item : cart) {

        int price = 0;

        if(item.equals("Pizza")) price = 250;
        else if(item.equals("Burger")) price = 150;
        else if(item.equals("Pasta")) price = 200;

        total += price;
%>

<p>
<%= item %> - ₹<%= price %> 
<a href="removeItem?item=<%= item %>">❌ Remove</a>
</p>

<%
    }
}
%>

<h3>Total: ₹<%= total %></h3>

<br>
<a href="menu.jsp">Back to Menu</a>

<form action="order" method="post">
<button type="submit">Place Order ✅</button>
</form>
</body>
</html>