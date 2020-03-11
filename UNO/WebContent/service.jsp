
<%@page import="Resources.Cards"%>
<%@page import="Resources.Deck"%>
<%@page import="Resources.Start"%>
<%@page import="Resources.Player"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Service</title>
</head>
<body>
<%

	Player player1 = new Player("name1");
	Player player2 = new Player("name2");
	
	Start partida1 = new Start(player1, player2);
	
	Deck principalDeck = partida1.getPrincipalDeck();
	List<Cards> cards = principalDeck.getCards();
	
	for(Cards card : cards){
		out.println(String.format("<p>codigo=%s color=%s</p>",card.getValue(),card.getColor()));
	}

%>
</body>
</html>