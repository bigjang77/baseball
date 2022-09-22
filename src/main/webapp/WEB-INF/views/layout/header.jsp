<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>baseball</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="/stadium/stadiumList">Home</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="collapsibleNavbar" style="justify-content: space-between">
				<ul class="navbar-nav">
					<li class="nav-item"><a class="nav-link" href="/stadium/stadiumList">경기장 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/stadium/stadiumSaveForm">경기장 등록</a></li>
					<li class="nav-item"><a class="nav-link" href="/team/teamList">팀 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/team/teamSaveForm">팀 등록</a></li>
					<li class="nav-item"><a class="nav-link" href="/player/playerList">선수 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/player/playerSaveForm">선수 등록</a></li>
					<li class="nav-item"><a class="nav-link" href="/team/positionByTeam">팀 별 포지션 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/explusion/explusionList">퇴출된 선수 목록</a></li>
					<li class="nav-item"><a class="nav-link" href="/explusion/explusionReason">퇴출 사유 등록</a></li>

				</ul>
			</div>
		</div>
	</nav>