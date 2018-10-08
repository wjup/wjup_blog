function delText(id,state){
    $.ajax({
        type: 'post',
        url: '/blog/delText',
        data: {
            id:id,
            state:state
        },
        success: function (r) {
            
        }
    })
}