$(function() {
	$('#updateTable').hide();
});

$('#searchBtn').click(function() {
	$('#idDiv').empty();

	if ($('#id').val() == '') {
		$('#idDiv').text('먼저 아이디를 입력하세요')
		$('#id').focus();
	} else {
		$.ajax({
			type: 'post',
			url: '/user/getUser',
			data: 'id=' + $('#id').val(),
			success: function(data) {
				if (data != null) {
					$('#name').val(data.name);
					$('#pwd').val(data.pwd);
					$('#id').attr('readonly', true);
					$('#updateTable').show();
				} else {
					$('#updateTable').hide();
					alert('존재하지 않는 사용자입니다.')
				}
			},
			error: function(e) {
				console.log(e)
			}
		})
	}
})

$('#updateBtn').click(function() {
	$('#pwdDiv').empty();
	$('#nameDiv').empty();

	if ($('#id').val() == '') {
		$('#idDiv').text('먼저 아이디를 입력하세요')
		$('#id').focus();
	}
	else if ($('#name').val() == '') {
		$('#nameDiv').text('이름을 입력하세요')
		$('#name').focus();
	} else if ($('#pwd').val() == '') {
		$('#pwdDiv').text('비밀번호를 입력하세요')
		$('#pwd').focus();
	} else {
		$.ajax({
			type: 'post',
			url: '/user/write',
			data: $('#updateForm').serialize(),
			success: function() {
				alert('수정 완료');
				location.href = '/user/list';
			},
			error: function(e) {
				console.log(e)
			}
		})
	}
})

$('#cancelBtn').click(function() {
	$("#searchBtn").trigger('click');
})


