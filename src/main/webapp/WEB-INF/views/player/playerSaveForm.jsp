<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">선수 등록 페이지입니다</h1>

<div class="container">
	<form>
		<select name="teamId">
			<option>팀을 선택하세요</option>
			<c:forEach var="team" items="${teams}">
				<option value="${team.id}">${team.teamName}</option>
			</c:forEach>
		</select>
		<div>
			<input id="playerName" type="text" class="form-control" placeholder="Enter playerName" value="" />
			<input id="position" type="text" class="form-control" placeholder="Enter position" value="" /> 
		</div>
		<button id="btnSave" type="submit" class="btn btn-primary">등록</button>
	</form>
</div>

<script src="/js/player.js"></script>

<%@ include file="../layout/footer.jsp"%>