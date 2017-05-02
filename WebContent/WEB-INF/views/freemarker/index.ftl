<#assign base=request.contextPath />
<#include "/common/baseList.ftl"/>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Nero的个人博客</title>
		<meta name="keywords" content="个人博客" />
		<meta http-equiv="content-type" content="text/html;charset=utf-8">
		<!-- <link href="${base}/resources/css/styles.css" rel="stylesheet">
		<link href="${base}/resources/css/animation.css" rel="stylesheet">
		返回顶部调用 begin
		<link href="${base}/resources/css/lrtk.css" rel="stylesheet" />
		<script type="text/javascript" src="${base}/resources/js/jquery.js"></script>
		<script type="text/javascript" src="${base}/resources/js/js.js"></script>
		返回顶部调用 end -->
		<!--[if lt IE 9]>
		<script src="js/modernizr.js"></script>
		<![endif]-->
	</head>
	<body>
		<header>
		  <nav id="nav">
		    <ul>
		      <li><a href="${base}/index.htm" >网站首页</a></li>
		      <li><a href="/book/" target="_blank" title="图书推荐">图书推荐</a></li>
		      <li><a href="/web/" target="_blank" title="网站建设">网站建设</a></li>
		      <li><a href="/newshtml5/" target="_blank" title="HTML5 / CSS3">HTML5 / CSS3</a></li>
		      <li><a href="/jstt/" target="_blank" title="技术探讨">技术探讨</a></li>
		      <li><a href="/news/s/" target="_blank" title="慢生活">慢生活</a></li>
		      <li><a href="/newstalk/" target="_blank" title="碎言碎语">碎言碎语</a></li>
		    </ul>
		    <script src="${base}/resources/js/silder.js"></script><!--获取当前页导航 高亮显示标题--> 
		  </nav>
		</header>
		<!--header end-->
		<div id="mainbody">
		  <div class="info">
		    <figure> <img src="${base}/resources/images/art.jpg"  alt="Panama Hat">
		      <figcaption><strong>渡人如渡己，渡已，亦是渡</strong> 当我们被误解时，会花很多时间去辩白。 但没有用，没人愿意听，大家习惯按自己的所闻、理解做出判别，每个人其实都很固执。与其努力且痛苦的试图扭转别人的评判，不如默默承受，给大家多一点时间和空间去了解。而我们省下辩解的功夫，去实现自身更久远的人生价值。其实，渡人如渡己，渡已，亦是渡人。</figcaption>
		    </figure>
		    <div class="card">
		      <h1>我的名片</h1>
		      <p>网名：Nero&nbsp;|&nbsp;落夙</p>
		      <p>职业：Java开发、网页制作</p>
		      <p>QQ：513568316</p>
		      <p>Email：evenero@163.com</p>
		      <ul class="linkmore">
		        <li><a href="http://wpa.qq.com/msgrd?v=3&uin=513568316&site=qq&menu=yes" class="talk" title="给我留言"></a></li>
		        <li><a href="/" class="address" title="联系地址"></a></li>
		        <li><a href="/" class="email" title="给我写信"></a></li>
		        <li><a href="/" class="photos" title="生活照片"></a></li>
		        <li><a href="/" class="heart" title="关注我"></a></li>
		      </ul>
		    </div>
		  </div>
		  <!--info end-->
		  <div class="blank"></div>
		  <div class="blogs">
		    <ul class="bloglist">
		      <#list articles as article>
		      <li>
		        <div class="arrow_box">
		          <div class="ti"></div>
		          <!--三角形-->
		          <div class="ci"></div>
		          <!--圆形-->
		          <h2 class="title"><a href="${base}/article.htm?id=${article.id}" target="_blank">${article.title}</a></h2>
		          <ul class="textinfo">
		            <a href="${base}/article.htm?id=${article.id}"><img src="${article.imgUrl}"></a>
		            <#if article.content?length gt 130>
		            	${article.content?substring(0,130)+"..."+"</p>"}
		            <#else>
		            	${article.content}
		            </#if>
		          </ul>
		          <ul class="details">
		            <li class="likes"><a href="javascript:void(0)">${article.likes}</a></li>
		            <li class="comments"><a href="javascript:void(0)">${article.comments?size}</a></li>
		            <li class="icon-time"><a href="javascript:void(0)">发表时间:${article.createTime?string("yyyy-MM-dd")}</a>&nbsp;&nbsp;<a href="javascript:void(0)">最后更新:${article.updateTime?string("yyyy-MM-dd")}</a></li>
		          </ul>
		        </div>
		        <!--arrow_box end--> 
		      </li>
		      </#list>
		    </ul>
		    <!--bloglist end-->
		    <aside>
		      <div class="tuijian">
		        <h2>推荐文章</h2>
		        <ol>
		          <li><span><strong>1</strong></span><a href="/">有一种思念，是淡淡的幸福,一个心情一行文字</a></li>
		          <li><span><strong>2</strong></span><a href="/">励志人生-要做一个潇洒的女人</a></li>
		          <li><span><strong>3</strong></span><a href="/">女孩都有浪漫的小情怀——浪漫的求婚词</a></li>
		          <li><span><strong>4</strong></span><a href="/">Green绿色小清新的夏天-个人博客模板</a></li>
		          <li><span><strong>5</strong></span><a href="/">女生清新个人博客网站模板</a></li>
		          <li><span><strong>6</strong></span><a href="/">Wedding-婚礼主题、情人节网站模板</a></li>
		        </ol>
		      </div>
		      <div class="toppic">
		        <h2>图文并茂</h2>
		        <ul>
		          <li><a href="/"><img src="${base}/resources/images/k01.jpg">腐女不可怕，就怕腐女会画画！
		            <p>伤不起</p>
		            </a></li>
		          <li><a href="/"><img src="${base}/resources/images/k02.jpg">问前任，你还爱我吗？无限戳中泪点~
		            <p>感兴趣</p>
		            </a></li>
		        </ul>
		      </div>
		      <div class="clicks">
		        <h2>热门点击</h2>
		        <ol>
		          <li><span><a href="/">慢生活</a></span><a href="/">有一种思念，是淡淡的幸福,一个心情一行文字</a></li>
		          <li><span><a href="/">爱情美文</a></span><a href="/">励志人生-要做一个潇洒的女人</a></li>
		          <li><span><a href="/">慢生活</a></span><a href="/">女孩都有浪漫的小情怀——浪漫的求婚词</a></li>
		          <li><span><a href="/">博客模板</a></span><a href="/">Green绿色小清新的夏天-个人博客模板</a></li>
		          <li><span><a href="/">女生个人博客</a></span><a href="/">女生清新个人博客网站模板</a></li>
		          <li><span><a href="/">Wedding</a></span><a href="/">Wedding-婚礼主题、情人节网站模板</a></li>
		        </ol>
		      </div>
		      <div class="search">
		        <form class="searchform" method="get" action="#">
		          <input type="text" name="s" value="Search" onfocus="this.value=''" onblur="this.value='Search'">
		        </form>
		      </div>
		      <div class="viny">
		        <dl>
		          <dt class="art"><img src="${base}/resources/images/artwork.png" alt="专辑"></dt>
		          <dd class="icon-song"><span></span>南方姑娘</dd>
		          <dd class="icon-artist"><span></span>歌手：赵雷</dd>
		          <dd class="icon-album"><span></span>所属专辑：《赵小雷》</dd>
		          <dd class="icon-like"><span></span><a href="/">喜欢</a></dd>
		          <dd class="music">
		            <audio src="${base}/resources/images/nf.mp3" controls></audio>
		          </dd>
		          <!--也可以添加loop属性 音频加载到末尾时，会重新播放-->
		        </dl>
		      </div>
		    </aside>
		  </div>
		  <!--blogs end--> 
		</div>
		<!--mainbody end-->
		<footer>
		  <div class="footer-mid">
		    <div class="links">
		      <h2>友情链接</h2>
		      <ul>
		        <li><a href="/">杨青个人博客</a></li>
		        <li><a href="http://www.3dst.com">3DST技术服务中心</a></li>
		      </ul>
		    </div>
		    <div class="visitors">
		      <h2>最新评论</h2>
		      <dl>
		        <dt><img src="${base}/resources/images/s8.jpg">
		        <dt>
		        <dd>DanceSmile
		          <time>49分钟前</time>
		        </dd>
		        <dd>在 <a href="http://www.yangqq.com/jstt/bj/2013-07-28/530.html" class="title">如果要学习web前端开发，需要学习什么？ </a>中评论：</dd>
		        <dd>文章非常详细，我很喜欢.前端的工程师很少，我记得几年前yahoo花高薪招聘前端也招不到</dd>
		      </dl>
		    </div>
		    <section class="flickr">
		      <h2>摄影作品</h2>
		      <ul>
		        <li><a href="/"><img src="${base}/resources/images/01.jpg"></a></li>
		        <li><a href="/"><img src="${base}/resources/images/02.jpg"></a></li>
		        <li><a href="/"><img src="${base}/resources/images/03.jpg"></a></li>
		      </ul>
		    </section>
		  </div>
		  <div class="footer-bottom">
		    <p>Copyright 2013 Design by <a href="http://www.yangqq.com">DanceSmile</a></p>
		  </div>
		</footer>
		<!-- jQuery仿腾讯回顶部和建议 代码开始 -->
		<div id="tbox"><a id="togbook" href="/e/tool/gbook/?bid=1"></a> <a id="gotop" href="javascript:void(0)"></a> </div>
		<!-- 代码结束 -->
	</body>
</html>