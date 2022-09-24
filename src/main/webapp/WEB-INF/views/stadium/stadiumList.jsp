<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align: center">경기장 목록 페이지입니다</h1>

  <table class="table table-bordered">
    <thead>
      <tr>
        <th>번호</th>
        <th>이름</th>
        <th>개장일</th>
        <th>삭제</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="stadium" items="${stadiumList}">
      <tr>
      	<td>${stadium.no}</td>
        <td>${stadium.stadiumName}</td>
        <td>${stadium.createDate}</td>
        <th><button id="btnDeleteStadium" type="button" class="btn btn-danger" >삭제</button></th>
      </tr>
      </c:forEach>
    </tbody>
  </table>

<script src="/js/stadium.js"> </script>

<%@ include file="../layout/footer.jsp"%>