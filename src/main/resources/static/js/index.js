function re() {
    window.location.href="/user/toRegister";
}

function notice() {
    $.ajax({
        type: 'post',
        url: '/blog/getNotice',
        success: function (res2) {
            var res = $.parseJSON(res2);
            $('#notice').html(res.notice);
            $('#title').html(res.title);
        }
    })
}

