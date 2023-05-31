
$('#deleteBtn').click(function() {
	$('#idDiv').empty();

	if ($('#id').val() == '') {
		$('#idDiv').text('먼저 아이디를 입력하세요')
		$('#id').focus();
	} else {
		$.ajax({
			type: 'post',
			async: false,
			url: '/user/getUser',
			data: 'id=' + $('#id').val(),
			success: function(data) {
				if (data != null) {
					if (confirm('삭제하시겠습니까?')) {
						$.ajax({
							type: 'post',
							async: false,
							url: '/user/delete',
							data: 'id=' + $('#id').val(),
							success: function() {
								alert('삭제되었습니다.')
								location.href = '/';
							}
						})
					}
				} else {
					alert('존재하지 않는 사용자입니다.')
				}
			},
			error: function(e) {
				console.log(e)
			}
		})
	}
})