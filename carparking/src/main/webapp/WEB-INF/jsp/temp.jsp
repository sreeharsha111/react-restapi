<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

    <title>Parking PI</title>

    <!-- Additional CSS Files -->
    <link rel="stylesheet" type="text/css" href="/carparking/src/main/webapp/WEB-INF/jsp/font-awesome.css">
        <link rel="stylesheet" type="text/css" href="/carparking/src/main/webapp/WEB-INF/jsp/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="/carparking/src/main/webapp/WEB-INF/jsp/templatemo-training-studio.css"/>
    
   <style type="text/css">
   @charset "ISO-8859-1";
/*
                                                                           
TemplateMo 548 Training Studio

https://templatemo.com/tm-548-training-studio

*/

/* ---------------------------------------------
Table of contents
------------------------------------------------
01. font & reset css
02. reset
03. global styles
04. header
05. banner
06. features
07. testimonials
08. contact
09. footer
10. preloader
11. search
12. portfolio

--------------------------------------------- */
/* 
---------------------------------------------
font & reset css
--------------------------------------------- 
*/
@import url("https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i");
/* 
---------------------------------------------
reset
--------------------------------------------- 
*/
html, body, div, span, applet, object, iframe, h1, h2, h3, h4, h5, h6, p, blockquote, div
pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, font, img, ins, kbd, q,
s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li,
figure, header, nav, section, article, aside, footer, figcaption {
  margin: 0;
  padding: 0;
  border: 0;
  outline: 0;
}

.clearfix:after {
  content: ".";
  display: block;
  clear: both;
  visibility: hidden;
  line-height: 0;
  height: 0;
}

.clearfix {
  display: inline-block;
}

html[xmlns] .clearfix {
  display: block;
}

* html .clearfix {
  height: 1%;
}

ul, li {
  padding: 0;
  margin: 0;
  list-style: none;
}

header, nav, section, article, aside, footer, hgroup {
  display: block;
}

* {
  box-sizing: border-box;
}

html, body {
  font-family: 'Poppins', sans-serif;
  font-weight: 400;
  background-color: #fff;
  font-size: 16px;
  -ms-text-size-adjust: 100%;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

a {
  text-decoration: none !important;
}

h1, h2, h3, h4, h5, h6 {
  margin-top: 0px;
  margin-bottom: 0px;
}

ul {
  margin-bottom: 0px;
}

p {
  font-size: 14px;
  line-height: 25px;
  color: #7a7a7a;
}

/* 
---------------------------------------------
global styles
--------------------------------------------- 
*/
html,
body {
  background: #fff;
  font-family: 'Poppins', sans-serif;
}

::selection {
  background: #4EBCFF;
  color: #fff;
}

::-moz-selection {
  background: #4EBCFF;
  color: #fff;
}

@media (max-width: 991px) {
  html, body {
    overflow-x: hidden;
  }
  .mobile-top-fix {
    margin-top: 30px;
    margin-bottom: 0px;
  }
  .mobile-bottom-fix {
    margin-bottom: 30px;
  }
  .mobile-bottom-fix-big {
    margin-bottom: 60px;
  }
}

.section-heading {
  text-align: center;
  margin-top: 140px;
  margin-bottom: 80px;
}

.section-heading h1 {
  font-size: 24px;
  font-weight: 800;
  color: #232d39;
  text-transform: uppercase;
  letter-spacing: 0.5px;
  margin-top: 0px;
  margin-bottom: 0px;
}

.section-heading h1 em {
  font-style: normal;
  color: #4EBCFF;
}

.section-heading img {
  margin: 20px auto;
}

.dark-bg h1 {
  color: #fff;
}

.dark-bg p {
  color: #fff;
}

.main-button a {
  display: inline-block;
  font-size: 15px;
  padding: 12px 20px;
  background-color: #4EBCFF;
  color: #fff;
  text-align: center;
  font-weight: 400;
  text-transform: uppercase;
  transition: all .3s;
}

.main-button a:hover {
  background-color: #f9735b;
}


/* 
---------------------------------------------
header
--------------------------------------------- 
*/

.background-header {
  background: rgba(250,250,250,0.99) !important;
  height: 80px!important;
  position: fixed!important;
  top: 0px;
  left: 0px;
  right: 0px;
  box-shadow: 0px 0px 10px rgba(0,0,0,0.15)!important;
}

.background-header .logo,
.background-header .main-nav .nav li a {
  color: #232d39!important;
}

.background-header .main-nav .nav li:last-child a {
  color: #fff !important;
}

.background-header .main-nav .nav li:last-child a:hover {
  color: #fff!important;
}

.background-header .main-nav .nav li:hover a {
  color: #4EBCFF!important;
}

.background-header .nav li a.active {
  color: #4EBCFF!important;
}

.header-area {
  position: absolute;
  top: 0px;
  left: 0px;
  right: 0px;
  z-index: 100;
  height: 80px;
  background: rgba(250,250,250,0.1);
  -webkit-transition: all .5s ease 0s;
  -moz-transition: all .5s ease 0s;
  -o-transition: all .5s ease 0s;
  transition: all .5s ease 0s;
}

.header-area .main-nav {
  min-height: 80px;
  background: transparent;
}

.header-area .main-nav .logo {
  line-height: 80px;
  color: #fff;
  font-size: 32px;
  font-weight: 800;
  text-transform: uppercase;
  float: left;
  -webkit-transition: all 0.3s ease 0s;
  -moz-transition: all 0.3s ease 0s;
  -o-transition: all 0.3s ease 0s;
  transition: all 0.3s ease 0s;
}

.header-area .main-nav .logo em {
  font-style: normal;
  color: #4EBCFF;
  font-weight: 900;
}

.header-area .main-nav .nav {
  float: right;
  margin-top: 27px;
  margin-right: 0px;
  background-color: transparent;
  -webkit-transition: all 0.3s ease 0s;
  -moz-transition: all 0.3s ease 0s;
  -o-transition: all 0.3s ease 0s;
  transition: all 0.3s ease 0s;
  position: relative;
  z-index: 999;
}

.header-area .main-nav .nav li {
  padding-left: 20px;
  padding-right: 20px;
}

.header-area .main-nav .nav li a {
  display: block;
  font-weight: 500;
  font-size: 13px;
  color: #7a7a7a;
  text-transform: uppercase;
  -webkit-transition: all 0.3s ease 0s;
  -moz-transition: all 0.3s ease 0s;
  -o-transition: all 0.3s ease 0s;
  transition: all 0.3s ease 0s;
  height: 40px;
  line-height: 40px;
  border: transparent;
  letter-spacing: 1px;
}

.header-area .main-nav .nav li a {
  color: #fff;
}

.header-area .main-nav .nav li:last-child a {
  display: inline-block;
  font-size: 13px;
  padding: 11px 17px;
  background-color: #4EBCFF;
  color: #fff;
  text-align: center;
  font-weight: 400;
  letter-spacing: 0px;
  text-transform: uppercase;
  transition: all .3s;
  height: auto;
  line-height: 20px;
}

.header-area .main-nav .nav li:last-child a:hover {
  background-color: #f9735b;
  opacity: 1;
}

.header-area .main-nav .nav li:hover a,
.header-area .main-nav .nav li a.active {
  color: #4EBCFF!important;
  opacity: 1;
}

.background-header .main-nav .nav li:hover a,
.background-header .main-nav .nav li a.active {
  color: #4EBCFF!important;
  opacity: 1;
}

.header-area .main-nav .menu-trigger {
  cursor: pointer;
  display: block;
  position: absolute;
  top: 23px;
  width: 32px;
  height: 40px;
  text-indent: -9999em;
  z-index: 99;
  right: 40px;
  display: none;
}

.header-area .main-nav .menu-trigger span,
.header-area .main-nav .menu-trigger span:before,
.header-area .main-nav .menu-trigger span:after {
  -moz-transition: all 0.4s;
  -o-transition: all 0.4s;
  -webkit-transition: all 0.4s;
  transition: all 0.4s;
  background-color: #1e1e1e;
  display: block;
  position: absolute;
  width: 30px;
  height: 2px;
  left: 0;
}

.background-header .main-nav .menu-trigger span,
.background-header .main-nav .menu-trigger span:before,
.background-header .main-nav .menu-trigger span:after {
  background-color: #1e1e1e;
}

.header-area .main-nav .menu-trigger span:before,
.header-area .main-nav .menu-trigger span:after {
  -moz-transition: all 0.4s;
  -o-transition: all 0.4s;
  -webkit-transition: all 0.4s;
  transition: all 0.4s;
  background-color: #1e1e1e;
  display: block;
  position: absolute;
  width: 30px;
  height: 2px;
  left: 0;
  width: 75%;
}

.background-header .main-nav .menu-trigger span:before,
.background-header .main-nav .menu-trigger span:after {
  background-color: #1e1e1e;
}

.header-area .main-nav .menu-trigger span:before,
.header-area .main-nav .menu-trigger span:after {
  content: "";
}

.header-area .main-nav .menu-trigger span {
  top: 16px;
}

.header-area .main-nav .menu-trigger span:before {
  -moz-transform-origin: 33% 100%;
  -ms-transform-origin: 33% 100%;
  -webkit-transform-origin: 33% 100%;
  transform-origin: 33% 100%;
  top: -10px;
  z-index: 10;
}

.header-area .main-nav .menu-trigger span:after {
  -moz-transform-origin: 33% 0;
  -ms-transform-origin: 33% 0;
  -webkit-transform-origin: 33% 0;
  transform-origin: 33% 0;
  top: 10px;
}

.header-area .main-nav .menu-trigger.active span,
.header-area .main-nav .menu-trigger.active span:before,
.header-area .main-nav .menu-trigger.active span:after {
  background-color: transparent;
  width: 100%;
}

.header-area .main-nav .menu-trigger.active span:before {
  -moz-transform: translateY(6px) translateX(1px) rotate(45deg);
  -ms-transform: translateY(6px) translateX(1px) rotate(45deg);
  -webkit-transform: translateY(6px) translateX(1px) rotate(45deg);
  transform: translateY(6px) translateX(1px) rotate(45deg);
  background-color: #1e1e1e;
}

.background-header .main-nav .menu-trigger.active span:before {
  background-color: #1e1e1e;
}

.header-area .main-nav .menu-trigger.active span:after {
  -moz-transform: translateY(-6px) translateX(1px) rotate(-45deg);
  -ms-transform: translateY(-6px) translateX(1px) rotate(-45deg);
  -webkit-transform: translateY(-6px) translateX(1px) rotate(-45deg);
  transform: translateY(-6px) translateX(1px) rotate(-45deg);
  background-color: #1e1e1e;
}

.background-header .main-nav .menu-trigger.active span:after {
  background-color: #1e1e1e;
}

.header-area.header-sticky {
  min-height: 80px;
}

.header-area.header-sticky .nav {
  margin-top: 20px !important;
}

.header-area.header-sticky .nav li a.active {
  color: #4EBCFF;
}

@media (max-width: 1200px) {
  .header-area .main-nav .nav li {
    padding-left: 12px;
    padding-right: 12px;
  }
  .header-area .main-nav:before {
    display: none;
  }
}

@media (max-width: 767px) {
  .header-area .main-nav .logo {
    color: #1e1e1e;
  }
  .header-area.header-sticky .nav li a:hover,
  .header-area.header-sticky .nav li a.active {
    color: #4EBCFF!important;
    opacity: 1;
  }
  .header-area {
    background-color: #f7f7f7;
    padding: 0px 15px;
    height: 80px;
    box-shadow: none;
    text-align: center;
  }
  .header-area .container {
    padding: 0px;
  }
  .header-area .logo {
    margin-left: 30px;
  }
  .header-area .menu-trigger {
    display: block !important;
  }
  .header-area .main-nav {
    overflow: hidden;
  }
  .header-area .main-nav .nav {
    float: none;
    width: 100%;
    display: none;
    -webkit-transition: all 0s ease 0s;
    -moz-transition: all 0s ease 0s;
    -o-transition: all 0s ease 0s;
    transition: all 0s ease 0s;
    margin-left: 0px;
  }
  .header-area .main-nav .nav li:first-child {
    border-top: 1px solid #eee;
  }
  .header-area .main-nav .nav li:last-child {
    width: 100%;
    background-color: #4EBCFF;
    color: #fff;
  }
  .header-area .main-nav .nav li:last-child a {
    background-color: #4EBCFF!important;
  }
  .header-area .main-nav .nav li:last-child a:hover,
  .header-area .main-nav .nav li:last-child:hover a {
    background-color: #4EBCFF!important;
    color: #fff!important;
  }
  .header-area.header-sticky .nav {
    margin-top: 80px !important;
  }
  .header-area .main-nav .nav li {
    width: 100%;
    background: #fff;
    border-bottom: 1px solid #eee;
    padding-left: 0px !important;
    padding-right: 0px !important;
  }
  .header-area .main-nav .nav li a {
    height: 50px !important;
    line-height: 50px !important;
    padding: 0px !important;
    border: none !important;
    background: #f7f7f7 !important;
    color: #232d39 !important;
  }
  .header-area .main-nav .nav li:last-child a {
    color: #fff!important;
  }
  .header-area .main-nav .nav li a:hover {
    background: #eee !important;
    color: #4EBCFF!important;
  }
  .header-area .main-nav .nav li.submenu ul {
    position: relative;
    visibility: inherit;
    opacity: 1;
    z-index: 1;
    transform: translateY(0%);
    transition-delay: 0s, 0s, 0.3s;
    top: 0px;
    width: 100%;
    box-shadow: none;
    height: 0px;
  }
  .header-area .main-nav .nav li.submenu ul li a {
    font-size: 12px;
    font-weight: 400;
  }
  .header-area .main-nav .nav li.submenu ul li a:hover:before {
    width: 0px;
  }
  .header-area .main-nav .nav li.submenu ul.active {
    height: auto !important;
  }
  .header-area .main-nav .nav li.submenu:after {
    color: #3B566E;
    right: 25px;
    font-size: 14px;
    top: 15px;
  }
  .header-area .main-nav .nav li.submenu:hover ul, .header-area .main-nav .nav li.submenu:focus ul {
    height: 0px;
  }
}

@media (min-width: 767px) {
  .header-area .main-nav .nav {
    display: flex !important;
  }
}


/* 
---------------------------------------------
banner
--------------------------------------------- 
*/

.main-banner {
  position: relative;
}

#bg-video {
    min-width: 100%;
    min-height: 100vh;
    max-width: 100%;
    max-height: 100vh;
    object-fit: cover;
    z-index: -1;
}

#bg-video::-webkit-media-controls {
    display: none !important;
}

.video-overlay {
    position: absolute;
    background-color: rgba(35,45,57,0.8);
    top: 0;
    left: 0;
    bottom: 7px;
    width: 100%;
}

.main-banner .caption {
  text-align: center;
  position: absolute;
  width: 80%;
  left: 50%;
  top: 50%;
  transform: translate(-50%,-50%);
}

.main-banner .caption h6 {
  margin-top: 0px;
  font-size: 18px;
  text-transform: uppercase;
  font-weight: 800;
  color: #fff;
  letter-spacing: 0.5px;
}

.main-banner .caption h1 {
  margin-top: 30px;
  margin-bottom: 25px;
  font-size: 84px;
  text-transform: uppercase;
  font-weight: 800;
  color: #fff;
  letter-spacing: 1px;
}

.main-banner .caption h1 em {
  font-style: normal;
  color: #4EBCFF;
  font-weight: 900;
}





/* 
---------------------------------------------
footer
--------------------------------------------- 
*/
footer {
  text-align: center;
  padding: 30px 0px;
}

footer p {
  color: #232d39;
  font-size: 13px;
}

footer p a {
  cursor: pointer;
  color: #4EBCFF;
}

footer p a:hover {
  color: #4EBCFF;
}



/* 
---------------------------------------------
preloader
--------------------------------------------- 
*/

.js-preloader {
    position: fixed;
    top: 0;
    left: 0;
    right: 0;
    bottom: 0;
    background-color: #232d39;
    display: -webkit-box;
    display: flex;
    -webkit-box-align: center;
    align-items: center;
    -webkit-box-pack: center;
    justify-content: center;
    opacity: 1;
    visibility: visible;
    z-index: 9999;
    -webkit-transition: opacity 0.25s ease;
    transition: opacity 0.25s ease;
}

.js-preloader.loaded {
    opacity: 0;
    visibility: hidden;
    pointer-events: none;
}

@-webkit-keyframes dot {
    50% {
        -webkit-transform: translateX(96px);
        transform: translateX(96px);
    }
}

@keyframes dot {
    50% {
        -webkit-transform: translateX(96px);
        transform: translateX(96px);
    }
}

@-webkit-keyframes dots {
    50% {
        -webkit-transform: translateX(-31px);
        transform: translateX(-31px);
    }
}

@keyframes dots {
    50% {
        -webkit-transform: translateX(-31px);
        transform: translateX(-31px);
    }
}

.preloader-inner {
    position: relative;
    width: 142px;
    height: 40px;
    background: #232d39;
}

.preloader-inner .dot {
    position: absolute;
    width: 16px;
    height: 16px;
    top: 12px;
    left: 15px;
    background: #fff;
    border-radius: 50%;
    -webkit-transform: translateX(0);
    transform: translateX(0);
    -webkit-animation: dot 2.8s infinite;
    animation: dot 2.8s infinite;
}

.preloader-inner .dots {
    -webkit-transform: translateX(0);
    transform: translateX(0);
    margin-top: 12px;
    margin-left: 31px;
    -webkit-animation: dots 2.8s infinite;
    animation: dots 2.8s infinite;
}

.preloader-inner .dots span {
    display: block;
    float: left;
    width: 16px;
    height: 16px;
    margin-left: 16px;
    background: #fff;
    border-radius: 50%;
}


/* 
---------------------------------------------
responsive
--------------------------------------------- 
*/


@media (max-width: 992px) {

  .main-banner .caption h2 {
    font-size: 64px;
  }
  

}


 </style>
    </head>
    
    <body>
    
       <!-- ***** Header Area Start ***** -->
    <header class="header-area header-sticky">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <nav class="main-nav">
                        <!-- ***** Logo Start ***** -->
                        <a href="index.html" class="logo"><em>Parking PI</em></a>
                        <!-- ***** Logo End ***** -->
                        <!-- ***** Menu Start ***** -->
                        <ul class="nav">
                            <li class="scroll-to-section"><a href="#" class="active">Home</a></li>
                             
                            <li class="main-button"><a href="logout">Signout</a></li>
                            
                        </ul>        
                        <a class='menu-trigger'>
                            <span>Menu</span>
                        </a>
                        <!-- ***** Menu End ***** -->
                    </nav>
                </div>	
            </div>
        </div>
    </header>
    <!-- ***** Header Area End ***** -->

    <!-- ***** Main Banner Area Start ***** -->
    
   
    <script type="text/javascript" src = "/carparking/src/main/webapp/WEB-INF/jsp/jquery-2.1.0.min.js"></script>
    <script type="text/javascript" src="/carparking/src/main/webapp/WEB-INF/jsp/bootstrap.min.js"></script>

    <script type="text/javascript" src="/carparking/src/main/webapp/WEB-INF/jsp/scrollreveal.min.js"></script>
    <script type="text/javascript" src="/carparking/src/main/webapp/WEB-INF/jsp/jquery.counterup.min.js"></script>
    
    <script type="text/javascript" src="/carparking/src/main/webapp/WEB-INF/jsp/custom.js"></script>
    
    </body>
    </html>