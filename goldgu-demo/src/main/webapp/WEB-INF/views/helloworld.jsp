<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
	<title>Bootstrap学习</title>

	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css">
</head>
<body>
	
	<div class="container-fluid">
		<form>
			<div class="form-inline">
				<div class="form-group">
				    <label for="exampleInputName2">Name</label>
				    <input type="text" class="form-control" id="exampleInputName2" placeholder="Jane Doe">
				  </div>
				  <div class="form-group">
				    <label for="exampleInputEmail2">Email</label>
				    <input type="email" class="form-control" id="exampleInputEmail2" placeholder="jane.doe@example.com">
				  </div>
				  <button type="submit" class="btn btn-primary">Send invitation</button>
			</div>
		</form>
	</div>
	<script src="${pageContext.request.contextPath}/js/jquery-2.1.4.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
</body>
</html>