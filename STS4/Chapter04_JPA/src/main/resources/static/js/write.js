//아이디 중복 체크
$('#id').focusout(function() {
	$('#idDiv').empty();

	if ($('#id').val() == '') {
		$('#idDiv').text('먼저 아이디를 입력하세요')
		$('#idDiv').css('color', 'red');
		$('#idDiv').focus();
	} else {
		$.ajax({
			type: 'post',
			url: '/user/isExistId',
			data: 'id=' + $('#id').val(),
			success: function(data) {
				if (data == 'exist') {
					$('#idDiv').text('사용중인 아이디입니다.');
					$('#idDiv').css('color', 'red');
					$('#id').focus();
					$('#writeBtn').attr('disabled', true);
				} else {
					$('#idDiv').text('사용가능한 아이디입니다.');
					$('#idDiv').css('color', 'blue');
					$('#writeBtn').attr('disabled', false);
				}
			},
			error: function(e) {
				console.log(e)
			}
		})
	}
})

$('#writeBtn').click(function() {
	$.ajax({
		type: 'post',
		url: '/user/write',
		data: $('#writeForm').serialize(),
		success: function() {
			alert('등록 완료');
			location.href = '/user/list';
		},
		error: function(e) {
			console.log(e)
		}
	});
});





