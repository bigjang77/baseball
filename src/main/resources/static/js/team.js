$("#btn").click(() => {
	
	let data2 = {
		stadiumId:$("#stadiumId").val(),
		teamName:$("#teamName").val()
	};
	console.log(data2);
});



$("#btnSave").click(()=>{
	
	let data = {
		stadiumId:$("#stadiumId").val(),
		teamName:$("#teamName").val()
	};
	console.log(data);
	
	$.ajax("/team/save",{
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: { // http header에 들고갈 요청 데이터
			"Content-Type": "application/json"
		}
	}).done((res)=>{
		if(res.code == 1) {
			alert(res.msg);
			location.href="/teamList";
		} else {
			alert("팀 등록이 제대로 되지 않았습니다.");
			history.back();
		}
	});
}); 