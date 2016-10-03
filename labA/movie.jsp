<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%--
	On this page we have a form to edit a single movie and a button to delete it.
	
	Model:
	- Movie movie
 --%>
<html>
<head>
<title>Movies</title>
<link href="<c:url value="/resources/main.css"/>" rel="stylesheet" />
</head>
<body>
	<div class="nav">
		<a href="<c:url value="/"/>">Home</a> <a
			href="<c:url value="/movies"/>">Back to Movies List</a>
	</div>
	<h1>Movie: ${ movie.title }</h1>

	<form method="post">
		<div>
			<label>Title</label> <input type="text" name="title"
				value="${movie.title}" />
		</div>


		<div>
			<label>Category</label> <input type="text" name="category"
				value="${movie.category}" />
		</div>
		<div>
			<label>Year</label> <input type="number" name="year"
				value="${movie.year}" />
		</div>
		<div>
			<label>Description</label>
			<textarea name="description"> ${movie.description }</textarea>

		</div>
		<div>
			<label>Rating</label> <select name="rating">
				<option value="G">g</option>
				<option value="PG">pg</option>
				<option value="PG13">pg13</option>
				<option value="R">r</option>
			</select>

		</div>

		<div>
			<label>BlackAndWhite Or Colored<br></label> <br>
			 <input type="checkbox" name="colored movies" value="   "> colored <br>
			<input type="checkbox" name="black and white" value="blackAndWhite">
			Black And White
		</div>
		
		<div>
		<label>Origin<br></label><br>
			<input type="radio" name="origin" value="Hollywood">Hollywood<br>
			 <input type="radio" name="origin" value="Foreign">Foreign<br> 
			<input type="radio" name="origin"  value="Independent"> independent

		</div>
		
		<div>
			<button type="submit">Save Changes</button>
		</div>
	</form>

	<form method="post"
		action="<c:url value="/movies/${movie.id}/delete"/>">
		<button type="submit">Delete this Movie</button>

	</form>

</body>
</html>