<#include "./fragments/_header.ftl"> 
	<!-- list container -->
	<div class="breadcrumb">
		<div class="xm-container">
			<a href="#">新闻中心</a><i>/</i><span>媒体聚焦</span>
		</div>
	</div>
	<div class="list-container">
		<div class="list-main">
			<div class="list-mian-nav">
				<h4 class="list-nav-title">新闻中心</h4>
				<ul class="list-nav-list">
					<li><a href="./media.html">媒体看厦心</a></li>
					<li class="active"><a href="./list-news.html">医院新闻</a></li>
					<li><a href="./video.html">影像厦心</a></li>
					<li><a href="./news-paper.html">电子院报</a></li>
				</ul>
			</div>
      <div class="partRight">
        <div class="title01">科室简介</div>
        <div id="DIVContent" class="article intro">
          <p>${dept.intro}</p>
          <p><br></p>
          <h3>
            <strong>专科亚专业及发展方向：</strong>
          </h3>
        </div>
        <div class="clear"></div>
      </div>
		</div>
	</div>
<#include "./fragments/_footer.ftl">
