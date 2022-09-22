<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align:center">팀 목록 페이지입니다</h1>

  <table class="table table-bordered">
    <thead>
      <tr>
        <th>번호</th>
        <th>팀 이름</th>
        <th>경기장 이름</th>
        <th>장소</th>
        <th>창단일</th>
        <th>삭제</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="teams" items="${teams}">
      <tr class="stardium-${team.id}">
      	<td>${teams.id}</td>
        <td>${teams.teamName}</td>
        <td>${teams.stadiumName}</td>
        <td>${teams.location}<td>
        <td>${teams.createDate}</td> 
        <button id="btnDelete" class="btn btn-danger">삭제</button>
      </tr>
      </c:forEach>
    </tbody>
  </table>
  
  <script src="/js/teams.js"></script>

<%@ include file="../layout/footer.jsp"%>