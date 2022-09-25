<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align:center">팀 별 포지션 목록 페이지입니다</h1>

 <table class="table table-bordered">
    <thead>
      <tr>
        <th>포지션</th>
        <th>롯데</th>
        <th>키움</th>
        <th>기아</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="position" items="${positionList}">
      <tr>
      	<td>${position.position}</td>
        <td>${position.lotte}</td>
        <td>${position.kiwoom}</td>
        <td>${position.kia}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>


</body>
</html>