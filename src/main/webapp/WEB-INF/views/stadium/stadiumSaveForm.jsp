<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">경기장 등록 페이지입니다</h1>


<div class="container">
	<form>
		<div>
			<input id="stadiumName" type="text" class="form-control" placeholder="Enter stadiumName" >
		</div>
		<button id="btnSaveStadium" type="submit" class="btn btn-primary">등록</button>
	</form>
</div>



<script src="/js/stadium.js"></script>


<%@ include file="../layout/footer.jsp"%>