
$("#btnSaveStadium").click(() => {
	save();
});

$("#btnDeleteStadium").click(()=>{
	console.log("클릭");
	remove();
});


function save(){
	let data = {
			stadiumName: $("#stadiumName").val()
	};
	
	$.ajax("/stadium", {
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

	$.ajax("/stadium" + id, {
		type: "DELETE",
		dataType: "json" 
	}).done((res) => {
		if (res.code == 1) {
			alert("경기장삭제 완료");
		} else {
			alert("경기장삭제 실패");
		}
	});
}