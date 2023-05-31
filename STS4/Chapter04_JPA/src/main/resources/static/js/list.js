$(function() {
	$.ajax({
		type: 'post',
		url: '/user/getUserList',
		success: function(data) {
			//			for (var i = 0; i < data.length; i++) {
			//				var result = `<tr align="center">
			//					<td>${data[i].name}</td>
			//					<td>${data[i].id}</td>
			//					<td>${data[i].pwd}</td>
			//					</tr>`;
			//
			//				$('#listTable').append(result);
			//			}
			$.each(data, function(index, item) {
				var result = `<tr align="center">
					<td>${item.name}</td>
					<td>${item.id}</td>
					<td>${item.pwd}</td>
					</tr>`;

				$('#listTable').append(result);
			})
		},
		error: function(e) {
			console.log(e)
		}
	})
})

//검색
$('#searchBtn').click(function() {
	if ($('#keyword').val() == '') {
		alert('검색어를 입력하세요.');
	} else {
		$.ajax({
			type: 'post',
			url: '/user/search',
			data: $('#searchForm').serialize(),
			success: function(data) {

				$('#listTable tr:gt(0)').remove();

				$.each(data, function(index, item) {
					var result = `<tr align="center">
					<td>${item.name}</td>
					<td>${item.id}</td>
					<td>${item.pwd}</td>
					</tr>`;

					$('#listTable').append(result);
				})
			},
			error: function(e) {
				console.log(e);
			}
		});
	}
});
