<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<h1 style="text-align:center">선수 목록 페이지입니다</h1>

  <table class="table table-bordered">
    <thead>
      <tr>
        <th>번호</th>
        <th>선수 이름</th>
        <th>팀 이름</th>
        <th>포지션</th>
        <th>등록일</th>
        <th>삭제</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach var="player" items="${playerList}">
      <tr>
      	<td>${player.id}</td>
        <td>${player.playerName}</td>
        <td>${player.teamName}</td>
        <td>${player.position}</td>
        <td>${player.createDate}</td>
        <td><button id="btnDelete" class="btn btn-danger">삭제</button></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
  
  <script src="/js/teams.js"></script>

<%@ include file="../layout/footer.jsp"%>