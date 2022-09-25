


$("#btnDelete").click(()=>{
	remove();
});




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