
$("#btnSave").click(() => {
	save();
});

$("#btnDelete").click(()=>{
	remove();
});


function save(){
	let data = {
			playerName:$("#playerName").val(),
			teamName: $("#teamName").val(),
			position: $("#position").val()
	};
	
	$.ajax("/player", {
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

function remove() {
	let id = $("#id").val();

	$.ajax("/player" + id, {
		type: "DELETE",
		dataType: "json" 
	}).done((res) => {
		if (res.code == 1) {
			alert("선수삭제 완료");
		} else {
			alert("선수삭제 실패");
		}
	});
}