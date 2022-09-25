<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">선수 등록 페이지입니다</h1>

<button id="btn" type="button">테스트</button>
<div class="container">
	<form>
		<select name="teamId">
			<option>팀을 선택하세요</option>
			<c:forEach var="team" items="${teamList}">
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

<script>
$("#btn").click(() => {
	
	let data2 = {
			playerName:$("#playerName").val(),
			teamName: $("#teamName").val(),
			position: $("#position").val()
	};
	console.log(data2);
});



$("#btnSave").click(() => {
	save();
});

function save(){
	let data = {
			playerName:$("#playerName").val(),
			teamName: $("#teamName").val(),
			position: $("#position").val()
	};
	
	$.ajax("/player/save", {
		type: "POST",
		dataType: "json", // 응답 데이터
		data: JSON.stringify(data), // http body에 들고갈 요청 데이터
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("생성에성공했습니다");
		}else {
			alert("다시하세요");
			history.back();
		}
	});
}

</script>

<%@ include file="../layout/footer.jsp"%>