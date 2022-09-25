<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form>
		<div class="mb-3 mt-3">
			<label for="playerId" class="form-label">선수명 :</label> <select id="player" class="form-select">
				<option value="none">== 선수 선택 ==</option>
				<c:forEach var="player" items="${playerList}">
					<option value="${player.id}">${player.name}</option>
				</c:forEach>
			</select>
		</div>
		<div class="mb-3 mt-3">
			<label for="reason">퇴출사유</label> <input id="reason" type="text" class="form-control"
				placeholder="Enter the expulsion reason" name="reason">
		</div>
		<button id="btnSave" type="button" class="btn btn-primary">퇴출</button>
	</form>
</div>

</body>
</html>