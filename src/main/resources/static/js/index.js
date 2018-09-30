function re() {
    window.location.href="/user/toRegister";
}
$(document).ready(function () {
    $.ajax({
        type: 'post',
        url: '/bolg/getNotice',
        success: function (res) {
            $('#notice').html(res);
        }
    })
})

