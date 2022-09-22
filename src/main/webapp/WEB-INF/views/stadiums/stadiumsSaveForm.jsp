<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">경기장 등록 페이지입니다</h1>


<div class="container">
	<form>
		<div>
			<input id="stadiumName" type="text" class="form-control"
				placeholder="Enter stadiumName" value=""/>
		</div>
		<div>
			<input id="location" type="text" class="form-control"
				placeholder="Enter location" value=""/>
		</div>
		<button id="btnSave" type="submit" class="btn btn-primary">등록</button>
	</form>
</div>



<script src="/js/stadiums.js"></script>


<%@ include file="../layout/footer.jsp"%>