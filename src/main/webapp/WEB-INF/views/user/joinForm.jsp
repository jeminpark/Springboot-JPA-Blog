<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>


<div class="container">

	<form >
		<div class="form-group">
			<label for="username">Username</label> 
			<input type="text" class="form-control" placeholder="Enter Username" id="username">
		</div>
		
		<div class="form-group">
			<label for="password">Password</label> 
			<input type="password" class="form-control" placeholder="Enter password" id="password">
		</div>
		
		<div class="form-group">
			<label for="email">Email address</label> 
			<input type="email" class="form-control" placeholder="Enter email" id="email">
		</div>
		
		<input type="hidden" th:name="${_csrf.parameterName}" th:value="${_csrf.token}" />
		
	</form>
	<button id="btn-save" class="btn btn-primary">회원가입 완료</button>
	
</div>

<script src = "/blog/js/user.js"></script>

<%@ include file="../layout/footer.jsp"%>



