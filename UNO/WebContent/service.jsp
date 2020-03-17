<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="unoDeck.*"%>
<%@page import="gameHandler.RandomCode" %>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Service</title>
	</head>
	<body>
	<%
		Deck deck = new Deck();
		List<List<Card>> game = deck.deal();
		
		Player p1 = new Player("Name 01",game.get(0));
		Player p2 = new Player("Name 02",game.get(1));
		
		List<Card> graveyard = game.get(2);
		List<Card> mainDeck = game.get(3);
		
		int w=0, x=0, y=0, z=0;
		
		out.print("Las cartas del Player 1 son:<br><br>");
		for (Card c: p1.getDeck()){
			w++;
			out.println(String.format("<p>Value = %s color=%s type = %s</p>",c.getValue(),c.getColor(),c.getType()));
		}
		out.print(String.format("<br>Total de Cartas = %s<br>",w));
		
		out.print("<br><br>Las cartas del Player 2 son:<br><br>");
		for (Card c: p2.getDeck()){
			x++;
			out.println(String.format("<p>Value = %s color=%s type = %s</p>",c.getValue(),c.getColor(),c.getType()));
		}
		out.print(String.format("<br>Total de Cartas = %s<br>",x));
		
		out.print("<br><br>Las cartas del Cementerio son:<br><br>");
		for (Card c : graveyard){
			y++;
			out.println(String.format("<p>Value = %s color=%s type = %s</p>",c.getValue(),c.getColor(),c.getType()));
		}
		out.print(String.format("<br>Total de Cartas = %s<br>",y));
		
		out.print("<br><br>Las cartas del Deck Principal son:<br><br>");
		for (Card c : mainDeck){
			z++;
			out.println(String.format("<p>Value = %s color=%s type = %s</p>",c.getValue(),c.getColor(),c.getType()));
		}
		out.print(String.format("<br>Total de Cartas = %s<br>",z));
		
		Converter c = new Converter();
		String h1 = c.toJSONString(p1.getDeck());
		out.print("<br>"+h1+"<br>");
		List<Card> l1 = c.toCardList(h1);
		
		for (Card t : l1){
			out.println(String.format("<p>Value = %s color=%s type = %s</p>",t.getValue(),t.getColor(),t.getType()));
		}
		
		RandomCode code = new RandomCode();
		out.println("<br>"+code.generate());
		out.println("<br>"+code.generate());
		out.println("<br>"+code.generate());
		out.println("<br>"+code.generate());
	%>
	</body>
</html>