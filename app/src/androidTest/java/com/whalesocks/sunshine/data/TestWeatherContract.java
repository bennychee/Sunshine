


<!DOCTYPE html>
<html lang="en" class=" is-copy-enabled">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    <meta name="viewport" content="width=1020">
    
    
    <title>Sunshine-Version-2/TestWeatherContract.java at lesson_4_content_provider_starter_code · udacity/Sunshine-Version-2</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="udacity/Sunshine-Version-2" name="twitter:title" /><meta content="Sunshine-Version-2 - The official repository for Developing Android Apps" name="twitter:description" /><meta content="https://avatars3.githubusercontent.com/u/1916665?v=3&amp;s=400" name="twitter:image:src" />
      <meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars3.githubusercontent.com/u/1916665?v=3&amp;s=400" property="og:image" /><meta content="udacity/Sunshine-Version-2" property="og:title" /><meta content="https://github.com/udacity/Sunshine-Version-2" property="og:url" /><meta content="Sunshine-Version-2 - The official repository for Developing Android Apps" property="og:description" />
      <meta name="browser-stats-url" content="https://api.github.com/_private/browser/stats">
    <meta name="browser-errors-url" content="https://api.github.com/_private/browser/errors">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="web-socket" href="wss://live.github.com/_sockets/NzE0NjQ3OjQ1MWQ5NDU4ZmY1OWNkZDcyYTVlZjU0ZDEyZjk2NjFmOjhmZTk4Yjk3ZDhmNGMxMjc2YmU1YWMwZTNmNWE5NDQ3MTlmNTM4Y2ZjNzVjNDMxZDE0ZjdkOTMzNDg1ZGU5M2Y=--5c7f8566fe1d65bfd915ebe174cbe935a0870119">
    <meta name="pjax-timeout" content="1000">
    <link rel="sudo-modal" href="/sessions/sudo_modal">

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>

        <meta name="google-analytics" content="UA-3769691-2">

    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="A145CF14:6BF2:DC9A69A:559F38AB" name="octolytics-dimension-request_id" /><meta content="714647" name="octolytics-actor-id" /><meta content="bennychee" name="octolytics-actor-login" /><meta content="c54522b7a5ec83a7dcafe9470182342464cbaa5361d2e030f338dd51a2de83bc" name="octolytics-actor-hash" />
    
    <meta content="Rails, view, blob#show" data-pjax-transient="true" name="analytics-event" />
    <meta class="js-ga-set" name="dimension1" content="Logged In">
    <meta name="is-dotcom" content="true">
      <meta name="hostname" content="github.com">
    <meta name="user-login" content="bennychee">

      <link rel="icon" sizes="any" mask href="https://assets-cdn.github.com/pinned-octocat.svg">
      <meta name="theme-color" content="#4078c0">
      <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">


    <meta content="authenticity_token" name="csrf-param" />
<meta content="ZeDpDTa5YXokdPMUPNYQ9QlY0qtdFBDJA2jqxW4EzwAYnU2zTl+ljiMPPkA6JV/bPN64MQLocn6XTi8iSWmIig==" name="csrf-token" />

    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github/index-507b4f74c65565efec0273ea4338465df92b14c967ae71c2bda03dd97946b558.css" media="all" rel="stylesheet" />
    <link crossorigin="anonymous" href="https://assets-cdn.github.com/assets/github2/index-2fbdf789628902fbbde900bfd0bfac0a84ff4cb621212947ebd095670a064df1.css" media="all" rel="stylesheet" />
    
    


    <meta http-equiv="x-pjax-version" content="a2c1798ffc62750a8be458bef8b5e86b">

      
  <meta name="description" content="Sunshine-Version-2 - The official repository for Developing Android Apps">
  <meta name="go-import" content="github.com/udacity/Sunshine-Version-2 git https://github.com/udacity/Sunshine-Version-2.git">

  <meta content="1916665" name="octolytics-dimension-user_id" /><meta content="udacity" name="octolytics-dimension-user_login" /><meta content="31690108" name="octolytics-dimension-repository_id" /><meta content="udacity/Sunshine-Version-2" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="31690108" name="octolytics-dimension-repository_network_root_id" /><meta content="udacity/Sunshine-Version-2" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/udacity/Sunshine-Version-2/commits/lesson_4_content_provider_starter_code.atom" rel="alternate" title="Recent Commits to Sunshine-Version-2:lesson_4_content_provider_starter_code" type="application/atom+xml">

  </head>


  <body class="logged_in  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      



        <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" data-ga-click="Header, go to dashboard, icon:logo">
  <span class="mega-octicon octicon-mark-github"></span>
</a>


      <div class="site-search repo-scope js-site-search" role="search">
          <form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/udacity/Sunshine-Version-2/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <label class="js-chromeless-input-container form-control">
    <div class="scope-badge">This repository</div>
    <input type="text"
      class="js-site-search-focus js-site-search-field is-clearable chromeless-input"
      data-hotkey="s"
      name="q"
      placeholder="Search"
      data-global-scope-placeholder="Search GitHub"
      data-repo-scope-placeholder="Search"
      tabindex="1"
      autocapitalize="off">
  </label>
</form>
      </div>

      <ul class="header-nav left" role="navigation">
        <li class="header-nav-item">
          <a href="/pulls" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:pulls context:user" data-hotkey="g p" data-selected-links="/pulls /pulls/assigned /pulls/mentioned /pulls">
            Pull requests
</a>        </li>
        <li class="header-nav-item">
          <a href="/issues" class="js-selected-navigation-item header-nav-link" data-ga-click="Header, click, Nav menu - item:issues context:user" data-hotkey="g i" data-selected-links="/issues /issues/assigned /issues/mentioned /issues">
            Issues
</a>        </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
      </ul>

    
<ul class="header-nav user-nav right" id="user-links">
  <li class="header-nav-item">
      <span class="js-socket-channel js-updatable-content"
        data-channel="notification-changed:bennychee"
        data-url="/notifications/header">
      <a href="/udacity/Sunshine-Version-2/notifications" aria-label="You have unread notifications in this repository" class="header-nav-link notification-indicator tooltipped tooltipped-s" data-ga-click="Header, go to notifications, icon:unread" data-hotkey="g n">
          <span class="mail-status unread"></span>
          <span class="octicon octicon-inbox"></span>
</a>  </span>

  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link tooltipped tooltipped-s js-menu-target" href="/new"
       aria-label="Create new..."
       data-ga-click="Header, create new, icon:add">
      <span class="octicon octicon-plus left"></span>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <ul class="dropdown-menu dropdown-menu-sw">
        
<a class="dropdown-item" href="/new" data-ga-click="Header, create new repository">
  New repository
</a>


  <a class="dropdown-item" href="/organizations/new" data-ga-click="Header, create new organization">
    New organization
  </a>



  <div class="dropdown-divider"></div>
  <div class="dropdown-header">
    <span title="udacity/Sunshine-Version-2">This repository</span>
  </div>
    <a class="dropdown-item" href="/udacity/Sunshine-Version-2/issues/new" data-ga-click="Header, create new issue">
      New issue
    </a>

      </ul>
    </div>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name tooltipped tooltipped-s js-menu-target" href="/bennychee"
       aria-label="View profile and more"
       data-ga-click="Header, show menu, icon:avatar">
      <img alt="@bennychee" class="avatar" height="20" src="https://avatars1.githubusercontent.com/u/714647?v=3&amp;s=40" width="20" />
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      <div class="dropdown-menu dropdown-menu-sw">
        <div class="dropdown-header header-nav-current-user css-truncate">
          Signed in as <strong class="css-truncate-target">bennychee</strong>
        </div>
        <div class="dropdown-divider"></div>

        <a class="dropdown-item" href="/bennychee" data-ga-click="Header, go to profile, text:your profile">
          Your profile
        </a>
        <a class="dropdown-item" href="/stars" data-ga-click="Header, go to starred repos, text:your stars">
          Your stars
        </a>
        <a class="dropdown-item" href="/explore" data-ga-click="Header, go to explore, text:explore">
          Explore
        </a>
        <a class="dropdown-item" href="https://help.github.com" data-ga-click="Header, go to help, text:help">
          Help
        </a>
        <div class="dropdown-divider"></div>

        <a class="dropdown-item" href="/settings/profile" data-ga-click="Header, go to settings, icon:settings">
          Settings
        </a>

        <form accept-charset="UTF-8" action="/logout" class="logout-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="CSq4kNKS0HVlPWEUZvOarMwBN7zUaahIkyYlM9hBeXZRdLdEyh5E/i6LVMv6xEfVZAHbobukb5HPdME37/bbyw==" /></div>
          <button class="dropdown-item dropdown-signout" data-ga-click="Header, sign out, icon:logout">
            Sign out
          </button>
</form>      </div>
    </div>
  </li>
</ul>


    
  </div>
</div>

        

        


      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    <div id="js-flash-container">
      
    </div>
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">

        
<ul class="pagehead-actions">

  <li>
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="ck5/tNgqcBL16CH53BJSVSRGnteQZ1wy+9S/1yspotnii//jzt7I0NdT2ehGFs9R36CE4dnNDyTMMY7yYoHblQ==" /></div>    <input id="repository_id" name="repository_id" type="hidden" value="31690108" />

      <div class="select-menu js-menu-container js-select-menu">
        <a href="/udacity/Sunshine-Version-2/subscription"
          class="btn btn-sm btn-with-count select-menu-button js-menu-target" role="button" tabindex="0" aria-haspopup="true"
          data-ga-click="Repository, click Watch settings, action:blob#show">
          <span class="js-select-button">
            <span class="octicon octicon-eye"></span>
            Unwatch
          </span>
        </a>
        <a class="social-count js-social-count" href="/udacity/Sunshine-Version-2/watchers">
          219
        </a>

        <div class="select-menu-modal-holder">
          <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
            <div class="select-menu-header">
              <span class="select-menu-title">Notifications</span>
              <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
            </div>

            <div class="select-menu-list js-navigation-container" role="menu">

              <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input id="do_included" name="do" type="radio" value="included" />
                  <span class="select-menu-item-heading">Not watching</span>
                  <span class="description">Be notified when participating or @mentioned.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-eye"></span>
                    Watch
                  </span>
                </div>
              </div>

              <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
                  <span class="select-menu-item-heading">Watching</span>
                  <span class="description">Be notified of all conversations.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-eye"></span>
                    Unwatch
                  </span>
                </div>
              </div>

              <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
                <span class="select-menu-item-icon octicon octicon-check"></span>
                <div class="select-menu-item-text">
                  <input id="do_ignore" name="do" type="radio" value="ignore" />
                  <span class="select-menu-item-heading">Ignoring</span>
                  <span class="description">Never be notified.</span>
                  <span class="js-select-button-text hidden-select-button-text">
                    <span class="octicon octicon-mute"></span>
                    Stop ignoring
                  </span>
                </div>
              </div>

            </div>

          </div>
        </div>
      </div>
</form>
  </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container ">

    <form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/unstar" class="js-toggler-form starred js-unstar-button" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="fM2/W8vuavYkuzTvuSMcKfK818xSn0uGHDlA+spMhz22U0Mb1eugm4jsfZM4+vMSiIOCpEFfwpl1JYXNzh6Fcw==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Unstar this repository" title="Unstar udacity/Sunshine-Version-2"
        data-ga-click="Repository, click unstar button, action:blob#show; text:Unstar">
        <span class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/udacity/Sunshine-Version-2/stargazers">
          600
        </a>
</form>
    <form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/star" class="js-toggler-form unstarred js-star-button" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="ngFK2sM+HTqbobHQPtqQGH0gXA5XkPC09v/uWEnE7M0UTq1m8oOsJP9oB9CkDPfh5BOMKH17h8ZedyjuFyz7rw==" /></div>
      <button
        class="btn btn-sm btn-with-count js-toggler-target"
        aria-label="Star this repository" title="Star udacity/Sunshine-Version-2"
        data-ga-click="Repository, click star button, action:blob#show; text:Star">
        <span class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/udacity/Sunshine-Version-2/stargazers">
          600
        </a>
</form>  </div>

  </li>

        <li>
          <a href="#fork-destination-box" class="btn btn-sm btn-with-count"
              title="Fork your own copy of udacity/Sunshine-Version-2 to your account"
              aria-label="Fork your own copy of udacity/Sunshine-Version-2 to your account"
              rel="facebox"
              data-ga-click="Repository, show fork modal, action:blob#show; text:Fork">
            <span class="octicon octicon-repo-forked"></span>
            Fork
          </a>
          <a href="/udacity/Sunshine-Version-2/network" class="social-count">993</a>

          <div id="fork-destination-box" style="display: none;">
            <h2 class="facebox-header">Where should we fork this repository?</h2>
            <include-fragment src=""
                class="js-fork-select-fragment fork-select-fragment"
                data-url="/udacity/Sunshine-Version-2/fork?fragment=1">
              <img alt="Loading" height="64" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-128.gif" width="64" />
            </include-fragment>
          </div>
        </li>

</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="mega-octicon octicon-repo"></span>
          <span class="author"><a href="/udacity" class="url fn" itemprop="url" rel="author"><span itemprop="title">udacity</span></a></span><!--
       --><span class="path-divider">/</span><!--
       --><strong><a href="/udacity/Sunshine-Version-2" data-pjax="#js-repo-pjax-container">Sunshine-Version-2</a></strong>

          <span class="page-context-loader">
            <img alt="" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            
<nav class="sunken-menu repo-nav js-repo-nav js-sidenav-container-pjax js-octicon-loaders"
     role="navigation"
     data-pjax="#js-repo-pjax-container"
     data-issue-count-url="/udacity/Sunshine-Version-2/issues/counts">
  <ul class="sunken-menu-group">
    <li class="tooltipped tooltipped-w" aria-label="Code">
      <a href="/udacity/Sunshine-Version-2/tree/lesson_4_content_provider_starter_code" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /udacity/Sunshine-Version-2/tree/lesson_4_content_provider_starter_code">
        <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Issues">
        <a href="/udacity/Sunshine-Version-2/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /udacity/Sunshine-Version-2/issues">
          <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
          <span class="js-issue-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

    <li class="tooltipped tooltipped-w" aria-label="Pull requests">
      <a href="/udacity/Sunshine-Version-2/pulls" aria-label="Pull requests" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g p" data-selected-links="repo_pulls /udacity/Sunshine-Version-2/pulls">
          <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull requests</span>
          <span class="js-pull-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Wiki">
        <a href="/udacity/Sunshine-Version-2/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g w" data-selected-links="repo_wiki /udacity/Sunshine-Version-2/wiki">
          <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
  </ul>
  <div class="sunken-menu-separator"></div>
  <ul class="sunken-menu-group">

    <li class="tooltipped tooltipped-w" aria-label="Pulse">
      <a href="/udacity/Sunshine-Version-2/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-selected-links="pulse /udacity/Sunshine-Version-2/pulse">
        <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>

    <li class="tooltipped tooltipped-w" aria-label="Graphs">
      <a href="/udacity/Sunshine-Version-2/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-selected-links="repo_graphs repo_contributors /udacity/Sunshine-Version-2/graphs">
        <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>    </li>
  </ul>


</nav>

              <div class="only-with-full-nav">
                  
<div class="js-clone-url clone-url open"
  data-protocol-type="http">
  <h3><span class="text-emphasized">HTTPS</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/udacity/Sunshine-Version-2.git" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="js-clone-url clone-url "
  data-protocol-type="ssh">
  <h3><span class="text-emphasized">SSH</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="git@github.com:udacity/Sunshine-Version-2.git" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="js-clone-url clone-url "
  data-protocol-type="subversion">
  <h3><span class="text-emphasized">Subversion</span> checkout URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/udacity/Sunshine-Version-2" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>



<div class="clone-options">You can clone with
  <form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone" class="inline-form js-clone-selector-form is-enabled" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="zSOUI6IJWG9cGhg3ifn08uRLQx9O/KcZMFWgirTl8+vw+5l3TrXQjZIGZQfAyPsim/wrgEO36UTDG1edDIuQTA==" /></div><button class="btn-link js-clone-selector" data-protocol="http" type="submit">HTTPS</button></form>, <form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone" class="inline-form js-clone-selector-form is-enabled" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="Y+CHRSkmw+AcwQ7xuO3s4QO5k/dtwGVofAyLkM5F0TP3Na7bUB+eb/lz/bXFjMaobz+1prmKGAcjc0zqBbFwdg==" /></div><button class="btn-link js-clone-selector" data-protocol="ssh" type="submit">SSH</button></form>, or <form accept-charset="UTF-8" action="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone" class="inline-form js-clone-selector-form is-enabled" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="lhpr3ytRpsjz2c0znB5kjmZlLsZuNKWH9PH2meZmtcbdUvbD3Xo1xKTj+jmY/Q0Ck6KNGcFedD4HqjROFuB60Q==" /></div><button class="btn-link js-clone-selector" data-protocol="subversion" type="submit">Subversion</button></form>.
  <a href="https://help.github.com/articles/which-remote-url-should-i-use" class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <span class="octicon octicon-question"></span>
  </a>
</div>


  <a href="github-windows://openRepo/https://github.com/udacity/Sunshine-Version-2" class="btn btn-sm sidebar-button" title="Save udacity/Sunshine-Version-2 to your computer and use it in GitHub Desktop." aria-label="Save udacity/Sunshine-Version-2 to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>


                <a href="/udacity/Sunshine-Version-2/archive/lesson_4_content_provider_starter_code.zip"
                   class="btn btn-sm sidebar-button"
                   aria-label="Download the contents of udacity/Sunshine-Version-2 as a zip file"
                   title="Download the contents of udacity/Sunshine-Version-2 as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>

          

<a href="/udacity/Sunshine-Version-2/blob/1578a360189e9e929004894ed3e8f2210b7db8a7/TestWeatherContract.java" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:fe7cd18ef07c54ae7256ec16cfffaef4 -->

<div class="file-navigation js-zeroclipboard-container">
  
<div class="select-menu js-menu-container js-select-menu left">
  <span class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    data-ref="lesson_4_content_provider_starter_code"
    title="lesson_4_content_provider_starter_code"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button css-truncate-target">lesson_4_conte…</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Filter branches/tags" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.01_hello_world/TestWeatherContract.java"
               data-name="1.01_hello_world"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.01_hello_world">
                1.01_hello_world
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.02_add_list_item_forecast_layout/TestWeatherContract.java"
               data-name="1.02_add_list_item_forecast_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.02_add_list_item_forecast_layout">
                1.02_add_list_item_forecast_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.03_update_fragment_layout/TestWeatherContract.java"
               data-name="1.03_update_fragment_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.03_update_fragment_layout">
                1.03_update_fragment_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.04_add_dummy_data/TestWeatherContract.java"
               data-name="1.04_add_dummy_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.04_add_dummy_data">
                1.04_add_dummy_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.05_create_arrayadapter/TestWeatherContract.java"
               data-name="1.05_create_arrayadapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.05_create_arrayadapter">
                1.05_create_arrayadapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/1.06_attach_adapter/TestWeatherContract.java"
               data-name="1.06_attach_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="1.06_attach_adapter">
                1.06_attach_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.01_add_network_code/TestWeatherContract.java"
               data-name="2.01_add_network_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.01_add_network_code">
                2.01_add_network_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.02_refactor_forecast_fragment/TestWeatherContract.java"
               data-name="2.02_refactor_forecast_fragment"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.02_refactor_forecast_fragment">
                2.02_refactor_forecast_fragment
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.03_add_refresh_xml/TestWeatherContract.java"
               data-name="2.03_add_refresh_xml"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.03_add_refresh_xml">
                2.03_add_refresh_xml
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.04_inflate_menu/TestWeatherContract.java"
               data-name="2.04_inflate_menu"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.04_inflate_menu">
                2.04_inflate_menu
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.05_execute_fetchweathertask/TestWeatherContract.java"
               data-name="2.05_execute_fetchweathertask"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.05_execute_fetchweathertask">
                2.05_execute_fetchweathertask
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.06_add_internet_permissions/TestWeatherContract.java"
               data-name="2.06_add_internet_permissions"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.06_add_internet_permissions">
                2.06_add_internet_permissions
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.07_build_url_with_params/TestWeatherContract.java"
               data-name="2.07_build_url_with_params"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.07_build_url_with_params">
                2.07_build_url_with_params
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.08_json_parsing/TestWeatherContract.java"
               data-name="2.08_json_parsing"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.08_json_parsing">
                2.08_json_parsing
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/2.09_display_data/TestWeatherContract.java"
               data-name="2.09_display_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="2.09_display_data">
                2.09_display_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.00_remove_logging/TestWeatherContract.java"
               data-name="3.00_remove_logging"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.00_remove_logging">
                3.00_remove_logging
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.01_add_toast/TestWeatherContract.java"
               data-name="3.01_add_toast"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.01_add_toast">
                3.01_add_toast
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.02_create_detail_activity/TestWeatherContract.java"
               data-name="3.02_create_detail_activity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.02_create_detail_activity">
                3.02_create_detail_activity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.03_launch_detail_activity/TestWeatherContract.java"
               data-name="3.03_launch_detail_activity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.03_launch_detail_activity">
                3.03_launch_detail_activity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.04_populate_detail_text/TestWeatherContract.java"
               data-name="3.04_populate_detail_text"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.04_populate_detail_text">
                3.04_populate_detail_text
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.05_add_settingsactivity/TestWeatherContract.java"
               data-name="3.05_add_settingsactivity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.05_add_settingsactivity">
                3.05_add_settingsactivity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.06_launch_settings/TestWeatherContract.java"
               data-name="3.06_launch_settings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.06_launch_settings">
                3.06_launch_settings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.07_add_locations_setting/TestWeatherContract.java"
               data-name="3.07_add_locations_setting"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.07_add_locations_setting">
                3.07_add_locations_setting
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.08_inflate_settingsactivity/TestWeatherContract.java"
               data-name="3.08_inflate_settingsactivity"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.08_inflate_settingsactivity">
                3.08_inflate_settingsactivity
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.09_location_from_prefs/TestWeatherContract.java"
               data-name="3.09_location_from_prefs"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.09_location_from_prefs">
                3.09_location_from_prefs
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.10_refactor_fetch_weather/TestWeatherContract.java"
               data-name="3.10_refactor_fetch_weather"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.10_refactor_fetch_weather">
                3.10_refactor_fetch_weather
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.11_add_units_setting/TestWeatherContract.java"
               data-name="3.11_add_units_setting"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.11_add_units_setting">
                3.11_add_units_setting
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.12_add_map_intent/TestWeatherContract.java"
               data-name="3.12_add_map_intent"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.12_add_map_intent">
                3.12_add_map_intent
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/3.13_add_share_action_provider/TestWeatherContract.java"
               data-name="3.13_add_share_action_provider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="3.13_add_share_action_provider">
                3.13_add_share_action_provider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.01_life_cycle/TestWeatherContract.java"
               data-name="4.01_life_cycle"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.01_life_cycle">
                4.01_life_cycle
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.02_start_code_for_lesson_4/TestWeatherContract.java"
               data-name="4.02_start_code_for_lesson_4"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.02_start_code_for_lesson_4">
                4.02_start_code_for_lesson_4
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.03_define_contract_constants/TestWeatherContract.java"
               data-name="4.03_define_contract_constants"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.03_define_contract_constants">
                4.03_define_contract_constants
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.04_location_database/TestWeatherContract.java"
               data-name="4.04_location_database"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.04_location_database">
                4.04_location_database
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.05_test_location_table/TestWeatherContract.java"
               data-name="4.05_test_location_table"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.05_test_location_table">
                4.05_test_location_table
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.06_test_weather_table/TestWeatherContract.java"
               data-name="4.06_test_weather_table"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.06_test_weather_table">
                4.06_test_weather_table
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.07_start_code_content_provider/TestWeatherContract.java"
               data-name="4.07_start_code_content_provider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.07_start_code_content_provider">
                4.07_start_code_content_provider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.08_uribuilder_weather_with_location/TestWeatherContract.java"
               data-name="4.08_uribuilder_weather_with_location"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.08_uribuilder_weather_with_location">
                4.08_uribuilder_weather_with_location
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.09_write_uri_matcher/TestWeatherContract.java"
               data-name="4.09_write_uri_matcher"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.09_write_uri_matcher">
                4.09_write_uri_matcher
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.10_register_contentprovider/TestWeatherContract.java"
               data-name="4.10_register_contentprovider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.10_register_contentprovider">
                4.10_register_contentprovider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.11_gettype/TestWeatherContract.java"
               data-name="4.11_gettype"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.11_gettype">
                4.11_gettype
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.12_query/TestWeatherContract.java"
               data-name="4.12_query"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.12_query">
                4.12_query
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.13_insert/TestWeatherContract.java"
               data-name="4.13_insert"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.13_insert">
                4.13_insert
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.14_update_delete/TestWeatherContract.java"
               data-name="4.14_update_delete"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.14_update_delete">
                4.14_update_delete
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.15_refactor_fetchweather/TestWeatherContract.java"
               data-name="4.15_refactor_fetchweather"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.15_refactor_fetchweather">
                4.15_refactor_fetchweather
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.16_use_contentprovider_inserts/TestWeatherContract.java"
               data-name="4.16_use_contentprovider_inserts"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.16_use_contentprovider_inserts">
                4.16_use_contentprovider_inserts
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.17_bulkinserts_with_contentprovider/TestWeatherContract.java"
               data-name="4.17_bulkinserts_with_contentprovider"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.17_bulkinserts_with_contentprovider">
                4.17_bulkinserts_with_contentprovider
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.18_cursor_adapter/TestWeatherContract.java"
               data-name="4.18_cursor_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.18_cursor_adapter">
                4.18_cursor_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.19_loaders/TestWeatherContract.java"
               data-name="4.19_loaders"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.19_loaders">
                4.19_loaders
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.20_projections/TestWeatherContract.java"
               data-name="4.20_projections"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.20_projections">
                4.20_projections
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.21_details_view/TestWeatherContract.java"
               data-name="4.21_details_view"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.21_details_view">
                4.21_details_view
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.22_fix_details_view/TestWeatherContract.java"
               data-name="4.22_fix_details_view"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.22_fix_details_view">
                4.22_fix_details_view
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/4.23_fix_settings/TestWeatherContract.java"
               data-name="4.23_fix_settings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="4.23_fix_settings">
                4.23_fix_settings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.01_build_list_item/TestWeatherContract.java"
               data-name="5.01_build_list_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.01_build_list_item">
                5.01_build_list_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.02_build_today_item/TestWeatherContract.java"
               data-name="5.02_build_today_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.02_build_today_item">
                5.02_build_today_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.03_update_forecast_adapter/TestWeatherContract.java"
               data-name="5.03_update_forecast_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.03_update_forecast_adapter">
                5.03_update_forecast_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.04_two_item_view_types/TestWeatherContract.java"
               data-name="5.04_two_item_view_types"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.04_two_item_view_types">
                5.04_two_item_view_types
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.05_viewholder/TestWeatherContract.java"
               data-name="5.05_viewholder"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.05_viewholder">
                5.05_viewholder
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.06_formatting_strings/TestWeatherContract.java"
               data-name="5.06_formatting_strings"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.06_formatting_strings">
                5.06_formatting_strings
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.07_details_screen/TestWeatherContract.java"
               data-name="5.07_details_screen"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.07_details_screen">
                5.07_details_screen
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.08_images/TestWeatherContract.java"
               data-name="5.08_images"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.08_images">
                5.08_images
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.09_two_pane_ui/TestWeatherContract.java"
               data-name="5.09_two_pane_ui"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.09_two_pane_ui">
                5.09_two_pane_ui
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.10_selected_item/TestWeatherContract.java"
               data-name="5.10_selected_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.10_selected_item">
                5.10_selected_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.11_activated_item/TestWeatherContract.java"
               data-name="5.11_activated_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.11_activated_item">
                5.11_activated_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.12_scroll_position/TestWeatherContract.java"
               data-name="5.12_scroll_position"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.12_scroll_position">
                5.12_scroll_position
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.13_alternative_detail_layout/TestWeatherContract.java"
               data-name="5.13_alternative_detail_layout"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.13_alternative_detail_layout">
                5.13_alternative_detail_layout
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.14_today_item_tablet/TestWeatherContract.java"
               data-name="5.14_today_item_tablet"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.14_today_item_tablet">
                5.14_today_item_tablet
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.15_action_bar/TestWeatherContract.java"
               data-name="5.15_action_bar"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.15_action_bar">
                5.15_action_bar
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.16_settings_action_bar/TestWeatherContract.java"
               data-name="5.16_settings_action_bar"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.16_settings_action_bar">
                5.16_settings_action_bar
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.17_redlines_list_item/TestWeatherContract.java"
               data-name="5.17_redlines_list_item"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.17_redlines_list_item">
                5.17_redlines_list_item
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.18_redlines_finish/TestWeatherContract.java"
               data-name="5.18_redlines_finish"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.18_redlines_finish">
                5.18_redlines_finish
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/5.19_accessibility/TestWeatherContract.java"
               data-name="5.19_accessibility"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="5.19_accessibility">
                5.19_accessibility
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.01_services/TestWeatherContract.java"
               data-name="6.01_services"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.01_services">
                6.01_services
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.02_alarms/TestWeatherContract.java"
               data-name="6.02_alarms"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.02_alarms">
                6.02_alarms
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.03_implement_sync_adapter/TestWeatherContract.java"
               data-name="6.03_implement_sync_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.03_implement_sync_adapter">
                6.03_implement_sync_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.04_finish_sync_adapter/TestWeatherContract.java"
               data-name="6.04_finish_sync_adapter"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.04_finish_sync_adapter">
                6.04_finish_sync_adapter
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.05_scheduled_sync/TestWeatherContract.java"
               data-name="6.05_scheduled_sync"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.05_scheduled_sync">
                6.05_scheduled_sync
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.06_notifications_quiz/TestWeatherContract.java"
               data-name="6.06_notifications_quiz"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.06_notifications_quiz">
                6.06_notifications_quiz
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.07_notifications_answer/TestWeatherContract.java"
               data-name="6.07_notifications_answer"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.07_notifications_answer">
                6.07_notifications_answer
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.08_turn_off_notifications/TestWeatherContract.java"
               data-name="6.08_turn_off_notifications"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.08_turn_off_notifications">
                6.08_turn_off_notifications
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.09_delete_old_data/TestWeatherContract.java"
               data-name="6.09_delete_old_data"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.09_delete_old_data">
                6.09_delete_old_data
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/6.10_update_map_intent/TestWeatherContract.java"
               data-name="6.10_update_map_intent"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="6.10_update_map_intent">
                6.10_update_map_intent
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/initial_commit/TestWeatherContract.java"
               data-name="initial_commit"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="initial_commit">
                initial_commit
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/udacity/Sunshine-Version-2/blob/lesson_4_content_provider_starter_code/TestWeatherContract.java"
               data-name="lesson_4_content_provider_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_4_content_provider_starter_code">
                lesson_4_content_provider_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/lesson_4_starter_code/TestWeatherContract.java"
               data-name="lesson_4_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_4_starter_code">
                lesson_4_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/lesson_6_sync_adapter_starter_code/TestWeatherContract.java"
               data-name="lesson_6_sync_adapter_starter_code"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="lesson_6_sync_adapter_starter_code">
                lesson_6_sync_adapter_starter_code
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/udacity/Sunshine-Version-2/blob/sunshine_master/TestWeatherContract.java"
               data-name="sunshine_master"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="sunshine_master">
                sunshine_master
              </span>
            </a>
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

  <div class="btn-group right">
    <a href="/udacity/Sunshine-Version-2/find/lesson_4_content_provider_starter_code"
          class="js-show-file-finder btn btn-sm empty-icon tooltipped tooltipped-s"
          data-pjax
          data-hotkey="t"
          aria-label="Quickly jump between files">
      <span class="octicon octicon-list-unordered"></span>
    </a>
    <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button tooltipped tooltipped-s" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
  </div>

  <div class="breadcrumb js-zeroclipboard-target">
    <span class="repo-root js-repo-root"><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/udacity/Sunshine-Version-2/tree/lesson_4_content_provider_starter_code" class="" data-branch="lesson_4_content_provider_starter_code" data-pjax="true" itemscope="url"><span itemprop="title">Sunshine-Version-2</span></a></span></span><span class="separator">/</span><strong class="final-path">TestWeatherContract.java</strong>
  </div>
</div>


  <div class="commit file-history-tease">
    <div class="file-history-tease-header">
        <img alt="@ceruleanotter" class="avatar" height="24" src="https://avatars0.githubusercontent.com/u/3414789?v=3&amp;s=48" width="24" />
        <span class="author"><a href="/ceruleanotter" rel="contributor">ceruleanotter</a></span>
        <time datetime="2015-03-04T23:54:47Z" is="relative-time">Mar 4, 2015</time>
        <div class="commit-title">
            <a href="/udacity/Sunshine-Version-2/commit/1578a360189e9e929004894ed3e8f2210b7db8a7" class="message" data-pjax="true" title="Starter code for 4B, the Content Provider Lesson">Starter code for 4B, the Content Provider Lesson</a>
        </div>
    </div>

    <div class="participation">
      <p class="quickstat">
        <a href="#blob_contributors_box" rel="facebox">
          <strong>1</strong>
           contributor
        </a>
      </p>
      
    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="@ceruleanotter" height="24" src="https://avatars0.githubusercontent.com/u/3414789?v=3&amp;s=48" width="24" />
            <a href="/ceruleanotter">ceruleanotter</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file">
  <div class="file-header">
    <div class="file-actions">

      <div class="btn-group">
        <a href="/udacity/Sunshine-Version-2/raw/lesson_4_content_provider_starter_code/TestWeatherContract.java" class="btn btn-sm " id="raw-url">Raw</a>
          <a href="/udacity/Sunshine-Version-2/blame/lesson_4_content_provider_starter_code/TestWeatherContract.java" class="btn btn-sm js-update-url-with-hash">Blame</a>
        <a href="/udacity/Sunshine-Version-2/commits/lesson_4_content_provider_starter_code/TestWeatherContract.java" class="btn btn-sm " rel="nofollow">History</a>
      </div>

        <a class="octicon-btn tooltipped tooltipped-nw"
           href="github-windows://openRepo/https://github.com/udacity/Sunshine-Version-2?branch=lesson_4_content_provider_starter_code&amp;filepath=TestWeatherContract.java"
           aria-label="Open this file in GitHub for Windows"
           data-ga-click="Repository, open with desktop, type:windows">
            <span class="octicon octicon-device-desktop"></span>
        </a>

            <form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/edit/lesson_4_content_provider_starter_code/TestWeatherContract.java" class="inline-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="0vSBx14G+8BLDw0jurr6D6XRE6OLEjKjmh6iImmyULUAot+FygIbnGjk4Tf9DCJvOO68qmMqEqXPdM8L7uOnuw==" /></div>
              <button class="octicon-btn tooltipped tooltipped-n" type="submit" aria-label="Fork this project and edit the file" data-hotkey="e" data-disable-with>
                <span class="octicon octicon-pencil"></span>
              </button>
</form>
          <form accept-charset="UTF-8" action="/udacity/Sunshine-Version-2/delete/lesson_4_content_provider_starter_code/TestWeatherContract.java" class="inline-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="bS/eATFXH1wVFx+kZPPWhZxwDqYTrrjy2wQM/ZbOS4m4fOXtEYFOYWdvu2gSYg3IaqTihsqihPH5oqW1T/D4GQ==" /></div>
            <button class="octicon-btn octicon-btn-danger tooltipped tooltipped-n" type="submit" aria-label="Fork this project and delete this file" data-disable-with>
              <span class="octicon octicon-trashcan"></span>
            </button>
</form>    </div>

    <div class="file-info">
        45 lines (40 sloc)
        <span class="file-info-divider"></span>
      1.956 kB
    </div>
  </div>
  

  <div class="blob-wrapper data type-java">
      <table class="highlight tab-size js-file-line-container" data-tab-size="8">
      <tr>
        <td id="L1" class="blob-num js-line-number" data-line-number="1"></td>
        <td id="LC1" class="blob-code blob-code-inner js-file-line"><span class="pl-c">/*</span></td>
      </tr>
      <tr>
        <td id="L2" class="blob-num js-line-number" data-line-number="2"></td>
        <td id="LC2" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * Copyright (C) 2014 The Android Open Source Project</span></td>
      </tr>
      <tr>
        <td id="L3" class="blob-num js-line-number" data-line-number="3"></td>
        <td id="LC3" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L4" class="blob-num js-line-number" data-line-number="4"></td>
        <td id="LC4" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * Licensed under the Apache License, Version 2.0 (the &quot;License&quot;);</span></td>
      </tr>
      <tr>
        <td id="L5" class="blob-num js-line-number" data-line-number="5"></td>
        <td id="LC5" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * you may not use this file except in compliance with the License.</span></td>
      </tr>
      <tr>
        <td id="L6" class="blob-num js-line-number" data-line-number="6"></td>
        <td id="LC6" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * You may obtain a copy of the License at</span></td>
      </tr>
      <tr>
        <td id="L7" class="blob-num js-line-number" data-line-number="7"></td>
        <td id="LC7" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L8" class="blob-num js-line-number" data-line-number="8"></td>
        <td id="LC8" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *      http://www.apache.org/licenses/LICENSE-2.0</span></td>
      </tr>
      <tr>
        <td id="L9" class="blob-num js-line-number" data-line-number="9"></td>
        <td id="LC9" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> *</span></td>
      </tr>
      <tr>
        <td id="L10" class="blob-num js-line-number" data-line-number="10"></td>
        <td id="LC10" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * Unless required by applicable law or agreed to in writing, software</span></td>
      </tr>
      <tr>
        <td id="L11" class="blob-num js-line-number" data-line-number="11"></td>
        <td id="LC11" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * distributed under the License is distributed on an &quot;AS IS&quot; BASIS,</span></td>
      </tr>
      <tr>
        <td id="L12" class="blob-num js-line-number" data-line-number="12"></td>
        <td id="LC12" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.</span></td>
      </tr>
      <tr>
        <td id="L13" class="blob-num js-line-number" data-line-number="13"></td>
        <td id="LC13" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * See the License for the specific language governing permissions and</span></td>
      </tr>
      <tr>
        <td id="L14" class="blob-num js-line-number" data-line-number="14"></td>
        <td id="LC14" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> * limitations under the License.</span></td>
      </tr>
      <tr>
        <td id="L15" class="blob-num js-line-number" data-line-number="15"></td>
        <td id="LC15" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> */</span></td>
      </tr>
      <tr>
        <td id="L16" class="blob-num js-line-number" data-line-number="16"></td>
        <td id="LC16" class="blob-code blob-code-inner js-file-line"><span class="pl-k">package</span> <span class="pl-smi">com.example.android.sunshine.app.data</span>;</td>
      </tr>
      <tr>
        <td id="L17" class="blob-num js-line-number" data-line-number="17"></td>
        <td id="LC17" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L18" class="blob-num js-line-number" data-line-number="18"></td>
        <td id="LC18" class="blob-code blob-code-inner js-file-line"><span class="pl-k">import</span> <span class="pl-smi">android.test.AndroidTestCase</span>;</td>
      </tr>
      <tr>
        <td id="L19" class="blob-num js-line-number" data-line-number="19"></td>
        <td id="LC19" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L20" class="blob-num js-line-number" data-line-number="20"></td>
        <td id="LC20" class="blob-code blob-code-inner js-file-line"><span class="pl-c">/*</span></td>
      </tr>
      <tr>
        <td id="L21" class="blob-num js-line-number" data-line-number="21"></td>
        <td id="LC21" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    Students: This is NOT a complete test for the WeatherContract --- just for the functions</span></td>
      </tr>
      <tr>
        <td id="L22" class="blob-num js-line-number" data-line-number="22"></td>
        <td id="LC22" class="blob-code blob-code-inner js-file-line"><span class="pl-c">    that we expect you to write.</span></td>
      </tr>
      <tr>
        <td id="L23" class="blob-num js-line-number" data-line-number="23"></td>
        <td id="LC23" class="blob-code blob-code-inner js-file-line"><span class="pl-c"> */</span></td>
      </tr>
      <tr>
        <td id="L24" class="blob-num js-line-number" data-line-number="24"></td>
        <td id="LC24" class="blob-code blob-code-inner js-file-line"><span class="pl-k">public</span> <span class="pl-k">class</span> <span class="pl-en">TestWeatherContract</span> <span class="pl-k">extends</span> <span class="pl-e">AndroidTestCase</span> {</td>
      </tr>
      <tr>
        <td id="L25" class="blob-num js-line-number" data-line-number="25"></td>
        <td id="LC25" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L26" class="blob-num js-line-number" data-line-number="26"></td>
        <td id="LC26" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">// intentionally includes a slash to make sure Uri is getting quoted correctly</span></td>
      </tr>
      <tr>
        <td id="L27" class="blob-num js-line-number" data-line-number="27"></td>
        <td id="LC27" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-smi">String</span> <span class="pl-c1">TEST_WEATHER_LOCATION</span> <span class="pl-k">=</span> <span class="pl-s"><span class="pl-pds">&quot;</span>/North Pole<span class="pl-pds">&quot;</span></span>;</td>
      </tr>
      <tr>
        <td id="L28" class="blob-num js-line-number" data-line-number="28"></td>
        <td id="LC28" class="blob-code blob-code-inner js-file-line">    <span class="pl-k">private</span> <span class="pl-k">static</span> <span class="pl-k">final</span> <span class="pl-k">long</span> <span class="pl-c1">TEST_WEATHER_DATE</span> <span class="pl-k">=</span> <span class="pl-c1">1419033600L</span>;  <span class="pl-c">// December 20th, 2014</span></td>
      </tr>
      <tr>
        <td id="L29" class="blob-num js-line-number" data-line-number="29"></td>
        <td id="LC29" class="blob-code blob-code-inner js-file-line">
</td>
      </tr>
      <tr>
        <td id="L30" class="blob-num js-line-number" data-line-number="30"></td>
        <td id="LC30" class="blob-code blob-code-inner js-file-line">    <span class="pl-c">/*</span></td>
      </tr>
      <tr>
        <td id="L31" class="blob-num js-line-number" data-line-number="31"></td>
        <td id="LC31" class="blob-code blob-code-inner js-file-line"><span class="pl-c">        Students: Uncomment this out to test your weather location function.</span></td>
      </tr>
      <tr>
        <td id="L32" class="blob-num js-line-number" data-line-number="32"></td>
        <td id="LC32" class="blob-code blob-code-inner js-file-line"><span class="pl-c">     */</span></td>
      </tr>
      <tr>
        <td id="L33" class="blob-num js-line-number" data-line-number="33"></td>
        <td id="LC33" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//    public void testBuildWeatherLocation() {</span></td>
      </tr>
      <tr>
        <td id="L34" class="blob-num js-line-number" data-line-number="34"></td>
        <td id="LC34" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        Uri locationUri = WeatherContract.WeatherEntry.buildWeatherLocation(TEST_WEATHER_LOCATION);</span></td>
      </tr>
      <tr>
        <td id="L35" class="blob-num js-line-number" data-line-number="35"></td>
        <td id="LC35" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        assertNotNull(&quot;Error: Null Uri returned.  You must fill-in buildWeatherLocation in &quot; +</span></td>
      </tr>
      <tr>
        <td id="L36" class="blob-num js-line-number" data-line-number="36"></td>
        <td id="LC36" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                        &quot;WeatherContract.&quot;,</span></td>
      </tr>
      <tr>
        <td id="L37" class="blob-num js-line-number" data-line-number="37"></td>
        <td id="LC37" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                locationUri);</span></td>
      </tr>
      <tr>
        <td id="L38" class="blob-num js-line-number" data-line-number="38"></td>
        <td id="LC38" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        assertEquals(&quot;Error: Weather location not properly appended to the end of the Uri&quot;,</span></td>
      </tr>
      <tr>
        <td id="L39" class="blob-num js-line-number" data-line-number="39"></td>
        <td id="LC39" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                TEST_WEATHER_LOCATION, locationUri.getLastPathSegment());</span></td>
      </tr>
      <tr>
        <td id="L40" class="blob-num js-line-number" data-line-number="40"></td>
        <td id="LC40" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//        assertEquals(&quot;Error: Weather location Uri doesn&#39;t match our expected result&quot;,</span></td>
      </tr>
      <tr>
        <td id="L41" class="blob-num js-line-number" data-line-number="41"></td>
        <td id="LC41" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                locationUri.toString(),</span></td>
      </tr>
      <tr>
        <td id="L42" class="blob-num js-line-number" data-line-number="42"></td>
        <td id="LC42" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//                &quot;content://com.example.android.sunshine.app/weather/%2FNorth%20Pole&quot;);</span></td>
      </tr>
      <tr>
        <td id="L43" class="blob-num js-line-number" data-line-number="43"></td>
        <td id="LC43" class="blob-code blob-code-inner js-file-line"><span class="pl-c">//    }</span></td>
      </tr>
      <tr>
        <td id="L44" class="blob-num js-line-number" data-line-number="44"></td>
        <td id="LC44" class="blob-code blob-code-inner js-file-line">}</td>
      </tr>
</table>

  </div>

</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>
        <li><a href="https://help.github.com" data-ga-click="Footer, go to help, text:help">Help</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2015 <span title="0.08624s from github-fe142-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
    </ul>
  </div>
</div>


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-suggester-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder=""></textarea>
      <div class="suggester-container">
        <div class="suggester fullscreen-suggester js-suggester js-navigation-container"></div>
      </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    
    

    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-x flash-close js-ajax-error-dismiss" aria-label="Dismiss error"></a>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-3241a40a58a82e21daef3dd3cdca01bde189158793c1b6f9193fff2b5293cd1d.js"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github/index-f483b0e95017de928e872cb3b5207a7a2731430ac3058767465dd6912cb1d028.js"></script>
      
      
  </body>
</html>

