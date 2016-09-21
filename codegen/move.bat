set dir=..
xcopy output\model	%dir%\demo-domain\src\main\java\com\shurrik\demo\model /e
xcopy output\dao	    %dir%\demo-biz\src\main\java\com\shurrik\demo\dao /e
xcopy output\service	%dir%\demo-biz\src\main\java\com\shurrik\demo\service /e
xcopy output\mybatis	%dir%\demo-biz\src\main\resources\mybatis /e
xcopy output\action	%dir%\demo-web\src\main\java\com\shurrik\demo\action /e
xcopy output\view	    %dir%\demo-web\src\main\webapp\WEB-INF\freemarker\views\module /e
PAUSE