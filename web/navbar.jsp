<%@ page contentType="text/html;charset=UTF-8"%>
<div class="container py-3">
  <header>
    <nav class="navbar navbar-expand-lg bg-danger" data-bs-theme="dark">
      <div class="container-fluid">
        <a class="navbar-brand" href="/main">NEWS</a>
        <div class="collapse navbar-collapse justify-content-start" id="navbarSupportedContent">
          <ul class="navbar-nav mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link" href="/newscategory?categoryId=1">Poltics</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/newscategory?categoryId=2">Sport</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/lang?languageId=2">Новости на русском</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="/lang?languageId=1">News on English</a>
            </li>
          </ul>
        </div>
        <div class="collapse navbar-collapse justify-content-end">
          <ul class="navbar-nav mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link" href="/cabinet">Cabinet</a>
            </li>
          </ul>
          <ul class="navbar-nav mb-2 mb-lg-0">
            <li class="nav-item">
              <a class="nav-link" href="/logout">Log Out</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </header>
</div>