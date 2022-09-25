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
        <th>창단일</th>
        <th>삭제</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="team" items="${teamList}">
      <tr>
      	<td>${team.id}</td>
        <td>${team.teamName}</td>
        <td>${team.stadiumName}</td>
        <td>${team.createDate}</td> 
        <td><button id="btnDeleteTeam" class="btn btn-danger">삭제</button></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
  
  <script src="/js/team.js"></script>

<%@ include file="../layout/footer.jsp"%>