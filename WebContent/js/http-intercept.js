$(function () {    
    function getCookieValue(name) {
        var strCookie = document.cookie;
        var arrCookie = strCookie.split(";");
        for (var i = 0; i < arrCookie.length; i++) {
            var c = arrCookie[i].split("=");
            if (c[0].indexOf(name) > -1) {
                return c[1];
            }
        }
        return ''
    }

    if (!getCookieValue('xmheart_token')) {
        var url = 'http://' + window.location.host + '/login.html'
        window.location.replace(url);
    }

    // 在接收到数据后做统一处理
    $(document).ajaxError(function (event, request, settings) {
        if (request.status == 401) {
            var url = 'http://' + window.location.host + '/login.html'
            window.location.replace(url);
        }
    });
});