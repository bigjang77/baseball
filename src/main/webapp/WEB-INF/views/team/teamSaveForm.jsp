<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">팀 등록 페이지입니다</h1>

<div class="container">
	<form>
<select name="stadiumId">
	<option>경기장을 선택하세요</option>
	<c:forEach var="stadium" items="${stadiumList}">
		<option value="${stadium.id}">${stadium.stadiumName}</option>
	</c:forEach>
</select>
		<div>
			<input id="teamName" type="text" class="form-control"
				placeholder="Enter TeamName">
		</div>
		<button id="btnSaveTeaem" type="button" class="btn btn-primary">등록</button>
	</form>
</div>

<script src="/js/team.js"></script>

<%@ include file="../layout/footer.jsp"%>